package ar.edu.unju.fi.model;

public class Product {
	
	// region Attributes
	private String nombre;
	private short codigo;
	private float precio;
	private String categoria;
	private byte descuento;
	private String imagen;
	// endregion
	
	// region Constructor
	public Product() {}
	
	public Product(
			String nombre,
			int codigo,
			double precio,
			String categoria,
			int descuento,
			String imagen
	) {
	
		this.nombre = nombre;
		this.codigo = (short) codigo;
		this.precio = (float) precio;
		this.categoria = categoria;
		this.descuento = (byte) descuento;
		this.imagen = imagen;
	}
	// endregion
		
	// region Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public short getCodigo() {
		return codigo;
	}
	
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public byte getDescuento() {
		return descuento;
	}
	
	public void setDescuento(byte descuento) {
		this.descuento = descuento;
	}

	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
    // endregion
	
	// region Methods
	/**
    * Calcula el valor del producto de producirse un descuento o no
    * @return Valor del producto
    */
    public float calcularDescuento() {

        float resultado = 0f;

        if (descuento == 0) {
            resultado = precio;
        }
        
        if (descuento > 0) {
            resultado = precio - (precio * this.descuento / 100);
        }

        return resultado;

    }
	// endregion
}
