/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej6 {

    /*Hacer un programa que determine si dos arrays son iguales.
Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. 
Este ejercicio hay que hacerlo de dos formas: la primera, usando la clase Arrays; 
la segunda, creando un método que vaya comparando los valores de los arrays y devuelva true si todos son iguales o false en caso contrario.*/
    //metodos
    public static int LeerPorTeclado() {
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        int numero = 0;

        do {
            solicitarDatos = true;
            try {
                System.out.println("Introduce el numero:");
                numero = sc.nextInt();
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }

        } while (numero <= 0 || solicitarDatos);
        return numero;
    }

    public static int enteroRango(int MIN_VALUE, int MAX_VALUE) {
        Random rd = new Random();
        int numAleatorio = 0;
        if (MIN_VALUE > 0 && MAX_VALUE > 0) {
            numAleatorio = rd.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
        return numAleatorio;
    }

    public static boolean comprareArrays(int[] array1, int[] array2) {
        //boolean egual = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != (array2[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int lentghArray1 = LeerPorTeclado();
        int lentghArray2 = LeerPorTeclado();

        int[] array1 = new int[lentghArray1];
        int[] array2 = new int[lentghArray2];

        //incialize arrays con aleatorio entre rango
        for (int i = 0; i < array1.length; i++) {
            array1[i] = enteroRango(1, 10);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = enteroRango(1, 10);
        }
        //mostrar los dos arrays
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //compara los dos listas usando classe Arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("Arrays eguales");
        } else {
            System.out.println("No son eguales");
        }
        
        //comparar con el metodo
        comprareArrays(array1,array2);
    }

}
