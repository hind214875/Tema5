/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author hinda
 */

//recomendable final 
//constroctor privado siempre 
//no hay setter 
//se definin los objetos al principio del enum

public enum Pizza {
    
    BARBACOA(12,"Barbacoa Cream",new String[]{"Carne","bacon","Queso","BBQ"},13.0),
    CARBONARA(14,"Carbonara",new String[]{"Nata","bacon","Queso","BBQ"},13.0),
    JAMONYQUESO(15,"JAMONYQUESO",new String[]{"Nata","bacon","Queso","BBQ"},13.0);
    
    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;
    private final double precio;

    private Pizza(int tamanio, String nombre, String[] ingredientes, double precio) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public static Pizza getBARBACOA() {
        return BARBACOA;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamanio=" + tamanio + ", nombre=" + nombre + ", ingredientes=" + ingredientes + ", precio=" + precio + '}';
    }
    
    
        
        
}
