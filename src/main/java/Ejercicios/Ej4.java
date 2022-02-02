/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej4 {

/*Escribe un programa que, dado un array de enteros de cualquier tamaño, busque si un número obtenido por teclado se encuentra en el array e imprima la primera posición en la que se encuentra el número. Realiza la búsqueda de un elemento:
implementando el método de búsqueda secuencial. 
usando el método de búsqueda binaria de la clase Arrays.*/
    
    //metodos
    private static int LeerPorTeclado() {
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
        //busceda binaria
        //ordinar la lista premiro
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, numero));
          

    }

}
