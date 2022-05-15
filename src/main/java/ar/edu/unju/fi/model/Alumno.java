package ar.edu.unju.fi.model;

public class Alumno {
	private int dni;
	private String nombres;
	private String apellido;
	private String eMail;
	private String telefono;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(int dni, String nombres, String apellido, String eMail, String telefono) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellido = apellido;
		this.eMail = eMail;
		this.telefono = telefono;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombres=" + nombres + ", apellido=" + apellido + ", eMail=" + eMail
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}
