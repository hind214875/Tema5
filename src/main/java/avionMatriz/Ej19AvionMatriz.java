/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avionMatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Ej19AvionMatriz {

    public static void main(String[] args) {
        /*
        Crear un programa que mediante un menú permita reservar o cancelar asientos de un avión, 
        así como mostrar qué asientos están ocupados y libres actualmente. 
        El avión tendrá 25 filas de 4 asientos cada una.

         */
        int opcion = 0;
        boolean solicitarDatos;
        Avion avion = new Avion();

        do {
            solicitarDatos = true;
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.reservar\n"
                            + "2.cancelar\n"
                            + "3.mostrar Libros\n"
                            + "4.mostrar Ocupados\n"
                            + "5.Salir"));
                    solicitarDatos = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Se ha introducido texto en lugar de números. Vuelva a introducir los datos");
                }
            } while (solicitarDatos);

            switch (opcion) {
                case 1://"1.reservar\n"
                    int asientoFila = Integer.parseInt(JOptionPane.showInputDialog(null, "Que fila quieres reservar?"));
                    int asientoColumna = Integer.parseInt(JOptionPane.showInputDialog(null, "Que columna quieres reservar?"));
                    avion.reservarAsiento(asientoFila, asientoColumna);
                    avion.ImprimirPorConsola();

                    break;

                case 2://"2.cancelar\n"
                    asientoFila = Integer.parseInt(JOptionPane.showInputDialog(null, "Que fila quieres Cancelar?"));
                    asientoColumna = Integer.parseInt(JOptionPane.showInputDialog(null, "Que columna quieres Cancelar?"));
                    avion.cancelarAsiento(asientoFila, asientoColumna);
                    avion.ImprimirPorConsola();
                    break;

                case 3://3.mostrar Libros\n"
                    avion.mostrarLibros();
                    break;

                case 4://4.mostrar Ocupados\n
                    avion.mostrarOcupados();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Has elegido salir del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ha introducido una opción no valida");
                    break;
            }

        } while (opcion != 5);

    }
}
