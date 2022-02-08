/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList;

import listaLibros.Libro;
import java.util.ArrayList;

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
    
    public int getNumerolibros(){    
        return lista.size();
    }
    
    //Eliminar un libro 
    public boolean borrarLibro(Libro libro){
        return lista.remove(libro);
    }
    
    //buscar un libro
    public Libro buscarISBNVieja(String isbn){
        Libro aux;
        for(int i=0;i<lista.size();i++){
            aux=lista.get(i);
            if(aux.getIsbn().equals(isbn)){
                return aux;
            }
        }
        return null;
    }
    
     public Libro buscarISBN(String isbn){
         Libro aux=new Libro(isbn,"","",0,0);
         int indice=lista.indexOf(aux);
         if(indice>=0){
             return lista.get(indice);
         }
         return null;
     }
     
     public ArrayList<Libro> buscarPorPrecio(double precio){
         ArrayList<Libro> auxList=new ArrayList<>();
         
         for (Libro libro : this.lista) {
             if(libro.getPrecio()==precio){
                 auxList.add(libro);
             }
         }
         
         return auxList;
     }

}
