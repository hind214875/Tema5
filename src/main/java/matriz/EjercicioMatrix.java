/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import java.util.ArrayList;
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
        if (x >= 0 && x <= matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[x][i]);
            }
        }
    }

    public static void recorrerColumna(int x, int[][] matriz) {
        if (x >= 0 && x <= matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][x]);
            }
        }
    }

    public static int getvalue(int i, int j, int matrix[][]) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        if (i < 0 || j < 0 || i > rowSize - 1 || j > colSize - 1) {
            return -1;
        }
        return matrix[i][j];
    }

    public static int[] recorrerVecinas(int i, int j, int[][] matrix) {

        int vecino[] = new int[8];
        // top row
        vecino[0] = getvalue(i - 1, j - 1, matrix);
        vecino[1] = getvalue(i - 1, j, matrix);
        vecino[2] = getvalue(i - 1, j + 1, matrix);

        // left element
        vecino[3] = getvalue(i, j - 1, matrix);

        // right element
        vecino[4] = getvalue(i, j + 1, matrix);

        // bottom row
        vecino[5] = getvalue(i + 1, j - 1, matrix);
        vecino[6] = getvalue(i + 1, j, matrix);
        vecino[7] = getvalue(i + 1, j + 1, matrix);

        return vecino;

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

        System.out.println("\nRecorrer Filas\n");
        recorrerFila(3, matriz);

        System.out.println("\nrecorrer columnas\n");
        recorrerColumna(1, matriz);

        System.out.println("\n recorrer vecinos");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println("neightbours of " + matriz[i][j]);
                int neb[] = recorrerVecinas(i, j, matriz);
                for (int k = 0; k < neb.length; k++) {
                    if (neb[k] != -1) {
                        System.out.print(" " + neb[k] + ",");
                    }
                }
                System.out.println();
            }

        }
    }

}
