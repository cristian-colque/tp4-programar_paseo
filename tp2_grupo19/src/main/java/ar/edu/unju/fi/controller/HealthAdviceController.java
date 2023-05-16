package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HealthAdviceController {
	
	/**
	 * Método que captura una petición http en la forma de una URL
	 * @return La página consejos_de_salud
	 */
	@GetMapping("/consejos_de_salud")
	public String getHealthAdvicePage() {
		return "consejos_de_salud";
	}
	
}
