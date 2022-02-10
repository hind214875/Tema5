/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej25Pila;

/**
 *
 * @author hinda
 */
public class PruebaPila {
    public static void main(String[] args) {
        Pila pila=new Pila();
        
        System.out.println("la pila esta vacia? "+pila.estaVacia());
        
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');
        
        pila.mostrar();
        System.out.println(pila.push('f'));
        
        pila.pop();
        
        
    }
}
