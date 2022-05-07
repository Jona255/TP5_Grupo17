package ar.edu.unju.fi.model;

public class Docente {
	private int legajo;
	private String nombres;
	private String apellido;
	private String eMail;
	private String telefono;
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Docente(int legajo, String nombres, String apellido, String eMail, String telefono) {
		super();
		this.legajo = legajo;
		this.nombres = nombres;
		this.apellido = apellido;
		this.eMail = eMail;
		this.telefono = telefono;
	}


	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
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
	
	
}
