package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.lists.ProductList;
import ar.edu.unju.fi.model.Product;

@Controller
@RequestMapping("/productos")
public class ProductListController {
	
	ProductList listaProductos = new ProductList();

	/**
	 * Método que captura una petición http en la forma de una URL
	 * @return La página productos
	 */	
	@GetMapping("/listado") // Se muestra en la barra de navegación
	public String getProductListPage(Model model) {
		model.addAttribute(
			"listaProductos",
			listaProductos.getProductos()
		);
		return "productos"; // Página que se va a renderizar
	}

	@GetMapping("/nuevo") // Se muestra en la barra de navegación
	public String getNewProductpage(Model model) {
		// Usando model Lo estamos preparando para que lleve algo al formulario
		model.addAttribute(
			"producto", 
			new Product()
		);
		return "nuevo_producto"; // Página que se va a renderizar
	}

	/**
	 * @ModelAttribute producto es un objeto de tipo Producto usado en el campo
	 * th:object dentro de nuevo_producto
	 * @param product Todo lo trasferido del formulario estara dentro de este objeto
	 * @return
	 */
	@PostMapping("/guardar")
	public ModelAndView getSaveNewProduct(@ModelAttribute("producto") Product product) {
		// productos = nombre de la pagina
		ModelAndView modelView = new ModelAndView("productos");
		// Debo guardar el objeto en el arrayList
		listaProductos.getProductos().add(product);
		// Envio de nuevo el arrayList de objetos para que sea renderizada por productos (html)
		modelView.addObject("listaProductos", listaProductos.getProductos());
		return modelView;
	}
}
