package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	/**
	 * Método que captura una petición http en la forma de una URL
	 * @return La página index
	 */
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	
	/**
	 * Método que captura una petición http en la forma de una URL
	 * la petición envía información
	 * @return La página index
	 */
	/*
	 * @GetMapping("/index/{nombre}") public ModelAndView
	 * showMessageOnIndex(@PathVariable(value = "nombre") String nombre) { // Nombre
	 * de la pagina ("index") que devuelve ModelAndView modelAndView = new
	 * ModelAndView("index"); // {nombreCualquiera} usado por thymeleaf en un HTML
	 * modelAndView.addObject("nombreCualquiera", nombre); return modelAndView; }
	 */
		
}
