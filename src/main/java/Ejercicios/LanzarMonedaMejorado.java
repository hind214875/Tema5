/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class LanzarMonedaMejorado {
    //atributos
    private  boolean[] booleanos;//tamaño 1000

    public LanzarMonedaMejorado() {
        
    }

    public LanzarMonedaMejorado(boolean[] booleanos) {
        this.booleanos = booleanos;
    }
   
    public boolean[] ListaTamnio(int length){
        booleanos=new boolean[length];
        return booleanos;
    }
    
    @Override
    public String toString() {
        return "LanzarMoneda{" + "booleanos=" + booleanos + '}';
    }
    
    //metodos
    /*un método para rellenar el array, de forma que simule 1000 lanzamientos de una moneda. 
        El método debe almacenar el resultado de cada tirada en el array. */
    public void RellenarArray(){      
        Random rd= new Random();
        for (int i = 0; i <booleanos.length ; i++) {
            booleanos[i]= rd.nextBoolean();
        }
    }
    
    //un método para saber cuántas “caras” salieron después de los lanzamientos. cara=true
    public int CuantasCaras(){
        int contador=0;
        for(int i=0;i <booleanos.length ; i++){
            if(booleanos[i]){
                contador++;
            }
        }
        return contador;
    }
    
    ////un método para saber cuántas “cruces” salieron después de los lanzamientos. Cruz=false
     public int CuantasCruz(){
         int contador=0;
        for(int i=0;i <booleanos.length ; i++){
            if(!(booleanos[i])){
                contador++;
            }
        }
        return contador;
     }
     
     //un método para imprimir el resultado de los 1000 lanzamientos, 
     //de forma que aparezca el número de lanzamiento y el resultado (cara o cruz)
     
     public void MostrarResultado(){
         for(int i=0;i<booleanos.length ; i++){
             System.out.println(" NumeroLanzamiento: "+i+"  "+(booleanos[i]? "cara":"cruz")+"\n");
         }
     }
     
}
