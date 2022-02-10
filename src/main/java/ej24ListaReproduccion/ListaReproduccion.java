/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24ListaReproduccion;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class ListaReproduccion {

    //atributos
    private ArrayList<Cancion> canciones;

    //constrector predeterminado
    public ListaReproduccion() {
        this.canciones = new ArrayList<>();
    }

    //metodo numeros canciones de la lista
    public int numeroCanciones() {
        return canciones.size();
    }

    //metodo devuelve si la lista esta vacia
    public boolean estaVacia() {
        return canciones.isEmpty();
    }

    //devuelve la Cancion que se encuentra en la posición indicada.
    //IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
    public Cancion escucharCancion(int posicion) {
        Cancion cancionNoExiste=null;
        if (posicion<0 || posicion>canciones.size()) {
            return cancionNoExiste;
        }
        return canciones.get(posicion);
    }

    //cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
    public boolean cambiarCancion(int posicion, Cancion cancion) {
           if(posicion<=canciones.size() && posicion>0){
               canciones.add(posicion, cancion);
               return true;
           }
          
         return false;
    }

    //grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
    public void grabarCancion(Cancion c) {
        canciones.add(c);
    }

    //eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
    //throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
    public boolean eliminaCancion(int posicion) {
        if (posicion<=canciones.size() && posicion>0) {
            canciones.remove(posicion);
            return true;
        }
        return false;
    }

    //elimina el objeto c si se encuentra en la lista de reproducción. Usa el método remove(Cancion)
    //return true if this list contained the specified element if not don't return outOfBound
    public boolean eliminaCancion(Cancion c) {
        if (canciones.contains(c)) {
            canciones.remove(c);
            return true;
        }
        return false;
    }

    //. Método de clase que imprime los nombres de las canciones contenidas en tmp.
    public static void imprimirLista(ListaReproduccion tmp) {
        if (!(tmp.canciones.isEmpty())) {
            tmp.canciones.forEach(cancion -> System.out.println(cancion.getTitulo()));
        }

    }

    //busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra. Usa el método indexOf.
    //return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
    public int buscarCancion(Cancion c) {
        return canciones.indexOf(c);
    }

    //mostrar lista
    public void mostrarLista() {
        System.out.println("Imprimiendo lista de Canciones ....");
        canciones.forEach(System.out::println);
    }

    //Incluye un par de método de ordenación (por ejemplo, por título y por cantante) usando el método Collections.sort(lista, criterioComparator)
    //Añade también métodos para buscar, usando Collections.binarySearch(lista, objeto, criterioComparator)
}
