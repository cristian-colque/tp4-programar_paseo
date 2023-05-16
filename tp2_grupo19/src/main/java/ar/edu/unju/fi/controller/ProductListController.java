package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductListController {
	
	/**
	 * Método que captura una petición http en la forma de una URL
	 * @return La página productos
	 */	
	@GetMapping("/productos")
	public String getProductListPage() {
		return "productos";
	}
}
