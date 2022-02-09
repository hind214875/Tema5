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
        ListaCanciones playlist = new ListaCanciones();

        //insertar Canciones a playlist
        playlist.insertarCancion(new Cancion("español", "Bailando", "Enrique Iglesias", 4));
        playlist.insertarCancion(new Cancion("español", "Macarena", "Los Del Rios", 5));
        playlist.insertarCancion(new Cancion("español", "Eres tu", "Mocedades", 3));
        playlist.insertarCancion(new Cancion("ingles", "Shallow", "Lady Gaga", 5));
        playlist.insertarCancion(new Cancion("ingles", "Hello", "Adele", 5));
        playlist.insertarCancion(new Cancion("ingles", "Rain", "Adele", 5));

        //mostrar la lista de canciones
        playlist.mostrarLista();
        System.out.println("\n");

        //buscar con artista
        System.out.println("------Buscar con el nombre del artista-------");
        System.out.println("buscar artista: " + playlist.buscarPorArtista("Adele"));
        System.out.println("\n");

        //buscar con titulo
        System.out.println("------Buscar con el titulo del cancion-------");
        System.out.println("buscar con titulo: " + playlist.buscarPorTitulo("Macarena"));
        System.out.println("\n");

        //buscar con Idioma
        System.out.println("------Buscar con el idioma del cancion-------");
        playlist.buscarConIdioma("ingles").forEach(e -> System.out.println("[" + e + "]"));
        System.out.println("\n");

        //modificar Cancion
        playlist.modificarCancion(new Cancion("ingles", "Hello", "Adele", 5), new Cancion("ingles", "Perfect", "ed Sharon", 6));
        playlist.mostrarLista();

        //borrar
        Cancion c = new Cancion("ingles", "Rain", "Adele", 5);
        System.out.println(playlist.borrarCancion(c));
        playlist.mostrarLista();

        //numero Canciones
        System.out.println("------Numero de Canciones en el playList-------");
        System.out.println(playlist.numeroCanciones());

    }
}
