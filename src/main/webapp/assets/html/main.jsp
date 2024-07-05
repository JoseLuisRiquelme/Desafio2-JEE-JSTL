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

