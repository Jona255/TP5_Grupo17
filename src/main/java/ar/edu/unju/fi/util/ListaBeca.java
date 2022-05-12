package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Beca;

public class ListaBeca {
	
	private ArrayList<Beca> listBeca;
	private ListaCurso listC;
		
	public ListaBeca() {
		
		listC=new ListaCurso();
		listBeca = new ArrayList<Beca>();

		Beca beca1=new Beca(1,listC.getListCurso().get(0),LocalDate.parse("2022-03-01"),LocalDate.parse("2020-03-10"),"Cerrado");
		Beca beca2=new Beca(2,listC.getListCurso().get(1),LocalDate.parse("2022-04-01"),LocalDate.parse("2020-04-11"),"Cerrado");
		Beca beca3=new Beca(3,listC.getListCurso().get(2),LocalDate.parse("2022-05-01"),LocalDate.parse("2020-05-12"),"Abierto");
		
		listBeca.add(beca1);
		listBeca.add(beca2);
		listBeca.add(beca3);
	
	}

	public ArrayList<Beca> getListBeca() {
		return listBeca;
	}

	public void setListBeca(ArrayList<Beca> listBeca) {
		this.listBeca = listBeca;
	}

	
	
}
