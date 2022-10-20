package com.metodos;

import javax.swing.JOptionPane;

public class Dos {

		static String palabra,mayuscula,minuscula,numerodeletras;
	    int acum=0;
	    static int a;
	    public  static void main(String[] args)
	    {
	       do {
	            Leerpalabra();
	            menu();
	            if (a==1)
	            {
	                mayuscula();
	                mostrarmax();
	            }
	            else if (a==2)
	            {
	                minuscula();
	                mostrarmin();
	            }
	            else if (a==3)
	            {
	                numerodeletras();
	                mostrarnum();
	            }
	        }while (a!=4);
	   }

	    public static void Leerpalabra()
	    {
	        palabra= JOptionPane.showInputDialog("Digite su palabra");
	   }
	    public static void menu()
	    {
	        a=Integer.parseInt(JOptionPane.showInputDialog("Digite opcion \n 1.Mayuscula  \n 2.Minuscula \n 3.Numero de palabras \n 4.Salir"));
	    }
	    public static void mayuscula()
	    {
	        mayuscula=palabra.toUpperCase();

	   }
	    public static void minuscula()
	    {
	        minuscula=palabra.toLowerCase();
	   }
	    public static void numerodeletras()
	    {
	        numerodeletras= String.valueOf(palabra.length());
	   }
	    public static void mostrarmax()
	    {
	        System.out.println("Mayuscula: "+mayuscula);
	    }
	    public static void mostrarmin()
	    {
	        System.out.println("Minusculas: "+minuscula);

	    }
	    public static void mostrarnum()
	    {
	        System.out.println("Numeró de letras: "+numerodeletras);
	    }
	}
