package cl.praxis.business;

import java.util.ArrayList;
import java.util.List;
import cl.praxis.model.*;

public class HabitacionBusiness {
	
	/**
	 * -----------------------------------------------------------------
	---------------------------
	 * Método setea y obtiene las habitaciones existentes en una lista de
	objetos de tipo
	 * habitacion
	 *
	 * @param -
	 * @return List<Habitacion>
	 * @author: Autor <jlrsaez@gmail.com>
	 * @version: 02/07/2024
	 */

	public List<Habitacion> getHabitaciones() {
		// Inicializacion de lista de habitaciones
		ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
		// Info Habitacion 1
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setId(1);
		habitacion1.setNombre("Habitacion 1, Simple");
		habitacion1.setDescripcion("Habitacion Clasica concama extra grande,  vista al oceano y balcon");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(1000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");
		
		// Info Habitacion 2
		Habitacion habitacion2 = new Habitacion();
		habitacion1.setId(2);
		habitacion1.setNombre("Habitacion 2, Doble - Simple");
		habitacion1.setDescripcion("Habitacion Clasica con s camas  grandes o dobles,  vista al oceano y balcon");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(2000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

	
		// Info Habitacion 3
		Habitacion habitacion3 = new Habitacion();
		habitacion1.setId(3);
		habitacion1.setNombre("Habitacion 3, Doble Normal");
		habitacion1.setDescripcion("Habitacion superior en planta alta con vsta al iceano y 2 camas dobles");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(10000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 4
		Habitacion habitacion4 = new Habitacion();
		habitacion1.setId(4);
		habitacion1.setNombre("HAbitacion 4, Doble King");
		habitacion1.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(4000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 5
		Habitacion habitacion5 = new Habitacion();
		habitacion1.setId(5);
		habitacion1.setNombre("Habitacion 5, Doble - King");
		habitacion1.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(5000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 6
		Habitacion habitacion6 = new Habitacion();
		habitacion1.setId(6);
		habitacion1.setNombre("Habitacion 6, Doble - King");
		habitacion1.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(10000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 7
		Habitacion habitacion7 = new Habitacion();
		habitacion1.setId(7);
		habitacion1.setNombre("Habitacion 7, Doble - King");
		habitacion1.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(10000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 8
		Habitacion habitacion8 = new Habitacion();
		habitacion1.setId(8);
		habitacion1.setNombre("Habitacion 8, Doble - King");
		habitacion1.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion1.setImagen(
				"https://media.gettyimages.com/photos/kirk-hammettlars-ulrich-james-hetfield-and-robert-trujillo-from-at-pictureid130699422?s=2048x2048");
		habitacion1.setPrecio(10000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");
		// Agrega Habitaciones a lista
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		habitaciones.add(habitacion4);
		habitaciones.add(habitacion5);
		habitaciones.add(habitacion6);
		habitaciones.add(habitacion7);
		habitaciones.add(habitacion8);
		
		// Retorno de lista dhabitaciones
		return habitaciones;
	}
	
	/**
	 * -----------------------------------------------------------------
	 *  Método que entrega el objeto habitacion segun el id
	 * de busqueda
	 *
	 * @param Habitacion habitacion
	 * @return Habitacion habitacion
	 * @author: Autor <jlrsaez@gmail.com> *
	 *  @version: 02/07/2024
	 */
	public Habitacion getHabitacionByID(Habitacion habitacion) {
		List<Habitacion> listaHabitaciones = getHabitaciones();
		for (int x = 0; x < listaHabitaciones.size(); x++) {
			if (listaHabitaciones.get(x).getId() == habitacion.getId()) {
				habitacion = listaHabitaciones.get(x);
			}
		}
		// Retorno la Habitacion
		return habitacion;
	}

	/**
	 * -----------------------------------------------------------------
	 *  Método retorna el valor a pagar de una reserva
	 * segun el valor y cantidad de habitaciones
	 *
	 * @param int precio, int habitaciones
	 * @return int valor
	 * @author: Autor <jlrsaez@gmail.com>
	 * @version: 02/07/2024
	 */
	public int calculaValorCompra(int precio, int habitaciones) {
		int valor = precio * habitaciones;
		return valor;
	}

}
