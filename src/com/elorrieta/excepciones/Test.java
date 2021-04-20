package com.elorrieta.excepciones;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Introduzco la entrada del teclado
		Scanner teclado = new Scanner(System.in);

		// voy a crear 2 numeros

		int numero1 = 0;
		int numero2 = 0;

		// Aplico la excepcion en ambas variables
		try {
			System.out.println("Introduzca el 1er número: ");
			numero1 = Integer.parseInt(teclado.nextLine());

			System.out.println("Introduzca er 2do número: ");
			numero2 = Integer.parseInt(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Dato incorrecto (Introduce números)");
		} finally {
			System.out.println("Esta excepción siempre saldra");
		}
		// Suma de ambos numeros
		int Suma = numero1 + numero2;

		System.out.println("La suma de: " + numero1 + " + " + numero2 + " es: " + Suma);

		teclado.close();
	}

}
