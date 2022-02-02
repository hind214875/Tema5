/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.math.BigDecimal;

 
 

import java.math.BigDecimal;

/**
 *
 * @author domingo
 */
public class Moneda {

    //Attributos
    private final BigDecimal moneda10C;
    private final BigDecimal moneda20C;
    private final BigDecimal moneda50C;
    private final BigDecimal moneda1E;
    private final BigDecimal moneda2E;
    private final BigDecimal Billete5;
    private final BigDecimal Billete10;
    private final BigDecimal Billete20;

    private int stockMoneda10C;
    private int stockMoneda20C;
    private int stockMoneda50C;
    private int stockMoneda1E;
    private int stockMoneda2E;
    private int stockBillete5;
    private int stockBillete10;
    private int stockBillete20;

    // Constantes
    // constructor por defecto
    public Moneda() {
        this.Billete20 = new BigDecimal("20");
        this.Billete10 = new BigDecimal("10");
        this.Billete5 = new BigDecimal("5");
        this.moneda2E = new BigDecimal("2");
        this.moneda1E = new BigDecimal("1");
        this.moneda50C = new BigDecimal("0.5");
        this.moneda20C = new BigDecimal("0.2");
        this.moneda10C = new BigDecimal("0.1");
//        // maximum10 para empezar
//        this.stockMoneda10C = 10;
//        this.stockMoneda20C = 10;
//        this.stockMoneda50C = 10;
//        this.stockMoneda1E = 10;
//        this.stockMoneda2E = 10;
//        this.stockBillete5 = 10;
//        this.stockBillete10 = 10;
//        this.stockBillete20 = 10;
    }

    public int getStockMoneda10C() {
        return stockMoneda10C;

    }

    public void setStockMoneda10C(int stockMoneda10C) {
        this.stockMoneda10C = stockMoneda10C;
    }

    public int getStockMoneda20C() {
        return stockMoneda20C;
    }

    public void setStockMoneda20C(int stockMoneda20C) {
        this.stockMoneda20C = stockMoneda20C;
    }

    public int getStockMoneda50C() {
        return stockMoneda50C;
    }

    public void setStockMoneda50C(int stockMoneda50C) {
        this.stockMoneda50C = stockMoneda50C;
    }

    public int getStockMoneda1E() {
        return stockMoneda1E;
    }

    public void setStockMoneda1E(int stockMoneda1E) {
        this.stockMoneda1E = stockMoneda1E;
    }

    public int getStockMoneda2E() {
        return stockMoneda2E;
    }

    public void setStockMoneda2E(int stockMoneda2E) {
        this.stockMoneda2E = stockMoneda2E;
    }

    public int getStockBillete5() {
        return stockBillete5;
    }

    public void setStockBillete5(int stockBillete5) {
        this.stockBillete5 = stockBillete5;
    }

    public int getStockBillete10() {
        return stockBillete10;
    }

    public void setStockBillete10(int stockBillete10) {
        this.stockBillete10 = stockBillete10;
    }

    public int getStockBillete20() {
        return stockBillete20;
    }

    // constructor parametrizado
    // Getters y Setters
    public void setStockBillete20(int stockBillete20) {
        this.stockBillete20 = stockBillete20;
    }

    public double comprobarMonedaExist(double dineroAvolver) {
        boolean exist = true;
        int stockBillete10 = 10, stockBillete5 = 10, stockMoneda2E = 10, stockMoneda1E = 10, stockMoneda50C = 10, stockMoneda20C = 10, stockMoneda10C = 10;
        double ValueChange = dineroAvolver;
        do {
            //moneda10
            if (dineroAvolver >= 10 && stockBillete10 > 0) {
                dineroAvolver -= 10;
                stockBillete10--;
            }
            //moneda 5
            if (dineroAvolver >= 5 && stockBillete5 > 0) {
                do {
                    dineroAvolver -= 5;
                    stockBillete5 -= 1;
                } while ((dineroAvolver >= 5 && stockBillete5 > 0));
            }

            //moneda2
            if ((dineroAvolver >= 2 && stockMoneda2E > 0)) {
                do {
                    dineroAvolver -= 2;
                    stockMoneda2E -= 1;

                } while ((dineroAvolver >= 2 && stockMoneda2E > 0));
            }

            //moneda1
            if (dineroAvolver >= 1 && stockMoneda1E > 0) {
                do {
                    dineroAvolver -= 1;
                    stockMoneda1E -= 1;

                } while (dineroAvolver >= 1 && stockMoneda1E > 0);
            }

            //moneda50cent
            if (dineroAvolver >= 0.5 && stockMoneda50C > 0) {
                do {
                    dineroAvolver -= 0.50;
                    stockMoneda50C -= 1;
                } while (dineroAvolver >= 0.5 && stockMoneda50C > 0);
            }

            //moneda20cent
            if (dineroAvolver >= 0.2 && stockMoneda20C > 0) {
                do {
                    dineroAvolver -= 0.20;
                    stockMoneda20C -= 1;

                } while (dineroAvolver >= 0.2 && stockMoneda20C > 0);
            }
            ////moneda10cent 
            if (dineroAvolver >= 0.1 && stockMoneda10C > 0) {
                do {
                    dineroAvolver -= 0.1;
                    stockMoneda10C -= 1;
                } while (dineroAvolver >= 0.1 && stockMoneda10C > 0);
            }

            //
            if (dineroAvolver > 0.1) {
                System.out.println("no hay cambio losiento");
                exist = false;
            }
        } while (dineroAvolver > 0 && exist == true);

        if (exist) {
            this.stockBillete10 = stockBillete10;
            this.stockBillete5 = stockBillete5;
            this.stockMoneda2E = stockMoneda2E;
            this.stockMoneda50C = stockMoneda50C;
            this.stockMoneda20C = stockMoneda20C;
            this.stockMoneda10C = stockMoneda10C;
            ValueChange = dineroAvolver;
        }
       
        
        return ValueChange;
    }
}


