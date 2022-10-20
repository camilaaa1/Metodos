package com.metodos;

import javax.swing.JOptionPane;

public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,h, r;
		b=0; h = 0; r = 0;
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion:\n"
				+ "1. Area cuadrado\n"
				+ "2. Area triangulo\n"
				+ "3. Area rectangulo\n"
				+ "4. Area circulo"));

		switch (opcion) {
		case 1:
			area(b,h);
			break;
		case 2:
			areaT(b,h);
			break;
		case 3:
			areaRe(b,h);
			break;
		case 4:
			areaCi(r);
			break;
		}

	}
	public static void area(int b, int h){
		int areac;
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la base en cm"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la altura en cm"));
		areac = b * h;
		JOptionPane.showMessageDialog(null, " el area de el cuadrado es "+areac + "  cm^2");
	}
	public static void areaT(int b, int h){
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la base cm"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la altura cm"));
		int areaTr;
		areaTr = b * h/2;
		JOptionPane.showMessageDialog(null, " el area de el triangulo es "+areaTr + " cm^2");

	}
	public static void areaRe(int b, int h){
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la base cm"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la altura cm"));
		int arearE;
		arearE = b * h;
		JOptionPane.showMessageDialog(null, " el area de el Rectangulo es "+arearE + " cm^2");
	}
	public static void areaCi(int r){
		r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del radio en cm"));
		double arearC;
		double numero = r;
		double cuadrado = Math.pow(numero, 2);
		double pi = Math.PI;
		arearC = (double) ( pi* cuadrado);
		JOptionPane.showMessageDialog(null, " el area de el Circulo es "+arearC + " cm^2");
	}
}
