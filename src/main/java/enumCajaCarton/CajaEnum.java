/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumCajaCarton;

/**
 *
 * @author hinda
 */
public enum CajaEnum {
    
    CAJAGRANDE(100.00,12.00,10.00,200.00),
    CAJAPEQUENA(50,10,10,50),
    CAJAMEDIANA(70,15,20,100);
    
    //Atributos
    private final double ancho;
    private final double alto;
    private final double largo;
    //gramos
    private final double peso;
    
    //constrector

    private CajaEnum(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }
    
    //getters

    @Override
    public String toString() {
        return "CajaEnum{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }
    
}
