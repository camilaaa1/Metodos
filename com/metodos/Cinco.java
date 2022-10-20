package com.metodos;

import java.util.Scanner;

public class Cinco {
	// TODO Auto-generated method stub
    static Scanner entrada = new Scanner(System.in);
    public static final String LIBRAS = "libras";
    public static final String DOLARES = "dolares";
    public static final String MXN = "peso mexicano";
    public static final String EUROS = "euros";




   public static void main(String[] args) {
        double cop = introducirpesos();
        String moneda = introducirMoneda();
        double cambio = cambiarMoneda(moneda, cop);
        System.out.print(cambio);
    
    }
 
    public static double introducirpesos() {
        System.out.print("Introduce una cantidad de cop: ");
        double cop = entrada.nextDouble();
        entrada.nextLine();
        return cop;
    }

    public static String introducirMoneda() {
        String moneda;
        System.out.print("Introduce el tipo de moneda: ");
        moneda = entrada.nextLine();
        switch (moneda.toLowerCase()) {
            case LIBRAS:
            case DOLARES:
            case MXN:
            case EUROS:
                moneda = moneda.toLowerCase();
                break;
            default:
                moneda = null;
                System.out.println("Error, las opciones válidas son: " + LIBRAS + ", " + DOLARES + ", " +     MXN+ ", " +     EUROS);
        }
        if (moneda == null) {
            moneda = introducirMoneda();
        }
        System.out.println("La moneda introducida es " + moneda);
        return moneda;
    }
 
   
    public static double cambiarMoneda(String moneda, double cop) {
        double cambio = 0.0;
        switch (moneda) {
            case LIBRAS:
                cambio = cop * 0.00019;
                break;
            case DOLARES:
                cambio = cop * 0.00021;
                break;
            case MXN:
                cambio = cop * 0.0042;
                break;
            case EUROS:
                cambio = cop * 0.00022;
        }
        return cambio;
    }
}
