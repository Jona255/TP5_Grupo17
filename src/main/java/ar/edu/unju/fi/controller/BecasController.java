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


import ar.edu.unju.fi.model.Beca;
import ar.edu.unju.fi.util.ListaBeca;
import ar.edu.unju.fi.util.ListaCurso;

@Controller
@RequestMapping("/beca")
public class BecasController {
	private static final Log LOGGER = LogFactory.getLog(BecasController.class);
		
	@GetMapping("/nuevo")
	public String getFormNuevoBecaPage(Model model) {
		model.addAttribute("beca", new Beca());
		model.addAttribute("unCurso", new ListaCurso().getListCurso()); 		
		return "nueva_beca";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListaBecasPage(@Validated @ModelAttribute("beca")Beca beca, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			ModelAndView mav= new ModelAndView ("nueva_beca");
			mav.addObject("beca", beca);
			return mav;
		}
		ModelAndView mav = new ModelAndView("lista_becas");
		ListaBeca listaBecas = new ListaBeca();
		if(listaBecas.getListBeca().add(beca)) {
			LOGGER.info("Se agregó un objeto al arrayList de becas");
		}
		mav.addObject("becas", listaBecas.getListBeca());
		return mav;
	}
	
	@GetMapping("/listaBecas")
	public ModelAndView getListadoBecasPage() {
		
		ModelAndView mav = new ModelAndView("lista_becas");
		ListaBeca listaC = new ListaBeca();
		mav.addObject("becas", listaC.getListBeca());
		return mav;
	}

}
