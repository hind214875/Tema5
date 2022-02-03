/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hinda
 */
public class ListaInteger {
    
    private ArrayList<Integer> lista;

    public ListaInteger() {
        lista=new ArrayList<>();
    }

    //crea una lista y la rellena con tantos elementos como indique tam
    public ListaInteger(int tam) {
        Random rd=new Random();
         lista=new ArrayList<>();
         for(int i=0;i<tam;i++){
             Integer aux=rd.nextInt(91)+10;
             lista.add(aux);
         }
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
    
    
}
