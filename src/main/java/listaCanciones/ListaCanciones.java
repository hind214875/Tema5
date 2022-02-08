/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaCanciones;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class ListaCanciones {

    //atributos
    private ArrayList<Cancion> lista;//arrayList de Canciones encapsulado

    //constrector por defecto
    public ListaCanciones() {
        this.lista = new ArrayList<>();
    }

    //añadir un objeto de typo Cancion al arrayList
    public void insertarCancion(Cancion cancion) {
        if (cancion != null) {
            lista.add(cancion);
        }

    }

    //borrar un objeto cancion si lo encuentra lo borra y devuelve true
    public boolean borrarCancion(Cancion cancion) {
        return lista.remove(cancion);
    }

    //buscar con titulo
    public ArrayList<Cancion> buscarPorTitulo(String titulo) {
        ArrayList<Cancion> listaAux = new ArrayList<>();

        for (Cancion cancion : lista) {
            if (cancion.getTitulo().equals(titulo)) {
                listaAux.add(cancion);
            }
        }
        return listaAux;
    }

    //buscar con artista 
    public ArrayList<Cancion> buscarPorArtista(String artista) {
        ArrayList<Cancion> listaAux = new ArrayList<>();

        for (Cancion cancion : lista) {
            if (cancion.getArtist().equals(artista)) {
                listaAux.add(cancion);
            }
        }
        return listaAux;
    }

    //buscar con idioma usando indexOf
    public ArrayList<Cancion>  buscarConIdioma(String idioma) {
         ArrayList<Cancion> listaAux = new ArrayList<>();
         for (Cancion cancion : lista) {
            if(cancion.getidioma().equalsIgnoreCase(idioma)){
                listaAux.add(cancion);
            }
        }
         return listaAux; 
    }

    //mostrar lista
    public void mostrarLista() {
        System.out.println("Imprimiendo lista de Canciones ....");
        lista.forEach(System.out::println);
    }
    
    public int numeroCanciones(){
        return lista.size();
    }
}
