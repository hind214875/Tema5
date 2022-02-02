/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author hinda
 */
public class Ej15PruebaLanzar {

    public static void main(String[] args) {
//        LanzarMoneda lanz = new LanzarMoneda();
//        lanz.RellenarArray();
//        System.out.println(lanz.CuantasCaras());
//        System.out.println(lanz.CuantasCaras());
//        lanz.MostrarResultado();
        
        LanzarMonedaMejorado monedaMejorada=new LanzarMonedaMejorado();
        monedaMejorada.ListaTamnio(100);
        
        monedaMejorada.RellenarArray();
        System.out.println(monedaMejorada.CuantasCaras());
        System.out.println(monedaMejorada.CuantasCaras());
        monedaMejorada.MostrarResultado();
    }

}
