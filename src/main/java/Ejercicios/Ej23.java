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

    public static void main(String[] args) {
        //declaracion de las arrayList
        ArrayList<Integer> listUno = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        //contidad elemtos de la lista 1 numero aleatorio entre 5 y 15
        Random rd = new Random();
        Integer auxUno = rd.nextInt(11) + 5;

        //cantidad de elemtos de la lista 2 numero aleatorio entre 10 y 20
        Integer auxTwo = rd.nextInt(20 - 10 + 1) + 10;

        //rellenar la lista 1 rango entre 50 y 100
        for (int i = 0; i < auxUno; i++) {
            int numero = rd.nextInt(100 - 50 + 1) + 1;
            listUno.add(numero);
        }

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

        //Crear una tercera lista que contenga los elementos que están en la lista 1 y NO ESTÁN en la lista 2 
        ArrayList<Integer> listTree = new ArrayList<>();
        boolean nonEquals = true;
        for (int i = 0; i < listUno.size(); i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                if (listUno.get(i).equals(listTwo.get(j))) {
                    nonEquals = false;
                }
            }
            if (nonEquals) {
                listTree.add(listUno.get(i));
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
            if (listUno.get(j) % 2 != 0) {
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
