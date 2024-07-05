package cl.praxis.model;

public class Hospedante {

	private String nombre;
	private String apellido;
	private String email;
	private String medioPago;
	private int dias;
	private String fechaIngreso;

	public Hospedante() {
		super();

	}

	public Hospedante(String nombre, String apellido, String email, String medioPago, int dias, String fechaIngreso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.medioPago = medioPago;
		this.dias = dias;
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
