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
public class Ej13 {
    //metodos

    private static int LeerPorTeclado() {
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
            if ((numero < 0 || numero > 20)) {
                System.out.println("Introduce numero entre 0 y 20");
            }
        } while ((numero < 0 || numero > 20) || solicitarDatos);
        return numero;
    }

    private static String generarHist(int[] arrayEnteros) {
        String histograma = "";
        int contador = 1;
        Arrays.sort(arrayEnteros);
        for (int i = 0; i < arrayEnteros.length; i++) {
            for (int j = 1; j < arrayEnteros.length; j++) {
                if (arrayEnteros[i] == arrayEnteros[j]) {
                    contador++;
                }
            }
            histograma += arrayEnteros[i] + " : ";
            for (int k = 0; k < contador; k++) {
                histograma += "*";

            }
            histograma += "\n";

        }

        return histograma;
    }

    public static void main(String[] args) {
        /*
        Escribir un programa que lea números enteros entre 1 y 20 desde teclado. 
        Se debe generar un histograma con las frecuencias de cada entero en la secuencia.
        Para representar las barras del histograma hay que utilizar secuencias del carácter ‘*’. 
        El programa finaliza al introducir un cero. Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3
        generaría la siguiente salida:
1: ***
2: *
3: ****
4: ***
5:
6:
7:
…
20:**

         */

        //crear una lista con tamaño de 20
        int[] arrayEnteros = new int[10];

        //rellenar el array pediendo al usuario
        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = LeerPorTeclado();
        }
        //System.out.println(Arrays.toString(arrayEnteros));

        System.out.println(generarHist(arrayEnteros));

    }
}
