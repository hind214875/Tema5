/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

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
    private static int LeerPorTecladoArrayLenth() {
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        int lenthArray = 0;

        do {
            solicitarDatos = true;
            try {
                System.out.println("Introduce el lenth de array:");
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

    public static int[] creatArrayDeXlenth() {
        boolean solicitarDatos = true;
        
        int arrayLenth=LeerPorTecladoArrayLenth();
        int[] array=new int[arrayLenth];
        
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
      creatArrayDeXlenth();
      

    }

}
