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
<main>
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
				
				
				    
				   habitacionb.devuelve(listaHabitaciones);
				
				
						 %>
				<%
				for (Habitacion habitacion: listaHabitaciones) {
					
				%>
				
				<div class="col mb-5">
					<div class="card h-100">
					 <!--Room image-->
						<img class="card-img-top"
							src="<%=habitacion.getImagen()%>"
							alt="<%=habitacion.getNombre()%>" />
							<!-- Room details-->
						<div class="card-body p-4">
							<div class="text-center">
							<!-- Room name-->
								<h5 class="fwbolder"><%=habitacion.getNombre()%></h5>

								<p><%=habitacion.getDescripcion()%></p>
								<!-- Room price-->
								CL$

								<%=habitacion.getPrecio()%>
							</div>
						</div>
						<!-- Room actions-->
						<input type="radio" id="html" name="idhabitacion"
							value="<%=habitacion.getId()%>" checked>
						<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
							<div class="text-center">
								<a class="btn btnoutline-dark mt-auto"
									href="detalle.jsp?idhabitacion=<%=habitacion.getId()%>">Ver
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
</main>