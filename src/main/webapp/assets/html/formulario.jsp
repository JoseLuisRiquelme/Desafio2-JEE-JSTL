<%@ page import="java.time.LocalDate" %>
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


	
<form method="post" action="HabitacionBusinessServlet">
<!-- Section main-->
<main>
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

<!-- Form -->
	<section>
		<div class="container px-4 px-lg-5 mt-5">
			<h1>Información de Reserva Habitacion</h1>
			<hr />
			<div class="row g-3">
				<div class="col-md-6">
					<label for="inputName" class="formlabel">Nombre</label> 
					<input
						type="text" class="form-control" id="nombre" name="nombre"
						value="Arturo Erasmo">
				</div>
				<div class="col-md-6">
					<label for="inputLastName" class="formlabel">Apellido</label>
					 <input
						type="text" class="form-control" id="apellido" name="apellido"
						value="Vidal Pardo">
				</div>
				<div class="col-md-6">
					<label for="inputEmail" class="formlabel">Email</label> 
					<input
						type="email" class="form-control" id="email" name="email"
						value="arturo.vidal@anfp.cl">
				</div>
				<div class="col-md-4">
					<label for="inputPay" class="formlabel">Medio de pago</label> 
					<select id="pay" 
					name="pay" class="form-select">
						
						<option value="Contado"> Contado
						</option>
						<option value="Debito"> Debito
						</option>
						<option value="Credito"> Credito
						</option>
					</select>
				</div>
				<div class="col-md-4">
					<label for="inpuSays" class="formlabel">Dias</label> 
					<select id="days" 
					name="days" class="form-select">
						
						<option value="1">1 dia
						</option>
						<option value="2">2 dias
						</option>
						<option value="3">3 dias
						</option>
						<option value="4">4 dias
						</option>
						<option value="5">5 dias
						</option>
						<option value="6">6 dias
						</option>
						<option value="7">7 dias
						</option>
						<option value="8">8 dias
						</option>
						<option value="9">9 dias
						</option>
						<option value="10">10 dias
						
					</select>
				</div>
				<div class="col-md-6">
					<label for="date" class="formlabel">Fecha Entrada</label> <input
						type="date" class="form-control" id="date" name="date"
						value="<%=LocalDate.now() %>">
				</div>
				<div class="col-12">
					<hr />
					<button type="submit" class="btn btn-primary">Enviar
						Solicitud de Compra</button>
				</div>
			</div>
		</div>
	</section>
	<br /> <br />
</form>

