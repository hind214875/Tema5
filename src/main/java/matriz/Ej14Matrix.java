/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class Ej14Matrix {

    //metodos
    public static void rellenarMatrix(int[][] matrix) {
        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(100) + 1;
            }
        }
    }

    public static void ImprimirPorConsola(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double calcularMedia(int[][] matriz) {
        double media = 0, sum = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
                contador++;
            }
        }
        return media = sum / contador;
    }

    public static void main(String[] args) {
        /*Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:
          Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
          Calcular la media de todos los valores
          Calcular el valor mínimo y el máximo de todos los valores
         */

        int[][] matriz = new int[3][3];
        rellenarMatrix(matriz);
        ImprimirPorConsola(matriz);
        System.out.printf("la suma es: %.2f", calcularMedia(matriz));

        int minor = matriz[0][0], mayor = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]>mayor) {
                    mayor = matriz[i][j];

                } else if(matriz[i][j]<minor){
                    minor = matriz[i][j];
                }
            }
        }

        System.out.println("\nEl valor minimo es: " + minor + " y el valor maximu es: " + mayor);

    }
}
