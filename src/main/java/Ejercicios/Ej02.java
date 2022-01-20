/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

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
        int numeroPersonas = 0, Altura = 0, AlturaMedia, sumaAltura = 0, SupMedia = 0, infMedia = 0;
        

        System.out.println("Introduce el numero de personas:");
        numeroPersonas = sc.nextInt();
        int[] AlturaPersonas = new int[numeroPersonas];
        
        for (int i = 0; i < AlturaPersonas.length; i++) {
            System.out.println("Introduce la altura en cm:");
            Altura = sc.nextInt();
            if (Altura < 0) {
                Altura *= -1;
                AlturaPersonas[i] = Altura;
            } else {
                AlturaPersonas[i] = Altura;
            }

            sumaAltura += i;
            AlturaMedia = sumaAltura / 2;
            if (Altura > AlturaMedia) {
                SupMedia++;
            } else {
                infMedia++;
            }
        }
        System.out.println("Numero personas superan la media son:" + SupMedia);
        System.out.println("Numero personas inferior la media son:" + infMedia);

    }
}
