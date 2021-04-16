package com.elorrieta.estructuras.cadenas.texto;

import java.util.Scanner;

/**
 * Solicitar el ingreso de dos apellidos. Mostrar un mensaje sin son iguales o
 * distintos.
 * 
 * @author Roberto Blanco Benito
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=13&codigo=86&inicio=0
 *      Problema3
 */
public class CompararCadenas3 {

	public static void main(String[] args) {

		// Introducimos la entrada del teclado
		Scanner teclado = new Scanner(System.in);

		// Creamos los dos apellidos

		String apellido1 = "";
		String apellido2 = "";

		// Pedimos a los 2 usuarios que introduzcan su apellido

		System.out.println("Introduzca el apellido 1er usuario:");
		apellido1 = teclado.nextLine();

		System.out.println("Introduzca el apellido 2º usuario");
		apellido2 = teclado.nextLine();

		// Mostramos un mensaje si los apellidos son iguales o distintos

		if (apellido1.equals(apellido2)) {
			System.out.println("Los apellidos son iguales");
		} else {
			System.out.println("Los apellidos son distintos");
		}
		teclado.close();
	}

}
