package ar.edu.unju.fi.model;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Beca {
	
	@Positive @Min (value=1,message="el codigo debe ser mayor e igual a 1")	
	private int codigo;
	@NotNull (message="El curso no puede estar vacio")
	private Curso curso;
	@NotNull @PastOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaInicio;
	@NotNull @FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaCierre;
	@Size (min=3, max=100,message="el estado debe tener entre 3 y 100 caracteres") 
	@NotBlank (message="el estado no puede estar vacio")
	private String estado;
	
	public Beca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beca(int codigo, Curso curso, LocalDate fechaInicio, LocalDate fechaCierre, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Beca [codigo=" + codigo + ", curso=" + curso + ", fechaInicio=" + fechaInicio + ", fechaCierre="
				+ fechaCierre + ", estado=" + estado + "]";
	}

	
}
