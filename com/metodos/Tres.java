package com.metodos;

import javax.swing.JOptionPane;

public class Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color1 = JOptionPane.showInputDialog("Seleccione un color primario:");
		String color2 = JOptionPane.showInputDialog("Seleccione otro color primario:");

		switch (color1.toLowerCase()) {
		case "rojo":
			switch (color2.toLowerCase()) {
			case "amarillo":
				colorn(color1,color2);
				break;
			case "azul":
				colorm(color1,color2);
				break;
			case "rojo":
				colorr(color1,color2);
				break;
			}
			break;

		case "azul":
			switch (color2.toLowerCase()) {
			case "amarillo":
				colorv(color1,color2);
				break;
			case "azul":
				colorr(color1,color2);
				break;
			case "rojo":	
				colorm(color1,color2);
				break;
			}
			break;

		case "amarillo":
			switch (color2.toLowerCase()) {
			case "amarillo":
				colorr(color1,color2);
				break;
			case "azul":
				colorv(color1,color2);
				break;
			case "rojo":
				colorn(color1,color2);
				break;
			}
			break;
		}
	}
	
	public static void colorm(String color1, String color2) {
		String colorf= "Morado";
		JOptionPane.showMessageDialog(null, "El color creado es: " +colorf);
	}
	public static void colorv(String color1, String color2) {
		String colorf= "Verde";
		JOptionPane.showMessageDialog(null, "El color creado es: " +colorf);
	}
	public static void colorn(String color1, String color2) {
		String colorf= "Naranja";
		JOptionPane.showMessageDialog(null, "El color creado es: " +colorf);
	}
	public static void colorr(String color1, String color2) {
		JOptionPane.showMessageDialog(null, "Se escogió el mismo color dos veces");
	}
}
