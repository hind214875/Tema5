/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej24ListaReproduccion;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        ListaReproduccion lista1 = new ListaReproduccion();

        System.out.println("la lista esta vacia?: " + lista1.estaVacia());
        
        lista1.grabarCancion(new Cancion("español", "Bailando", "Enrique Iglesias", 4));
        lista1.grabarCancion(new Cancion("español", "Macarena", "Los Del Rios", 5));
        lista1.grabarCancion(new Cancion("español", "Eres tu", "Mocedades", 3));
        lista1.grabarCancion(new Cancion("ingles", "Shallow", "Lady Gaga", 5));
        lista1.grabarCancion(new Cancion("ingles", "Rain", "Adele", 5));
        
        lista1.mostrarLista();
        
        System.out.println("\nimprimir los titulos de la lista");
        ListaReproduccion.imprimirLista(lista1);
        
        System.out.println("\nnumero canciones es: "+lista1.numeroCanciones());
        
        System.out.println("\nescuchar cancion por posicion: "+lista1.escucharCancion(4));
        
        System.out.println("\nCambiar la cancion del posicion indicada: "+lista1.cambiarCancion(1, new Cancion("ingles","Imagine","John Lennon",3)));
        lista1.mostrarLista();
        
        System.out.println("\n eliminar la cancion que encuentra en la posicion: "+lista1.eliminaCancion(5));
        lista1.mostrarLista();
        
        System.out.println("\n eliminar cancion especifica: "+lista1.eliminaCancion(new Cancion("español", "Bailando", "Enrique Iglesias", 4)));
        lista1.mostrarLista();
        
        Cancion c=new Cancion("ingles", "Rain", "Adele", 5);
        System.out.println("Buacar cancion y devuelve el posicion: "+lista1.buscarCancion(c)); 
        
        
    }
}
