<%@ page import="java.time.LocalDate" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	<!-- Form -->
<form method="post" action="procesa.jsp">
	<section>
		<div class="container px-4 px-lg-5 mt-5">
			<h1>Información de Reserva Habitacion</h1>
			<hr />
			<div class="row g-3">
				<div class="col-md-6">
					<label for="inputName" class="formlabel">Nombre</label> <input
						type="text" class="form-control" id="nombre" name="nombre"
						value="Arturo Erasmo">
				</div>
				<div class="col-md-6">
					<label for="inputLastName" class="formlabel">Apellido</label> <input
						type="text" class="form-control" id="apellido" name="apellido"
						value="Vidal Pardo">
				</div>
				<div class="col-md-6">
					<label for="inputEmail" class="formlabel">Email</label> <input
						type="email" class="form-control" id="email" name="email"
						value="arturo.vidal@anfp.cl">
				</div>
				<div class="col-md-4">
					<label for="inputPay" class="formlabel">Medio de pago</label> 
					<select id="pay" 
					name=pay" class="form-select">
						
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
					name=days" class="form-select">
						
						<option value="1">1 dia(s)
						</option>
						<option value="2">2 dia(s)
						</option>
						<option value="3">3 dia(s)
						</option>
						<option value="4">4 dia(s)
						</option>
						<option value="5">5 dia(s)
						</option>
						<option value="6">6 dia(s)
						</option>
						<option value="1">1 semana(s)
						<option value="2">2 semana(s)
						<option value="3">3 semana(s)
						<option value="1">4 mes(s)
						</option>
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

