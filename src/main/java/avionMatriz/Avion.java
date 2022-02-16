/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avionMatriz;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class Avion {

    //atributos
    private int[][] matriz = new int[FILAS][COLUMNAS];
    private int asientoFila;
    private int asientoColumna;

    //constantes
    private static final int FILAS = 25;
    private static final int COLUMNAS = 4;

    //constrector
    public Avion(int[][] matriz) {
        this.matriz = matriz;
    }

    public Avion() {
        this.matriz = rellenarAvionEmpty();
    }

    //getters y setters
    public int[][] getMatriz() {
        return matriz;
    }

    public int getAsientoFila() {
        return asientoFila;
    }

    public void setAsientoFila(int asientoFila) {
        this.asientoFila = asientoFila;
    }

    public int getAsientoColumna() {
        return asientoColumna;
    }

    public void setAsientoColumna(int asientoColumna) {
        this.asientoColumna = asientoColumna;
    }

    @Override
    public String toString() {
        return "Avion{" + "matriz=" + matriz + ", asientoFila=" + asientoFila + ", asientoColumna=" + asientoColumna + '}';
    }

    //metodos
    public void ImprimirPorConsola() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public int[][] rellenarAvionEmpty() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        return matriz;
    }

    public int[][] rellenarAvionLLena() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }
        return matriz;
    }

    public void reservarAsiento(int asientoFila, int asientoColumna) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (matriz[i][j] == 0) {
                    if (i == asientoFila && j == asientoColumna) {
                        matriz[asientoFila][asientoColumna] = 1;
                    }
                }
            }
        }
    }

    public void cancelarAsiento(int asientoFila, int asientoColumna) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (matriz[i][j] == 1) {
                    if (i == asientoFila && j == asientoColumna) {
                        matriz[i][j] = 0;
                    }
                }
            }
        }
    }

    public void mostrarLibros() {
         
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {        
                System.out.print(matriz[i][j]==0 ? matriz[i][j] : " ");           
            }
            System.out.println();
        }
        System.out.println("\n");
    }
     
      public void mostrarOcupados() {
         
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {        
                System.out.print(matriz[i][j]==1 ? matriz[i][j] : " ");  
                
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    

}
