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

    public static void recorrerFila(int fila, int[][] matriz) {
        if (fila >= 0 && fila < matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[fila][i]);
            }
        }
    }

    public static void recorrerColumna(int columna, int[][] matriz) {
        if (columna >= 0 && columna <= matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][columna]);
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
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }

//    public static void recorrerVecinos(int fila, int columna, int[][] matriz) {
//        if (fila < matriz.length && fila >= 0) {
//            if (columna < matriz[0].length && columna >= 0) {
//                
//                for (int i = fila - 1; i <= fila+1; i++) {
//                    if (i < matriz.length && i >= 0) {
//                        
//                        for (int j = columna - 1; j <= columna + 1; j++) {
//                            if (j < matriz[i].length && j >= 0) {
//                                System.out.println(matriz[i][j]);
//                            }
//                        }
//                        
//                    }
//
//                }
//            }
//        }
//    }

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
        //recorrerVecinos(0,0,matriz);

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println("Vecinos de " + matriz[i][j]);
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
//pokino
}
