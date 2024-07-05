package cl.praxis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.business.HabitacionBusiness;
import cl.praxis.model.Habitacion;
import cl.praxis.model.Hospedante;

@WebServlet("/HabitacionBusinessServlet")
public class HabitacionBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HabitacionBusinessServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String medioPago = request.getParameter("pay");
		int dias = Integer.parseInt(request.getParameter("days"));
		String fechaIngreso = request.getParameter("date");
		int id = Integer.parseInt(request.getParameter("idhabitacion"));
		HabitacionBusiness habitacionBusiness = new HabitacionBusiness();
		Habitacion habitacion = habitacionBusiness.getHabitacionByID(id);

		int precio = habitacion.getPrecio();
		int aPagar = habitacionBusiness.calculaValorCompra(precio, dias);
		Hospedante hospedante = new Hospedante(nombre, apellido, email, medioPago, dias, fechaIngreso);

		request.setAttribute("hospedante", hospedante);
		request.setAttribute("habitacion", habitacion);
		request.setAttribute("aPagar", aPagar);

		request.getRequestDispatcher("proceso.jsp").forward(request, response);

	}

}
