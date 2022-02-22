/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;


/**
 *
 * @author hinda
 */
public class Ej12Matrix {

    //metodos
    public static void ImprimirPorConsola(int[][] matriz) {
       for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*Declara e inicializa una matriz de caracteres de 2x3, con los valores que tú quieras. 
       Implementa un método, en la misma clase que el método main(), que reciba una matriz de caracteres y la imprima por consola.*/

        //crear y initial el Matrice
        int[][] matriz = {{3, 2, 1},
                          {7, 21, 14}};
        
        ImprimirPorConsola(matriz);
    }
}
