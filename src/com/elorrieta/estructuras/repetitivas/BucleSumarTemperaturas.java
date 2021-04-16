package com.elorrieta.estructuras.repetitivas;

import java.util.Scanner;

/**
 * Pedir por teclado las temperatura del dia, seguir pidiendo la siguiente
 * temperatura mientras no se escriba "888". Al finalizar mostrar la media de
 * las temperaturas.
 * 
 * @author Roberto Blanco Benito
 *
 */
public class BucleSumarTemperaturas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float temperatura = 0;
		float total = 0; // suma de todas las temperaturas
		int numerotemperaturas = 0;
		int salir = 888;

		// BUCLE para pedir temperaturas y sumarlas
		while (temperatura != salir) {
			System.out.println("Dime la temperatura o 888 para salir:  ");
			temperatura = teclado.nextFloat();

			// Realizar operaciones si no queremos salir
			if (temperatura != salir) {
				total += temperatura; // total = total + temperatura;
				numerotemperaturas++;
			}
		}

		// Mostrar media
		System.out.println("Media: " + (total / numerotemperaturas));
		teclado.close();
	}

}
