package com.elorrieta.primerdia;

import java.util.Scanner;

public class TestearCosas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// String nombre = "";
		// boolean edad = false;
		// int numero = 0;
		int numero = 0;
		System.out.println("Introduce un número");
		do {

			try {

				numero = Integer.parseInt(teclado.nextLine());
			} catch (Exception e) {
				System.out.println("Debe ingresar obligatoriamente un número entero.");
			}
		} while (numero < 10);

		/*
		 * do { System.out.println("Introduzca su nombre (minimo 5 letras)"); nombre =
		 * teclado.nextLine(); } while (nombre.length() < 5);
		 * 
		 * System.out.println("Eres mayor de edad? Si o no"); String respuesta =
		 * teclado.nextLine(); if ("s".equalsIgnoreCase(respuesta) ||
		 * "Si".equalsIgnoreCase(respuesta)) { edad = true;
		 * System.out.println("Eres mayor de edad"); } if (!edad) {
		 * System.out.println("No eres mayor de edad"); }
		 */
		teclado.close();
	}

}