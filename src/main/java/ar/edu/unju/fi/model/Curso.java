package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Curso {
	private int codigo;
	private String titulo;
	private String categoria;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int cantidadDeHoras;
	private String modalidad;
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

	
}
