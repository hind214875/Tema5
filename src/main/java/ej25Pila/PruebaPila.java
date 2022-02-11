/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej25Pila;

import java.util.Arrays;

/**
 *
 * @author hinda
 */
public class PruebaPila {
    public static void main(String[] args) {
        Pila pila=new Pila(5);
        
        System.out.println("la pila esta vacia? "+pila.estaVacia());
        
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');
        
        pila.mostrar();
        //System.out.println(pila.push('f'));
        
        System.out.println("pop: "+pila.pop());
        pila.mostrar();
        
        //rellenarArrayChar
        pila.VaciarPila();
        char[] caracters=new char[]{'h','k','l','m','b','t'};
        pila.rellenarArrayChar(caracters);
        pila.mostrar();
        
        //devuelve array de char desde la pila
        System.out.println(" char[] :"+Arrays.toString(pila.sacarElementos()));
        
    }
}
