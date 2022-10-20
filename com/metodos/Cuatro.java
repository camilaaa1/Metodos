package com.metodos;

import javax.swing.JOptionPane;

public class Cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v,t, d;
		v=0; t = 0; d = 0;
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion:\n"
				+ "1. Velocidad\n"
				+ "2. Tiempo\n"
				+ "3. Distancia\n"
				+ "4. Salir"));
		do {
			switch (opcion) {
			case 1:
				velocidad(d,t);
				break;
			case 2:
				Tiempo(d,v);
				break;
			case 3:
				Distancia(v,t);
				break;
			}
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion:\n"
					+ "1. Velocidad\n"
					+ "2. Tiempo\n"
					+ "3. Distancia\n"
					+ "4. Salir"));
		}while(opcion!=4);
	}
	public static void velocidad(int d, int t){
		int velocidad;
		d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia en m"));
		t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en s"));
		velocidad = d / t;
		JOptionPane.showMessageDialog(null, " la velocidad es "+ velocidad + " m/s");
	}
	public static void Tiempo(int d, int v){
		d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia en m"));
		v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad en m/s"));
		int tiempo;
		tiempo =  d/v;
		JOptionPane.showMessageDialog(null, " El tiempo es " + tiempo + " s");

	}
	public static void Distancia(int v, int t){
		v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad en m/s"));
		t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en s"));
		int distancia;
		distancia = v * t;
		JOptionPane.showMessageDialog(null, " La distancia es " + distancia + " m");
	}

}
