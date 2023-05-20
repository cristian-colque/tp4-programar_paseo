package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.lists.WalkerList;

@Controller
@RequestMapping("/")
public class WalkingServiceController {
	
	WalkerList listaPaseadores = new WalkerList();
	
	/**
	 * Método que captura una petición http en la forma de una URL
	 * @return La página servicio_de_paseos
	 */
	@GetMapping("/servicio_de_paseos")
	public String getWalkingServicePage(Model model) {
		model.addAttribute("paseadores", listaPaseadores.getPaseadores());
		return "servicio_de_paseos";
	}

}
