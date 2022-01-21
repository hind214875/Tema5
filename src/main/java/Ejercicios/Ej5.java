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
public class Ej5 {

    //metodos
    private static void LeerPorTeclado(int[] array) {
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

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

    }

    private static int ContarPositivos(int[] array) {
        int contadorPositivos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contadorPositivos++;
            }
        }
        return contadorPositivos;
    }

    private static int ContarNegativos(int[] array) {
        int ContarNegativos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                ContarNegativos++;
            }
        }
        return ContarNegativos;
    }

    private static int ContarCeros(int[] array) {
        int ContarCeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                ContarCeros++;
            }
        }
        return ContarCeros;
    }

    private static void MostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("El valor de: " + (i + 1) + "es: " + array[i]);
        }
    }

    private static void CalcularMediaPositivos(int[] array) {
        int mediaPositivos = 0, suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                
                suma += array[i];
            }
            mediaPositivos = suma /ContarNegativos(array) ;
        }
        System.out.println("Media de positivos: "+mediaPositivos);

    }

    private static void CalcularMediaNegativos(int[] array) {
         int mediaNegativos= 0, suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) { 
                suma += array[i];
            }
            mediaNegativos = suma / ContarNegativos(array);
        }
        System.out.println("Media de positivos: "+mediaNegativos);
    }

    public static void main(String[] args) {
        int[] enteros = new int[10];
        LeerPorTeclado(enteros);
        MostrarArray(enteros);
        System.out.println("Positivos: " + ContarPositivos(enteros));
        System.out.println("Negativos: " + ContarNegativos(enteros));
        System.out.println("Ceros: " + ContarCeros(enteros));
        CalcularMediaPositivos(enteros);
        //CalcularMediaNegativos(enteros);
    }
}
