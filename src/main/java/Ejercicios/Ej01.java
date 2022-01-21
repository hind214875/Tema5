/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author hinda
 */
public class Ej01 {
    public static void main(String[] args) {
        //declarar la array y initializarla
        int[] arrayEnteros={1, 2, 3, 4, 5, 6};
        int suma = 0;
        for(int i=0;i<arrayEnteros.length;i++){
            System.out.println("arrayEnteros:"+arrayEnteros[i]);
            suma+=arrayEnteros[i];            
        }
        System.out.println("la suma es:"+suma);
        
    }
}
