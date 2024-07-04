<%@page import="java.util.List"%>
<%@page import="cl.praxis.model.Habitacion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cl.praxis.business.HabitacionBusiness"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
// Librerias Requeridas
HabitacionBusiness habitacionb = new HabitacionBusiness();
// listado de Habitaciones
List<Habitacion> listaHabitaciones = habitacionb.getHabitaciones();
%>
<form method="post" action="procesa.jsp">
	<!-- Section-->
	<section class="py-5">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row justify-content-center">
				<h1>
					Habitaciones disponibles (<%=listaHabitaciones.size()%>)
				</h1>
				<hr/>
			</div>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
				<%
				for (int x = 0; x < listaHabitaciones.size(); x++) {
				%>
				<div class="col mb-5">
					<div class="card h-100">
						<img class="card-img-top"
							src="<%=listaHabitaciones.get(x).getImagen()%>"
							alt="<%=listaHabitaciones.get(x).getNombre()%>" />
						<div class="card-body p-4">
							<div class="text-center">
								<h5 class="fwbolder"><%=listaHabitaciones.get(x).getNombre()%></h5>

								<p><%=listaHabitaciones.get(x).getDescripcion()%></p>
								CL$

								<%=listaHabitaciones.get(x).getPrecio()%>
							</div>
						</div>
						<input type="radio" id="html" name="idevento"
							value="<%=listaHabitaciones.get(x).getId()%>" checked>
						<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
							<div class="text-center">
								<a class="btn btnoutline-dark mt-auto"
									href="detalle.jsp?idevento=<%=listaHabitaciones.get(x).getId()%>">Ver
									Detalle Habitacion</a>
							</div>
						</div>
					</div>
				</div>
				<%
				}
				%>
			</div>
		</div>
	</section>

	<!-- Formulario -->
	<section>
		<div class="container px-4 px-lg-5 mt-5">
			<h1>Información de Venta</h1>
			<hr />
			<div class="row g-3">
				<div class="col-md-6">
					<label for="inputEmail4" class="formlabel">Nombre</label> <input
						type="text" class="form-control" id="nombre" name="nombre"
						value="Marcelo">
				</div>
				<div class="col-md-6">
					<label for="inputPassword4" class="formlabel">Apellido</label> <input
						type="text" class="form-control" id="apellido" name="apellido"
						value="Salas Melinao">
				</div>
				<div class="col-md-6">
					<label for="inputCity" class="formlabel">Dirección</label> <input
						type="text" class="form-control" id="direccion" name="direccion"
						value="Av. 15 Norte">
				</div>
				<div class="col-md-2">
					<label for="inputZip" class="formlabel">Número</label> <input
						type="text" class="form-control" id="numero" name="numero"
						value="487">
				</div>
				<div class="col-md-4">
					<label for="inputState" class="formlabel">Cantidad de
						Habitaciones</label> <select id="cantidad" name="cantidad" class="form-select">
						<%
						for (int x = 0; x < 5; x++) {
						%>
						<option value="<%=x + 1%>"><%=x + 1%> Habitacion(es)
						</option>
						<%
						}
						%>
					</select>
				</div>
				<div class="col-12">
					<hr />
					<button type="submit" class="btn btnprimary">Enviar
						Solicitud de Compra</button>
				</div>
			</div>
		</div>
	</section>
	<br /> <br />
</form>