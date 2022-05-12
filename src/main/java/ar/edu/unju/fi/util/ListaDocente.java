package ar.edu.unju.fi.util;

import java.util.ArrayList;

import ar.edu.unju.fi.model.Docente;

public class ListaDocente {
	
	private ArrayList<Docente> listDocente;
	
	public ListaDocente() {
		listDocente = new ArrayList<Docente>();
		Docente docente1= new Docente(001,"Soledad","Silveyra","silvey@gmail.com","3884000001");
		Docente docente2= new Docente(002,"Ramón","Ortega","ramor@gmail.com","3885000002");
		Docente docente3= new Docente(003,"Jose","Velez","velez@gmail.com","3885000003");
		listDocente.add(docente1);
		listDocente.add(docente2);
		listDocente.add(docente3);
	}

	public ArrayList<Docente> getListDocente() {
		return listDocente;
	}

	public void setListDocente(ArrayList<Docente> listDocente) {
		this.listDocente = listDocente;
	}
	
}
