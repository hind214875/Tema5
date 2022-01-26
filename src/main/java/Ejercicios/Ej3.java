/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author hinda
 */
//metodos
import java.util.Arrays;
public class Ej3 {
    public static void main(String[] args) {
        double array[]=new double[20];
        double array2[]=new double[array.length];
        
        //Rellena el array con el valor 7.5 en todas sus posiciones.
        for(int i=0;i<array.length;i++){
           Arrays.fill(array, 7.5);
        }
        System.out.println(Arrays.toString(array));
        //Realiza una copia del array anterior en un nuevo array.
        array2=Arrays.copyOf(array, 20);
        System.out.println(Arrays.toString(array2));
        
        //Compara ambos arrays, mostrando si son iguales.
        System.out.println(Arrays.equals(array, array2));
        
        //Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays.
        Arrays.fill(array, 10, 11, 6.3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        
        //Vuelve a compararlos, indicando si son iguales o no.
         System.out.println(Arrays.equals(array, array2));
         System.out.println(Arrays.compare(array, array2));
    }
}
