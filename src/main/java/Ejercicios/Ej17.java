package Ejercicios;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hinda
 */
public class Ej17 {

    public static String LeerString() {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Introduce un String");
        String palabra = sc.nextLine();
        
        return palabra.toLowerCase();
    }

    public static void main(String[] args) {
        /*Implementa un programa que lea un String, lo pase a minúscula, 
  lo introduzca en un array de caracteres y ordene dicho array siguiendo el orden Unicode (a<b<c<d...).*/
        String palabra=LeerString();
        int length=palabra.length();
        
        //crear array del string Introducido
        char[] arrayChar=new char[length];
        
        //rellenar el array con char de palabra
        for(int i=0;i<arrayChar.length;i++){             
            arrayChar[i]=palabra.charAt(i); 
        }
        Arrays.sort(arrayChar);
        System.out.println(Arrays.toString(arrayChar));
    }
}
