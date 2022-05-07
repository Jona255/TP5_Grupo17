package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class IndexController {
	
	@GetMapping("/home")
	public String getIndexPage(Model model) {//
		
		return "index"; 
	}

}
