/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLibros;


import listaLibros.Libro;

/**
 *
 * @author hinda
 */
public class PruebaListaLibros {

    public static void main(String[] args) {

        ListaLibro catalogo = new ListaLibro();
        ListaLibro catalogo2 = new ListaLibro();

        catalogo.insertarlibro(new Libro("AZC", "Aaaa", "planeta", 10, 0.9));
        catalogo.insertarlibro(new Libro("AZC", "cccc", "ghtef", 9, 0.9));
        catalogo.insertarlibro(new Libro("ACE", "bla bla bla", "sdsdg", 8, 0.9));
        catalogo.insertarlibro(new Libro("ABC", "tara tara ", "uiuot", 7, 0.9));
               
        catalogo.mostrarLista();
        catalogo.ordenarISBN();
        catalogo.mostrarLista();
        
        catalogo.ordenarComparatorNombre();
        catalogo.mostrarLista();
        
        int posicion=catalogo.buscarISBN(new Libro("ACE", "bla bla bla", "sdsdg", 10, 0.9));
        System.out.println("esta en la posicion:" +posicion);
        
        catalogo.ordenarComparatorNumeroPagina();
        catalogo.mostrarLista();
        
        catalogo.ordenarNombrePaginas();
        catalogo.mostrarLista();
        
        catalogo.ordenarComparatorNombre();
        int posicion2=catalogo.buscarBinariaNombre(new Libro(" ", "bla bla bla", " ", 0, 0.9));
        System.out.println("esta en la posicion: "+posicion2);
        
//        System.out.println("Tamaño del catalogo: " + catalogo.getNumerolibros());
//        
//        Libro libro=catalogo.buscarISBN("1234");
//        System.out.println("Libro buscado: "+libro);
//        
//        libro=catalogo.buscarISBNVieja("1235");
//        System.out.println("Libro buscado: "+libro);
////        
//        catalogo.borrarLibro(new Libro("1235","","",0,0));
//        catalogo.mostrarLista();
////        
//        System.out.println("libros de precio 0.9");
//        catalogo.buscarPorPrecio(0.9).forEach(System.out::println);


        
    }
}
