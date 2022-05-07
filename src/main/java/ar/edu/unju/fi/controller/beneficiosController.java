package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Docente;

@Controller
public class beneficiosController {

	@GetMapping("/beneficio")
	public String getBeneficiosPage(Model model) {//
		
		Docente unDocente = new Docente(1, "Juan", "Martinez", "JMart@gmail.com", "3885666777");
		//Docente otroDocente = new Docente(2, "Carlos", "Ramirez", "RamaCar@gmail.com", "3884333222");
		
		model.addAttribute("docente",unDocente);
		
		return "beneficios"; 
	}
}