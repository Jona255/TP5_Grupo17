package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Beca {
	private int código;
	private Curso curso; 
	private LocalDate fechaInicio;
	private LocalDate fechaCierre;
	private String estado;
	
	public Beca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beca(int código, Curso curso, LocalDate fechaInicio, LocalDate fechaCierre, String estado) {
		super();
		this.código = código;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.estado = estado;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
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
	
	

}
