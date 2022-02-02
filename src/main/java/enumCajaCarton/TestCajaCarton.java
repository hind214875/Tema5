/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumCajaCarton;

import enumCajaCarton.CajaCarton;

/**
 *
 * @author hinda
 */
public class TestCajaCarton {
    public static void main(String[] args) {
        //creamos objetos de clase CajaCarton
        CajaCarton cajas=new CajaCarton(CajaEnum.CAJAGRANDE,CajaEnum.CAJAPEQUENA,CajaEnum.CAJAMEDIANA);
        
        //imprimir por pantalla los datos
        System.out.println(cajas.toString());
        
        CajaEnum cajaGrande = CajaEnum.CAJAGRANDE; //Instancia de un enum
        CajaEnum cajaPequena=CajaEnum.CAJAPEQUENA;
        
        System.out.println(cajaGrande.name());//Devuelve un String con el nombre de la constante CAJAGRANDE
        System.out.println(cajaGrande.toString());//Devuelve un String con el nombre de la constante CAJAGRANDE
        System.out.println(cajaGrande.ordinal());// Devuelve un entero con la posición del enum según está declarada 
        System.out.println(cajaGrande.compareTo(cajaPequena));
        CajaEnum.values();//devuelve array contiene todos los enums
    }
}
