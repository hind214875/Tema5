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
        this.canciones=new ArrayList<Cancion>();
    }
    
    //metodo numeros canciones de la lista
    public int numeroCanciones(){
       return canciones.size();
    }
    
    //metodo devuelve si la lista esta vacia
    public boolean estaVacia(){
        return canciones.isEmpty();
    }
    
    //devuelve la Cancion que se encuentra en la posición indicada. 
     public Cancion escucharCancion(int posicion){
         return canciones.get(posicion);            
     }
     
     //cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
     public void cambiarCancion(int posicion, Cancion cancion){
         for (int i = 0; i < canciones.size(); i++) {
             if(canciones.indexOf(i)==posicion){
                 canciones.get(i).setidioma(cancion.getidioma());
                 canciones.get(i).setArtist(cancion.getArtist());
                 canciones.get(i).setTitulo(cancion.getTitulo());
                 canciones.get(i).setRating(cancion.getRating());
             }
         }
     }
     
     //grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
     public void grabarCancion(Cancion c){
         canciones.add(c);
     }
     
     //eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
     public void eliminaCancion(int posicion){
         canciones.remove(posicion);
     }
     
     //elimina el objeto c si se encuentra en la lista de reproducción. Usa el método remove(Cancion)
     public void eliminaCancion(Cancion c){
         canciones.remove(c);
     }
     
     //. Método de clase que imprime los nombres de las canciones contenidas en tmp.
     public static void imprimirLista (ListaReproduccion tmp){
        tmp.toString();
                     
     }
     
     //busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra. Usa el método indexOf.
     public int buscarCancion(Cancion c){
         return canciones.indexOf(c);
     }
     
     //Incluye un par de método de ordenación (por ejemplo, por título y por cantante) usando el método Collections.sort(lista, criterioComparator)
     
     //Añade también métodos para buscar, usando Collections.binarySearch(lista, objeto, criterioComparator)
}
