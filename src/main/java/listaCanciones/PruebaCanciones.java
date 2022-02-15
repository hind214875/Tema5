/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaCanciones;

/**
 *
 * @author hinda
 */
public class PruebaCanciones {

    public static void main(String[] args) {
        //crear album
        ListaCanciones playList = new ListaCanciones();

        //insertar Canciones a playList
        playList.insertarCancion(new Cancion("español", "Bailando", "Enrique Iglesias", 4));
        playList.insertarCancion(new Cancion("aspañol", "Macarena", "Los Del Rios", 5));
        playList.insertarCancion(new Cancion("español", "Eres tu", "Mocedades", 3));
        playList.insertarCancion(new Cancion("ingles", "Shallow", "Lady Gaga", 5));
        playList.insertarCancion(new Cancion("lngles", "Hello", "Adele", 5));
        playList.insertarCancion(new Cancion("ingles", "Rain", "Adele", 5));

        //mostrar la lista de canciones
         playList.mostrarLista();
//        System.out.println("\n");
//
//        //buscar con artista
//        System.out.println("------Buscar con el nombre del artista-------");
//        System.out.println("buscar artista: " + playList.buscarPorArtista("Adele"));
//        System.out.println("\n");
//
//        //buscar con titulo
//        System.out.println("------Buscar con el titulo del cancion-------");
//        System.out.println("buscar con titulo: " + playList.buscarPorTitulo("Macarena"));
//        System.out.println("\n");
//
//        //buscar con Idioma
//        System.out.println("------Buscar con el idioma del cancion-------");
//        playList.buscarConIdioma("ingles").forEach(e -> System.out.println("[" + e + "]"));
//        System.out.println("\n");
//
//        //modificar Cancion
//        playList.modificarCancion(new Cancion("ingles", "Hello", "Adele", 5), new Cancion("ingles", "Perfect", "ed Sharon", 6));
//        playList.mostrarLista();
//
//        //borrar
//        Cancion c = new Cancion("ingles", "Rain", "Adele", 5);
//        System.out.println(playList.borrarCancion(c));
//        playList.mostrarLista();
//
//        //numero Canciones
//        System.out.println("------Numero de Canciones en el playList-------");
//        System.out.println(playList.numeroCanciones());
         
          //ordenar la lista Por Artista
          playList.ordenarPorArtista();
          playList.mostrarLista();
          
          //ordenar por idioma
          playList.ordenarComparatorIdioma();
          playList.mostrarLista();
          
          //buscar binarySearch
          int pos=playList.buscar(new Cancion("español", "Eres tu", "Mocedades", 3));
          System.out.println("la posicion de este Cancion es: "+pos);
    }
}
