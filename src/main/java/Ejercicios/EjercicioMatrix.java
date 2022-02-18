/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class EjercicioMatrix {

    //metodos
    public static void rellenarMatrix(int[][] matrix) {
        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(11);
            }
        }
    }

    public static void recorrerFila(int x, int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[x][i]);
        }
    }

    public static void recorrerColumna(int x, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][x]);
        }
    }

    public static void recorrerVecinas(int x, int y, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[x][y] < matriz.length) {
                 
                }

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

    public static void main(String[] args) {
        //crear matriz
        int[][] matriz = new int[4][4];
        rellenarMatrix(matriz);
        ImprimirPorConsola(matriz);

        System.out.println("");
        recorrerFila(3, matriz);

        System.out.println("");
        recorrerColumna(1, matriz);

        System.out.println("");
        recorrerVecinas(2, 2, matriz);
    }

}
