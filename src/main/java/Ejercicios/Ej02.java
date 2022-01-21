/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej02 {

    public static void main(String[] args) {
        /*Escribe un programa para leer la altura de un número determinado de personas y calcular la altura
       media. El número de personas se pide por teclado y debe ser entero un entero mayor que cero. 
      Posteriormente el programa irá pidiendo la altura, en cm, de cada una de las personas y las guardará en una estructura de almacenamiento. 
     Si la altura leída no es positiva, el programa la pasará a número positivo. 
   También es necesario saber cuántas personas tienen una altura superior a la media e inferior a la media. */
        Scanner sc = new Scanner(System.in);
        int numeroPersonas = 0;
        double AlturaMedia = 0, sumaAltura = 0, SupMedia = 0, infMedia = 0;
        do {
            System.out.println("Introduce el numero de personas:");
            numeroPersonas = sc.nextInt();
        } while (numeroPersonas <= 0);
        //crear y inisializar la lista
        double[] AlturaPersonas = new double[numeroPersonas];

        for (int i = 0; i < AlturaPersonas.length; i++) {
            System.out.println("Introduce la altura en cm:");
            AlturaPersonas[i] = Math.abs(sc.nextInt());
            sumaAltura += AlturaPersonas[i];
            AlturaMedia = sumaAltura / numeroPersonas;
            if (AlturaPersonas[i] >= AlturaMedia) {
                SupMedia+=1;
            } else {
                infMedia+=1;
            }

        }
        System.out.println(Arrays.toString(AlturaPersonas));
        System.out.println("suma alturas:"+sumaAltura);
        System.out.println("la altura media:"+AlturaMedia);
        System.out.println("el numero de personas que superan la altura media:" + SupMedia);
        System.out.println("el numero de personas inferior de la altura media:" + infMedia);
    }

}
