package ar.edu.unju.fi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.util.ListaDocente;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	
	private static final Log LOGGER = LogFactory.getLog(DocenteController.class);
	
	@GetMapping("/nuevo")
	public String getAltaDocentePage(Model model) {
		
		Docente nuevoDocente=new Docente();
		model.addAttribute("docente", nuevoDocente);
		return "nuevo_docente";
	}
	
	
	@PostMapping("/guardar")
	public ModelAndView getGuardarDocentePage(@ModelAttribute("docente")Docente docente) {
		
		ModelAndView mav = new ModelAndView("lista_docentes");		
		ListaDocente listaDocentes = new ListaDocente();
		if(listaDocentes.getListDocente().add(docente)) {
			LOGGER.info("Se agregó un objeto al arrayList de docentes");
		}
		mav.addObject("docentes", listaDocentes.getListDocente());
		return mav;
	}
	
	@GetMapping("/listaDocentes")
	public ModelAndView getListadoDocentesPage() {
		
		ModelAndView mav = new ModelAndView("lista_docentes");
		ListaDocente listaD = new ListaDocente();
		mav.addObject("docentes", listaD.getListDocente());
		return mav;
	}
	
}
