<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de estudiantes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<%@ include file="assets/html/head.jsp"%>
		
			<%@ include file="assets/html/nav.jsp"%>
			<jsp:include page="assets/html/header.jsp"></jsp:include>
			<div class="container custom-margin">
				<div class="container">
					<h2>Detalle Solicitud Habitacion: ${habitacion.getNombre()}</h2>
				</div>
				<table class="table ">
					<thead class="table-ligth">
						<tr>
							<th>#</th>
							<th>Item</th>
							<th>Valor</th>
						</tr>
					<tbody>
						<tr>
							<th>1</th>
							<td>Nombre</td>
							<td>${hospedante.nombre}</td>
						</tr>
						<tr>
							<th>2</th>
							<td>Apellido</td>
							<td>${hospedante.apellido}</td>
						</tr>
						<tr>
							<th>3</th>
							<td>Email</td>
							<td>${hospedante.email}</td>
						</tr>
						<tr>
							<th>4</th>
							<td>Medio Pago</td>
							<td>${hospedante.medioPago}</td>
						</tr>
						<tr>
							<th>5</th>
							<td>Dia(s)</td>
							<td>${hospedante.dias}</td>
						</tr>
						<tr>
							<th>6</th>
							<td>Fecha Ingreso</td>
							<td>${hospedante.fechaIngreso}</td>
						</tr>
						<tr>
							<th>7</th>
							<td>Valor a Pagar</td>
							<td><strong>CL$ </strong> ${aPagar}</td>
						</tr>

					</tbody>
				</table>
			</div>

			<jsp:include page="assets/html/footer.jsp"></jsp:include>
			
		</div>
</body>
</html>