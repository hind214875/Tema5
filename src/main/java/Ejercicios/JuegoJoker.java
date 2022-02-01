/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class JuegoJoker {

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

    public static int enteroRango(int MIN_VALUE, int MAX_VALUE) {
        Random rd = new Random();
        int numAleatorio = 0;
        if (MIN_VALUE > 0 && MAX_VALUE > 0) {
            numAleatorio = rd.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
        return numAleatorio;
    }

    public static void main(String[] args) {

        //crear array con el tamaño introducido 
        int tamanyo = LeerPorTeclado();
        int[] arrayElementos = new int[tamanyo];
        int[] arrayValorIntr = new int[tamanyo];

        boolean premio = true;
        int contadorBueno = 0, contadorPremio = 0;

        //inicial el array con aleatorios
        for (int i = 0; i < arrayElementos.length; i++) {
            arrayElementos[i] = enteroRango(1, 10);
        }
        //muestra el array de aleatorios
        System.out.println(Arrays.toString(arrayElementos));

        //inicial el array del usuario
        for (int j = 0; j < arrayValorIntr.length; j++) {
            arrayValorIntr[j] = LeerPorTeclado();
        }

        for (int i = 0; i < arrayElementos.length; i++) {
            for (int j = 0; j < arrayValorIntr.length; j++) {
                if (arrayElementos[i] == arrayValorIntr[j]) {
                    contadorPremio++;
                    if (i == j) {
                        contadorBueno++;
                    }
                }
            }

        }

        if (contadorPremio == (arrayElementos.length)) {
            premio = true;
        } else {
            premio = false;
        }

        if (premio) {
            System.out.println("el Joker es premio");
            if (contadorBueno == (arrayElementos.length)) {
                System.out.println("el joker es bueno");
            } else {
                System.out.println("el joker es malo");
            }
        } else {
            System.out.println("el Joker no esta premio");
        }

    }
}
