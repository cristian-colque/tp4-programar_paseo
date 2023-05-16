package ar.edu.unju.fi.lists;

import java.util.List;
import java.util.ArrayList;
import ar.edu.unju.fi.model.Product;

public class ProductList {
	// region Attributes
	private List<Product> productos; // Container
	// endregion
	
	// region Constructor
	public ProductList() {
		this.productos = new ArrayList<Product>();
		this.productos.add(new Product());
	}
	// endregion
	
}
