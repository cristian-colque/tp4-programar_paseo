package ar.edu.unju.fi.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unju.fi.model.Product;

public class ProductList {
	
	// region Attributes
	private List<Product> productos; // Container
	private List<String> categorias = Arrays.asList(
		"Alimentos",
		"Camas",
		"Collares y correas",
		"Higiene",
		"Juguetes");
	// endregion
	
	// region Constructor
	public ProductList() {
		
		this.productos = new ArrayList<Product>();

		this.productos.add(new Product("Alimento pedigree", categorias.get(0), "/images/products/foods/alimento_pedigree.jpg"));
		this.productos.add(new Product("Alimento bonelo", categorias.get(0), "/images/products/foods/alimento_bonelo.png"));
		this.productos.add(new Product("Alimento dog_chow", categorias.get(0), "/images/products/foods/alimento_dog_chow.jpg"));
		this.productos.add(new Product("Alimento dogui", categorias.get(0), "/images/products/foods/alimento_dogui.jpg"));
		this.productos.add(new Product("Alimento agility", categorias.get(0), "/images/products/foods/alimento_agility.jpg"));
		this.productos.add(new Product("Alimento raza", categorias.get(0), "/images/products/foods/alimento_raza.jpg"));
		this.productos.add(new Product("Alimento siete vidas", categorias.get(0), "/images/products/foods/alimento_siete_vidas.jpg"));
		this.productos.add(new Product("Alimento gati", categorias.get(0), "/images/products/foods/alimento_gati.jpg"));

		this.productos.add(new Product("Cama colchon colchoneta", categorias.get(1), "/images/products/beds/cama_colchon_colchoneta.jpg")); 
		this.productos.add(new Product("Cama moises antidesgarro", categorias.get(1), "/images/products/beds/cama_moises_antidesgarro.jpg"));
		this.productos.add(new Product("Cama moises cuna", categorias.get(1), "/images/products/beds/cama_moises_cuna.jpg"));
		this.productos.add(new Product("Colchon liso antidesgarro", categorias.get(1), "/images/products/beds/colchon_liso_antidesgarro.jpg"));
		this.productos.add(new Product("Cama para gatos", categorias.get(1), "/images/products/beds/cama_para_gatos.jpg"));
		this.productos.add(new Product("Cama y cueva para gatos", categorias.get(1), "/images/products/beds/cama_y_cueva_para_gatos.jpg"));
		this.productos.add(new Product("Cama felpa para gatos", categorias.get(1), "/images/products/beds/cama_felpa_para_gatos.jpg"));

		this.productos.add(new Product("Collar con pañuelo", categorias.get(2), "/images/products/leashes_and_collars/collar_con_pañuelo.jpg"));
		this.productos.add(new Product("Collares nylon lisos", categorias.get(2), "/images/products/leashes_and_collars/collares_nylon_lisos.jpg"));
		this.productos.add(new Product("Collares de cuero", categorias.get(2), "/images/products/leashes_and_collars/collares_de_cuero.jpg"));
		this.productos.add(new Product("Correa alpina", categorias.get(2), "/images/products/leashes_and_collars/correa_alpina.jpg"));
		this.productos.add(new Product("Correa extendible", categorias.get(2), "/images/products/leashes_and_collars/correa_extendible.jpg"));
		this.productos.add(new Product("Correa extendible flexi", categorias.get(2), "/images/products/leashes_and_collars/correa_extendible_flexi.jpg"));
		this.productos.add(new Product("Correas estampadas", categorias.get(2), "/images/products/leashes_and_collars/correas_estampadas.jpg"));
		
		this.productos.add(new Product("Cepillo para gato", categorias.get(3), "/images/products/hygiene/cepillo_para_gatos.jpg"));
		this.productos.add(new Product("Caja para gato", categorias.get(3), "/images/products/hygiene/caja_para_gato.jpg"));
		this.productos.add(new Product("Champu", categorias.get(3), "/images/products/hygiene/champu_para_mascotas.jpg"));
		this.productos.add(new Product("Perfume", categorias.get(3), "/images/products/hygiene/perfume_para_mascotas.jpg"));
		this.productos.add(new Product("Rodillos quitapelos", categorias.get(3), "/images/products/hygiene/rodillos_quitapelos.jpg"));
		this.productos.add(new Product("Toallitas", categorias.get(3), "/images/products/hygiene/toallitas_higiene_para_perro_y_gato_musgo_blanco_aloe.jpg"));

		this.productos.add(new Product("Hueso para perro", categorias.get(4), "/images/products/toys/hueso_para_perro.jpg"));
		this.productos.add(new Product("Juguete mazorca para perro", categorias.get(4), "/images/products/toys/juguete_mazorca_para_perros.jpg"));
		this.productos.add(new Product("Juguete para masticar", categorias.get(4), "/images/products/toys/juguete_para_masticar.jpg"));
		this.productos.add(new Product("Pelota con alimento para perro", categorias.get(4), "/images/products/toys/pelota_con_alimento_para_perro.jpg"));
		this.productos.add(new Product("Pelota estire", categorias.get(4), "/images/products/toys/pelota_estire.jpg"));
		this.productos.add(new Product("Raton con sonido", categorias.get(4), "/images/products/toys/raton_con_sonido.jpg"));
		this.productos.add(new Product("Tunel para gato", categorias.get(4), "/images/products/toys/tunel_para_gato.jpg"));

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

	// region Method
	public Set<String> getCategorias() {
		List<String> listaCategorias = new ArrayList<String>();
			for(Product producto: productos) {
				listaCategorias.add(producto.getCategoria());
			}
		Set<String> setCategorias = new HashSet<>(listaCategorias);
		return setCategorias;
	}
	// endregion

}
