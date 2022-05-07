package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Curso {
	private int código;
	private String título;
	private int categoría;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int cantidadDeHoras;
	private String modalidad;
	private Docente docente;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int código, String título, int categoría, LocalDate fechaInicio, LocalDate fechaFin,
			int cantidadDeHoras, String modalidad, Docente docente) {
		super();
		this.código = código;
		this.título = título;
		this.categoría = categoría;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadDeHoras = cantidadDeHoras;
		this.modalidad = modalidad;
		this.docente = docente;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public int getCategoría() {
		return categoría;
	}

	public void setCategoría(int categoría) {
		this.categoría = categoría;
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
