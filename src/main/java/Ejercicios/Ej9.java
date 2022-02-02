/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej9 {

    /*En el programa del ejercicio 4, incluir un método llamado ordenarBubble(int[] arrayOrdenar) para ordenar el array que se le pase, 
 usando el método bubble sort que hay en los apuntes. */
    public static int LeerPorTeclado() {
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        int lenthArray = 0;

        do {
            solicitarDatos = true;
            try {
                System.out.println("Introduce el numero:");
                lenthArray = sc.nextInt();
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }

        } while (lenthArray <= 0 || solicitarDatos);
        return lenthArray;
    }

    public static int[] creatArrayDeXlength() {
        boolean solicitarDatos = true;

        int arrayLenth = LeerPorTeclado();
        int[] array = new int[arrayLenth];

        Scanner sc = new Scanner(System.in);
        do {
            solicitarDatos = true;
            try {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Introducir el valor de " + (i + 1));
                    array[i] = sc.nextInt();
                }
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }

        } while (solicitarDatos);
        return array;
    }

    static void ordenarBubble(int arrayOrdenar[]) {
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < arrayOrdenar.length - 1; i++) {
            for (int j = 0; j < arrayOrdenar.length - 1; j++) {
                /* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */
                if (arrayOrdenar[j] > arrayOrdenar[j + 1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                    int temp = arrayOrdenar[j + 1];
                    /* Lo intercambiamos de posición */
                    arrayOrdenar[j + 1] = arrayOrdenar[j];
                    arrayOrdenar[j] = temp;
                    /* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
 /* de esta forma vamos dejando los números mayores al final del array en orden*/
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = creatArrayDeXlength();
        int numero = LeerPorTeclado();

        //busceda secuencial
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                System.out.println("el numero se encuentra en la posicion: " + i);
                break;
            }
        }

        // ordinar la lista  
        //Arrays.sort(array);
        ordenarBubble(array);
        //busceda binaria
        System.out.println("el numero se encuentra en la posicion:" + Arrays.binarySearch(array, numero));

    }

}
