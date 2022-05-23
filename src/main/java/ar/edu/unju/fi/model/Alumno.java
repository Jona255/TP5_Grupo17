package ar.edu.unju.fi.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Alumno {
	
	@Positive @Min (value=1000000,message="el dni debe ser mayor e igual a 1000000")	
	private int dni;
	@Size (min=3, max=100,message="el nombre debe tener entre 3 y 100 caracteres") 
	@NotEmpty (message="Elnombre nopuede estar vacio")
	private String nombres;
	@NotBlank (message="el apellido no puede estar vacio")
	private String apellido;
	@NotEmpty @Email
	private String eMail;
	@NotEmpty (message="el telefono no puede ser vacio")
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
