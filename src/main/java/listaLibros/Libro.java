/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLibros;

import java.util.Objects;

/**
 *
 * @author hinda
 */
//la interfaz comparable implements orden natural segun equals
//el mismo criterio que hay en el equals tiene que ser en ComparTo
public class Libro implements Comparable<Libro>{
    
    private String isbn;
    private String nombre;
    private String editorial;
    private int numeroPagenas;
    private double precio;

    public Libro(String isbn, String nombre, String editorial, int numeroPagenas, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numeroPagenas = numeroPagenas;
        this.precio = precio;
    }

    public Libro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPagenas() {
        return numeroPagenas;
    }

    public void setNumeroPagenas(int numeroPagenas) {
        this.numeroPagenas = numeroPagenas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numeroPagenas=" + numeroPagenas + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.isbn);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.editorial);
        hash = 97 * hash + this.numeroPagenas;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    //dos libros eguales cuando isbn coincide
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        
        return Objects.equals(this.isbn, other.isbn);
    }

    //el metodo compraTo devuelve<0 si this es anterior
    //=0 si this y libro son eguales
    //>0 si this es mayor
    @Override
    public int compareTo(Libro t) {
        return this.isbn.compareTo(t.isbn);
    }
    
  
    
    
}
