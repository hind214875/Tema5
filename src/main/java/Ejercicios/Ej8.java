/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej8 {

    /*Realizar un programa que lea de la entrada un número y utilice ese número para crear un array de enteros de ese tamaño.
    A continuación, el programa inicializa el array con los valores que el usuario introduzca por teclado.
    Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como indique el valor de cada elemento del array.
    Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:
*****
****
***
**
     */
    //metodos
    private static int LeerPorTeclado() {
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        int numero = 0;

        do {
            solicitarDatos = true;
            try {
                System.out.println("Introduce el numero:");
                numero = sc.nextInt();
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }

        } while (numero <= 0 || solicitarDatos);
        return numero;
    }

    public static void main(String[] args) {
        //crear array con el tamaño introducido 
        int tamanyo = LeerPorTeclado();
        int[] array = new int[tamanyo];
        //inicializa el array con los valores que el usuario introduzca por teclado
        for (int i = 0; i < array.length; i++) {
            array[i] = LeerPorTeclado();
        }
        //mostrar array con *
        for (int i = 0; i < array.length; i++) {
            int valor = array[i];
            for (int j =valor-1; j>=0; j--) {
             System.out.print("*"); 
            } 
             System.out.println("\n");
        }
        
    }
}
