package cl.praxis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.Hospedante;


@WebServlet("/HabitacionBusinessServlet")
public class HabitacionBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HabitacionBusinessServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String medioPago = request.getParameter("pay");
		int dias = Integer.parseInt(request.getParameter("days"));
		String fechaIngreso = request.getParameter("date");
		
		Hospedante hospedante = new Hospedante(nombre,apellido,email,medioPago,dias,fechaIngreso);
		request.setAttribute("hospedante", hospedante);
		
		
		/*response.getWriter().print(nombreHospedante);
		response.getWriter().print(apellidoHospedante);
		response.getWriter().print(emailHospedante);
		response.getWriter().print(medioPagoHospedante);
		response.getWriter().print(diasHospedante);
		response.getWriter().print(fechaIngresoHospedante);*/
	
		
		request.getRequestDispatcher("proceso.jsp").forward(request, response);
		
	}


}