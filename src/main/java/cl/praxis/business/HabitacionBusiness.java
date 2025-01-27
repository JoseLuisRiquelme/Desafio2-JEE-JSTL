package cl.praxis.business;

import java.util.ArrayList;
import java.util.List;
import cl.praxis.model.*;

public class HabitacionBusiness {

	/**
	 * -----------------------------------------------------------------
	 * --------------------------- Método setea y obtiene las habitaciones
	 * existentes en una lista de objetos de tipo habitacion
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
				"https://images.pexels.com/photos/164595/pexels-photo-164595.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		habitacion1.setPrecio(100000);
		habitacion1.setHabitaciones(3);
		habitacion1.setMetraje(100);
		habitacion1.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 2
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setId(2);
		habitacion2.setNombre("Habitacion 2, Doble - Simple");
		habitacion2.setDescripcion("Habitacion Clasica con 2 camas  grandes o dobles,  vista al oceano y balcon");
		habitacion2.setImagen(
				"https://images.pexels.com/photos/262048/pexels-photo-262048.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		habitacion2.setPrecio(800000);
		habitacion2.setHabitaciones(3);
		habitacion2.setMetraje(100);
		habitacion2.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 3
		Habitacion habitacion3 = new Habitacion();
		habitacion3.setId(3);
		habitacion3.setNombre("Habitacion 3, Doble Normal");
		habitacion3.setDescripcion("Habitacion superior en planta alta con vsta al iceano y 2 camas dobles");
		habitacion3.setImagen(
				"https://images.pexels.com/photos/271624/pexels-photo-271624.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		habitacion3.setPrecio(700000);
		habitacion3.setHabitaciones(3);
		habitacion3.setMetraje(100);
		habitacion3.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 4
		Habitacion habitacion4 = new Habitacion();
		habitacion4.setId(4);
		habitacion4.setNombre("Habitacion 4, Doble King");
		habitacion4.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion4.setImagen("https://images.pexels.com/photos/237371/pexels-photo-237371.jpeg");
		habitacion4.setPrecio(900000);
		habitacion4.setHabitaciones(3);
		habitacion4.setMetraje(100);
		habitacion4.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 5
		Habitacion habitacion5 = new Habitacion();
		habitacion5.setId(5);
		habitacion5.setNombre("Habitacion 5, Doble - King");
		habitacion5.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion5.setImagen(
				"https://images.pexels.com/photos/1579253/pexels-photo-1579253.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		habitacion5.setPrecio(500000);
		habitacion5.setHabitaciones(3);
		habitacion5.setMetraje(100);
		habitacion5.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 6
		Habitacion habitacion6 = new Habitacion();
		habitacion6.setId(6);
		habitacion6.setNombre("Habitacion 6, Doble - King");
		habitacion6.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion6.setImagen("https://images.pexels.com/photos/210265/pexels-photo-210265.jpeg");
		habitacion6.setPrecio(300000);
		habitacion6.setHabitaciones(3);
		habitacion6.setMetraje(100);
		habitacion6.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 7
		Habitacion habitacion7 = new Habitacion();
		habitacion7.setId(7);
		habitacion7.setNombre("Habitacion 7, Doble - King");
		habitacion7.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion7.setImagen(
				"https://images.pexels.com/photos/97083/pexels-photo-97083.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		habitacion7.setPrecio(600000);
		habitacion7.setHabitaciones(3);
		habitacion7.setMetraje(100);
		habitacion7.setMapa(

				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Habitacion 8
		Habitacion habitacion8 = new Habitacion();
		habitacion8.setId(8);
		habitacion8.setNombre("Habitacion 8, Doble - King");
		habitacion8.setDescripcion("Suite executive en planta superiorcon cama extragrande y vistas al ocean");
		habitacion8.setImagen(
				"https://images.pexels.com/photos/1838554/pexels-photo-1838554.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		habitacion8.setPrecio(1000000);
		habitacion8.setHabitaciones(3);
		habitacion8.setMetraje(100);
		habitacion8.setMapa(

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
	 * ----------------------------------------------------------------- Método que
	 * entrega el objeto habitacion segun el id de busqueda
	 *
	 * @param Habitacion habitacion
	 * @return Habitacion habitacion
	 * @author: Autor <jlrsaez@gmail.com> *
	 * @version: 02/07/2024
	 */
	public Habitacion getHabitacionByID(int id) {
		Habitacion habitacion = new Habitacion();
		List<Habitacion> listaHabitaciones = getHabitaciones();
		for (int x = 0; x < listaHabitaciones.size(); x++) {
			if (listaHabitaciones.get(x).getId() == id) {
				habitacion = listaHabitaciones.get(x);
			}
		}
		// Retorno la Habitacion
		return habitacion;
	}

	/**
	 * ----------------------------------------------------------------- Método
	 * retorna el valor a pagar de una reserva segun el valor y cantidad de
	 * habitaciones
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

	@Override
	public String toString() {
		return "HabitacionBusiness [getHabitaciones()=" + getHabitaciones() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void devuelve(List<Habitacion> listaHabitaciones) {

		for (Habitacion habitacion : listaHabitaciones) {
			System.out.println(habitacion.toString());
		}
	}

}
