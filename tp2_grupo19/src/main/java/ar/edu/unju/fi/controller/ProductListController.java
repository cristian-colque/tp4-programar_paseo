package ar.edu.unju.fi.controller;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

		model.addAttribute(
			"listaCategorias",
			listaProductos.getCategorias()
			);

		// Retorna la vista (página) que se va a renderizar (redirección)
		return "productos";
	}

	@GetMapping("/nuevo") // Se muestra en la barra de navegación
	public String getNewProductPage(Model model) {
		
		// Variable que permite la edición de un Producto
		boolean accederEdicion = false;

		// Usando model Lo estamos preparando para que lleve algo al formulario
		// Enviamos un "producto" de tipo Product
		model.addAttribute(
			"producto", 
			new Product()
		);
		model.addAttribute(
			"editar",
			accederEdicion
		);

		// Retorna la vista (página) que se va a renderizar (redirección)
		return "nuevo_producto";
	}

	/**
	 * @ModelAttribute producto es un objeto de tipo Producto usado en el campo
	 * th:object dentro de nuevo_producto
	 * @param product Todo lo trasferido del formulario estara dentro de este objeto
	 * @return
	 */
	@PostMapping("/guardar")
	public ModelAndView getSaveProduct(@ModelAttribute("producto") Product product) {
		
		// productos = nombre de la pagina
		ModelAndView modelAndView = new ModelAndView("productos");
		
		// Debo guardar el objeto en el arrayList <<< ModelAttribute
		listaProductos.getProductos().add(product);
		
		// Envio de nuevo el arrayList de objetos para que sea renderizada por productos (html)
		
		modelAndView.addObject(
			"listaProductos",
			listaProductos.getProductos()
		);

		modelAndView.addObject(
			"listaCategorias",
			listaProductos.getCategorias()
		);
		
		return modelAndView;
	}

	@GetMapping("/modificar/{codigo}")
	public String getModifyProductPage(
		Model model,
		@PathVariable(value = "codigo") short codigoProducto
	) {
		
		Product productoEncontrado = new Product();
		boolean accederEdicion = true;

		for(Product producto: listaProductos.getProductos()) {
			if (producto.getCodigo() == codigoProducto) {
				productoEncontrado = producto;
				break;
			}
		}

		model.addAttribute("producto", productoEncontrado);
		model.addAttribute("editar", accederEdicion);

		// Vista
		return "nuevo_producto";
	}

	@PostMapping("/modificar")
	public String modifyProduct(
		@ModelAttribute(value = "producto") Product productoEnviado
	) {
		
		for (Product producto: listaProductos.getProductos()) {
			if (producto.getCodigo() == productoEnviado.getCodigo()) {
				producto.setNombre(productoEnviado.getNombre());
				producto.setCategoria(productoEnviado.getCategoria());
				producto.setDescuento(productoEnviado.getDescuento());
				break;
			}
		}

		return ("redirect:/productos/listado");
	}

	@GetMapping("/eliminar/{codigo}")
	public String deleteProduct(
		@PathVariable(value = "codigo") short codigoProducto
	) {
		for (Product producto: listaProductos.getProductos()) {
			if (producto.getCodigo() == codigoProducto) {
				listaProductos.getProductos().remove(producto);
				break;
			}
		}
		return "redirect:/productos/listado";
	}
}
