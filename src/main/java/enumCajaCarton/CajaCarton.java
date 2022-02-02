/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumCajaCarton;

/**
 *
 * @author hinda
 */
public class CajaCarton {

    //Atributos
    CajaEnum cajagrande;
    CajaEnum cajaPequena;
    CajaEnum cajaMediana;

    //constrector por defecto

    public CajaCarton() {
    }

    //constrector con parametros

    public CajaCarton(CajaEnum cajagrande, CajaEnum cajaPequena, CajaEnum cajaMediana) {
        this.cajagrande = cajagrande;
        this.cajaPequena = cajaPequena;
        this.cajaMediana = cajaMediana;
    }
    

    //getters 

    public CajaEnum getCajagrande() {
        return cajagrande;
    }

    public CajaEnum getCajaPequena() {
        return cajaPequena;
    }

    public CajaEnum getCajaMediana() {
        return cajaMediana;
    }

//tostring

    @Override
    public String toString() {
        return "CajaCarton{" + "cajagrande=" + cajagrande + ", cajaPequena=" + cajaPequena + ", cajaMediana=" + cajaMediana + '}';
    }
    

}
