package ar.edu.unju.fi.model;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Curso {
	@Min (value=1,message="el codigo debe ser mayor e iguala 1")	
	private int codigo;
	@Size (min=3, max=100,message="el titulo debe tener entre 3 y 100 caracteres") 
	@NotEmpty (message="El titulo no puede estar vacio")
	private String titulo;
	@NotBlank (message="la categoria no puede estar vacio")
	private String categoria;
	@NotNull @PastOrPresent 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaInicio;
	@NotNull @FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaFin;
	@Min(value = 1, message = "la cantidad de horas debe ser mayor o igual a 1")
	private int cantidadDeHoras;
	@NotEmpty (message="la modalidad no puede ser vacio")
	private String modalidad;
	@NotNull (message="el docente no puede ser vacio")
	private Docente docente;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int codigo, String titulo, String categoria, LocalDate fechaInicio, LocalDate fechaFin,
			int cantidadDeHoras, String modalidad, Docente docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadDeHoras = cantidadDeHoras;
		this.modalidad = modalidad;
		this.docente = docente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}

	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", categoria=" + categoria + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", cantidadDeHoras=" + cantidadDeHoras + ", modalidad="
				+ modalidad + ", docente=" + docente + "]";
	}
	
	
	
}
