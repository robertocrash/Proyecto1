package com.elorrieta.estructuras.repetitivas;

/**
 * Programa que muestra por pantalla desde el 0 al 10 y luego empieza a mostrar
 * desde el 10 al 0.
 * 
 * @author Roberto Blanco Benito
 *
 */
public class EjercicioBucle {

	public static void main(String[] args) {
		System.out.println("Empieza el programa del 0 al 10");

		// creo una variable x a la que le dare valor 0
		int x;
		x = 10;

		int i;
		i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Termina el programa");

		System.out.println("Empieza el programa del 10 al 0");
		// Mientras x sea mayor/igual que 0 muestrame por pantalla el proceso
		while (x >= 0) {
			System.out.println(x);
			x--;
		}
		System.out.println("Termina el programa");
	}

}
