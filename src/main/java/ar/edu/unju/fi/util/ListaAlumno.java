package ar.edu.unju.fi.util;

import java.util.ArrayList;
import ar.edu.unju.fi.model.Alumno;

public class ListaAlumno {
	
	private ArrayList<Alumno> listAlumno;
	
	
	public ListaAlumno(){
		listAlumno = new ArrayList<Alumno>();
		Alumno alumno1=new Alumno(11111111, "Brad", "Pitt","pitt@gmail.com","3884111111");
		Alumno alumno2=new Alumno(22222222, "Jacky", "Chan","jacky@gmail.com","3884222222");
		Alumno alumno3=new Alumno(33333333, "Tom", "Hanks","hanks@gmail.com","3884333333");
		listAlumno.add(alumno1);
		listAlumno.add(alumno2);
		listAlumno.add(alumno3);
	}


	public ArrayList<Alumno> getListAlumno() {
		return listAlumno;
	}


	public void setListAlumno(ArrayList<Alumno> listAlumno) {
		this.listAlumno = listAlumno;
	}

	
}
