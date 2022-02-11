/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej25Pila;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Pila {

    //atributo
    private ArrayList<Character> pila;
    private int tamanoPila;

    //constrector 
    public Pila(int tamanoPila) {
        this.pila = new ArrayList<>();
        this.tamanoPila = tamanoPila;

    }

    //Saber si la pila está vacía.
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    //apilar elemento (en inglés push), lo inserta donde proceda.
    public boolean push(char c) {
        if (pila.size() < tamanoPila) {
            pila.add(c);
            return true;
        }
        return false;
    }

    //desapilar (en inglés pop), que saca el elemento que toque.
    public char pop() {
        if (!(pila.isEmpty())) {
            if (pila.size() <= tamanoPila) {
                char p = pila.get(pila.size() - 1);
                pila.remove(pila.size() - 1);
                return p;
            }

        }
        return '0';

    }

    //Saber si la pila está llena.
    public boolean estaLlena() {
        if (!(pila.isEmpty())) {
            return true;
        }
        return false;
    }

    //Saber el número de elementos actual de la pila.
    public int numeroElementos() {
        return pila.size();
    }

    //Mostrar los elementos de la pila.
    public void mostrar() {
        System.out.println("Imprimiendo lista de Canciones ....");
        pila.forEach(System.out::println);
    }

    public void VaciarPila() {
        pila.clear();
    }

    //rellenar (char[] array), que recibe un array de letras y almacena en la pila los char que hay en el array. 
    //La pila se ajusta su tamaño según el número de elementos que tenga el array.
    public void rellenarArrayChar(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];
            pila.add(c);
        }
    }
    //char[] sacarElementos(), saca los elementos de la pila y los devuelva en un array de char. 
    //La pila queda vacía.

    public char[] sacarElementos() {
        char[] arrayChar = new char[pila.size()];
        
        for (int i = 0; i < pila.size(); i++) {
            if (!(pila.isEmpty())) {
                arrayChar[i] = pila.get(i);      
            }
        }
         return arrayChar;   
    }
}
