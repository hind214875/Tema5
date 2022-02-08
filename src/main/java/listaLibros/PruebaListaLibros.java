/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLibros;

import arrayList.ListaLibro;
import listaLibros.Libro;

/**
 *
 * @author hinda
 */
public class PruebaListaLibros {

    public static void main(String[] args) {

        ListaLibro catalogo = new ListaLibro();
        ListaLibro catalogo2 = new ListaLibro();

        catalogo.insertarlibro(new Libro("1234", "la muerte a pellizcos", "planeta", 10, 0.9));
        catalogo.insertarlibro(new Libro("125", "la muerte a bocados", "ghtef", 10, 0.9));
        catalogo.insertarlibro(new Libro("1235", "bla bla bla", "sdsdg", 10, 0.9));
        catalogo.insertarlibro(new Libro("1256", "tara tara ", "uiuot", 10, 0.9));
        
        catalogo.mostrarLista();

        System.out.println("Tamaño del catalogo: " + catalogo.getNumerolibros());
        
        Libro libro=catalogo.buscarISBN("1234");
        System.out.println("Libro buscado: "+libro);
        
        libro=catalogo.buscarISBNVieja("1235");
        System.out.println("Libro buscado: "+libro);
//        
        catalogo.borrarLibro(new Libro("1235","","",0,0));
        catalogo.mostrarLista();
//        
        System.out.println("libros de precio 0.9");
        catalogo.buscarPorPrecio(0.9).forEach(System.out::println);
        
    }
}
