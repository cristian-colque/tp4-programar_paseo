package ar.edu.unju.fi.model;

public class Dog {
    private String nombre;
    private int altura;
    private double peso;
    private int edad;
    private String dia; // Nuevo parámetro
    private String horario; // Nuevo parámetro
    
    // Constructor actualizado con parámetros adicionales
    public Dog(String nombre, int altura, double peso, int edad, String dia, String horario) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.dia = dia;
        this.horario = horario;
    }
    
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
    
    public String getDia() {
        return dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
