<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="cl.praxis.model.Habitacion"%>
<%@page import="cl.praxis.business.HabitacionBusiness"%>
<%
//Recepcion valores dede request
int idHabitacion = Integer.parseInt(request.getParameter("idhabitacion"));
//Librerias requeridas
HabitacionBusiness habitacionb = new HabitacionBusiness();
//Crea Evento
Habitacion habitacion = new Habitacion();
habitacion.setId(idHabitacion);
//Busca evento
habitacion = habitacionb.getHabitacionByID(habitacion);
%>
<!DOCTYPE html>
<html lang="es">
<%@include file="./head.jsp"%>
<body>
	<%@include file="./header.jsp"%>
	<form method="post" action="procesa.jsp">
		<!-- Section-->
		<section class="py-5">
			<div class="container px-4 px-lg-5 mt-5">
				<div class="row justify-content-center">
					<h1>
						Mapa Habitacion: <strong><%=habitacion.getNombre()%></strong>
					</h1>
					<hr />
				</div>
			</div>
			<div class="container px-4 px-lg-5 mt-5">
				<iframe src="<%habitacion.getMapa();%>" width="100%" height="900"
					style="border: 0;" allowfullscreen="" loading="lazy"
					referrerpolicy="no-referrer-whendowngrade"></iframe>
			</div>
		</section>
		<br /> <br />
	</form>
	<%@include file="./footer.jsp"%>
</body>
</html>