package ar.edu.unju.fi.model;


public class Dog {
    private String nombre;
    private int altura;
    private double peso;
    private int edad;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
    
	 public Dog(String nombre, int altura, double peso, int edad) {
	        this.nombre = nombre;
	        this.altura = altura;
	        this.peso = peso;
	        this.edad = edad;
	    }
   
}
