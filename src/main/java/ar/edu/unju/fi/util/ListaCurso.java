package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Curso;


public class ListaCurso {
	
	private ArrayList<Curso> listCurso;
	private ListaDocente listD ;
	
	public ListaCurso() {
		
		listCurso = new ArrayList<Curso>();
		listD = new ListaDocente();
		
		Curso curso1= new Curso(1,"Inteligencia Artificial", "Básico",LocalDate.parse("2022-03-09"), LocalDate.parse("2022-05-10"), 100, "Virtual",listD.getListDocente().get(0));
		Curso curso2= new Curso(2,"Desarrollo de Videojuegos", "Intermedio",LocalDate.parse("2022-04-10"), LocalDate.parse("2022-06-15"), 200, "Virtual", listD.getListDocente().get(1));
		Curso curso3= new Curso(3,"Robótica", "Avanzado",LocalDate.parse("2022-05-05"), LocalDate.parse("2022-07-11"), 300, "Precencial", listD.getListDocente().get(2));
		
		listCurso.add(curso1);
		listCurso.add(curso2);
		listCurso.add(curso3);
	}

	public ArrayList<Curso> getListCurso() {
		return listCurso;
	}

	public void setListCurso(ArrayList<Curso> listCurso) {
		this.listCurso = listCurso;
	}

	
}
