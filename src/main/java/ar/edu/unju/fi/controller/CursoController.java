package ar.edu.unju.fi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unju.fi.model.Curso;
import ar.edu.unju.fi.util.ListaCurso;
import ar.edu.unju.fi.util.ListaDocente;

@Controller
@RequestMapping("/curso")
public class CursoController {
	private static final Log LOGGER = LogFactory.getLog(CursoController.class);
	
	@GetMapping("/nuevo")
	public String getFormNuevoCursoPage(Model model) {
		model.addAttribute("curso", new Curso());
		model.addAttribute("unDocente", new ListaDocente().getListDocente()); 
		return "nuevo_curso";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListaCursosPage(@Validated @ModelAttribute("curso")Curso curso, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			ModelAndView mav= new ModelAndView ("nuevo_curso");
			mav.addObject("curso", curso);
			return mav;
		}
		ModelAndView mav = new ModelAndView("lista_cursos");
		ListaCurso listaCursos = new ListaCurso();
		if(listaCursos.getListCurso().add(curso)) {
			LOGGER.info("Se agregó un objeto al arrayList de cursos");
		}
		mav.addObject("cursos", listaCursos.getListCurso());
		return mav;
	}
	
	@GetMapping("/listaCursos")
	public ModelAndView getListadoCursosPage() {
		
		ModelAndView mav = new ModelAndView("lista_cursos");
		ListaCurso listaC = new ListaCurso();
		mav.addObject("cursos", listaC.getListCurso());
		return mav;
	}
	
}
