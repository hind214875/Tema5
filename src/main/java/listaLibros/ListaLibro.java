/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLibros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hinda
 */
public class ListaLibro {

    //Atributo encapsulado de tipo lista
    private ArrayList<Libro> lista;

    //constrectur por defecto, solo instancia la estrectura list sin incluir ningun objeto
    public ListaLibro() {
        this.lista = new ArrayList<>();
    }

    //Gruarda un libro al final ed la lista, si no es null
    public void insertarlibro(Libro libro) {
        if (libro != null) {
            lista.add(libro);
        }

    }

    public void mostrarLista() {
        System.out.println("Imprimiendo lista de libros ....");
        lista.forEach(System.out::println);
    }

    public int getNumerolibros() {
        return lista.size();
    }

    //Eliminar un libro 
    public boolean borrarLibro(Libro libro) {
        return lista.remove(libro);
    }

    //buscar un libro
    public Libro buscarISBNVieja(String isbn) {
        Libro aux;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getIsbn().equals(isbn)) {
                return aux;
            }
        }
        return null;
    }

    public Libro buscarISBN(String isbn) {
        Libro aux = new Libro(isbn, "", "", 0, 0);
        int indice = lista.indexOf(aux);
        if (indice >= 0) {
            return lista.get(indice);
        }
        return null;
    }

    public ArrayList<Libro> buscarPorPrecio(double precio) {
        ArrayList<Libro> auxList = new ArrayList<>();

        for (Libro libro : this.lista) {
            if (libro.getPrecio() == precio) {
                auxList.add(libro);
            }
        }

        return auxList;
    }

    //Collections.sort(lista) debe contener objetos que implementan comparable
    public void ordenarISBN() {
        Collections.sort(lista);
    }

    //busqueda binaria
    //binarySearch no funciona si la lista esta desordenada
    public int buscarISBN(Libro l) {
        return Collections.binarySearch(lista, l);
    }
    
    public void ordenarComparatorNombre(){
        Collections.sort(lista, (Libro l1,Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
    }
    
     public void ordenarComparatorNumeroPagina(){
        // Collections.sort(lista, (Libro l1,Libro l2)->l1.getNumeroPagenas()-l2.getNumeroPagenas());
         //seconda manera de hacerlo
         Collections.sort(lista, (Libro l1,Libro l2)->Integer.compare(l1.getNumeroPagenas(), l2.getNumeroPagenas()));
         // we can delete the type Libro because as the list is type Libro so the type is knowing 
         //this we call it Inferencia de tipos
     }
     
     //ordenar por nombre y pagina
     public void ordenarNombrePaginas(){
         //crear objeto typo comparator
         Comparator<Libro> criterioNombre= ( l1, l2)->l1.getNombre().compareTo(l2.getNombre());
         Comparator<Libro> criterioNumeroPaginas= ( l1, l2)->l1.getNumeroPagenas()-l2.getNumeroPagenas(); 
         //comaparar con dos critirios
         Comparator<Libro> critirioNombrePaginas=criterioNombre.thenComparing(criterioNumeroPaginas);
         //ordenar con los dos critirios
         Collections.sort(lista,critirioNombrePaginas);
     }
     
     //busqueda binaria por nombre
     //lista debe estar ordenada segun el criterio que se pasa a este busqueda
     public int buscarBinariaNombre(Libro l){
        return Collections.binarySearch(lista, l,( l1, l2)->l1.getNombre().compareTo(l2.getNombre()));
     }
}
