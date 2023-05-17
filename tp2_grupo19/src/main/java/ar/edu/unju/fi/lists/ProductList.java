package ar.edu.unju.fi.lists;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Product;

public class ProductList {
	
	// region Attributes
	private List<Product> productos; // Container
	// endregion
	
	// region Constructor
	public ProductList() {
		this.productos = new ArrayList<Product>();
		this.productos.add(new Product("collar_con_pañuelo", 12, 251.2, "Collares y correas", 0, "/images/products/leashes_and_collars/collar_con_pañuelo.jpg"));
		// this.productos.add(new Product("alimento1", 32, 651.7, "Alimentos", 0));
		// this.productos.add(new Product("higiene1", 42, 351.8, "Productos de higiene", 0));
		// this.productos.add(new Product("juguete1", 27, 451.8, "Juguetes", 0));
		// this.productos.add(new Product("camas1", 98, 1051.8, "Camas", 0));
	}
	// endregion

	// region Getters and Setters
	public List<Product> getProductos() {
		return productos;
	}

	public void setProductos(List<Product> productos) {
		this.productos = productos;
	}
	// endregion

}
