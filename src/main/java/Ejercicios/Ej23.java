/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author hinda
 */
public class Ej23 {
    //metodos
    public static void rellenarNumerosAleatorios(int elemntos,ArrayList<Integer> lista){
        Random rd=new Random();
        Integer aux;
        for(int i=0;i<elemntos;i++){
           aux=rd.nextInt();
           lista.add(aux);
        }
    }
    //el mismo metodo con 2 maneras
    public static ArrayList<Integer> rellenarNumerosAleatorios(int elemntos){
        Random rd=new Random();
        ArrayList<Integer> listaAux=new ArrayList<>();
        
        for(int i=0;i<elemntos;i++){
            listaAux.add(rd.nextInt());       
        }
        return listaAux;
    }

    public static void main(String[] args) {
        //declaracion de las arrayList
        ArrayList<Integer> listUno = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        //contidad elemtos de la lista 1 numero aleatorio entre 5 y 15
        Random rd = new Random();
        Integer auxUno = rd.nextInt(11) + 5;
        System.out.println("la longitud de list uno: "+auxUno);

        //cantidad de elemtos de la lista 2 numero aleatorio entre 10 y 20
        Integer auxTwo = rd.nextInt(20 - 10 + 1) + 10;
        System.out.println("la longitud de list seconda: "+auxTwo);
        
        
        //rellenar la lista 1 rango entre 50 y 100
        for (int i = 0; i < auxUno; i++) {
            int numero = rd.nextInt(100 - 50 + 1) + 1;
            listUno.add(numero);
        }
        //rellenarNumerosAleatorios(auxUno, listUno);con metodo
        //rellenarNumerosAleatorios(int elemnto);misma metodo in otro manera
        //ArrayList<Integer>lista5=rellenarNumerosAleatorios(auxTwo)
        
        //rellenar la lista 2 rango entre 50 y 100
        for (int i = 0; i < auxTwo; i++) {
            int numero = rd.nextInt(100 - 50 + 1) + 1;
            listTwo.add(numero);
        }

        //Imprimir las listas que han sido generadas. Usa for-each.
        listUno.forEach((listU) -> {
            System.out.print(listU + "-");
        });
        System.out.print("\n");

        listTwo.forEach((listT) -> {
            System.out.print(listT + "-");
        });
        System.out.print("\n");

        //Crear una tercera lista que contenga los elementos que est??n en la lista 1 y NO EST??N en la lista 2 
        ArrayList<Integer> listTree = new ArrayList<>(); 
        for (int i = 0; i < listUno.size(); i++) {
            Integer aux=listUno.get(i);
            if(!(listTwo.contains(aux))){
                listTree.add(aux);
            }
        }
        
        //mostrar list tree
        listTree.forEach((tercera) -> {
            System.out.print(tercera + "-");
        });
        System.out.print("\n");

        //Crear una cuarta lista que contenga los elementos de la lista 1 que son pares y los elementos de la lista 2 que son impares 
        ArrayList<Integer> list4 = new ArrayList<>();
       
        for (int i = 0; i < listUno.size(); i++) {
            if (listUno.get(i) % 2 == 0) {
                 list4.add(listUno.get(i));
            }
        }

        for (int j = 0; j < listTwo.size(); j++) {
            if (listTwo.get(j) % 2 != 0) {
               list4.add(listTwo.get(j));
            }
        }

        //mostrar list 4
        list4.forEach((lista4) -> {
            System.out.print(lista4 + "-");
        });
        System.out.print("\n");

    }
}
