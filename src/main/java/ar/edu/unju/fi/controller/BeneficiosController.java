package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.util.ListaAlumno;
import ar.edu.unju.fi.util.ListaBeca;

@Controller
public class BeneficiosController {

	@GetMapping("/beneficio")
	public String getBeneficiosPage(Model model) {//
		
		ListaBeca listaB=new ListaBeca();
		model.addAttribute("Becas",listaB.getListBeca());
		
		ListaAlumno listaA=new ListaAlumno();
		model.addAttribute("Alumnos",listaA.getListAlumno());
		
		return "beneficios"; 
	}
}