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

import ar.edu.unju.fi.util.ListaAlumno;
import ar.edu.unju.fi.model.Alumno;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	private static final Log LOGGER = LogFactory.getLog(AlumnoController.class);
	
	@GetMapping("/nuevo")
	public String getFormNuevoAlumnnoPage(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "nuevo_alumno";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListaAlumnosPage(@ModelAttribute("alumno")Alumno alumno) {
		ModelAndView mav = new ModelAndView("lista_alumnos");
		ListaAlumno listaAlumnos = new ListaAlumno();
		if(listaAlumnos.getListAlumno().add(alumno)) {
			LOGGER.info("Se agregó un objeto al arrayList de alumnos");
		}
		mav.addObject("alumnos", listaAlumnos.getListAlumno());
		return mav;
	}
	
	@GetMapping("/listaAlumnos")
	public ModelAndView getListadoAlumnosPage() {
		
		ModelAndView mav = new ModelAndView("lista_alumnos");
		ListaAlumno listaD = new ListaAlumno();
		mav.addObject("alumnos", listaD.getListAlumno());
		return mav;
	}
	
}
