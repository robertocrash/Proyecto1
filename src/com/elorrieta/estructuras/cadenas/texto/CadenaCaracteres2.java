package com.elorrieta.estructuras.cadenas.texto;

import java.util.Scanner;

/**
 * Solicitar el ingreso del apellido, nombre y edad de dos personas. Mostrar el
 * nombre de la persona con mayor edad. Realizar la carga del apellido y nombre
 * en una variable de tipo String.
 *
 * @author Roberto Blanco Benito
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=13&codigo=86&inicio=0
 */
public class CadenaCaracteres2 {

	public static void main(String[] args) {

		// Introducimos el teclado
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables de 2 personas con nombre, apellido y edad
		String nombre1 = "";
		String nombre2 = "";

		String apellido1 = "";
		String apellido2 = "";

		int edad1 = 0;
		int edad2 = 0;

		// Pedimos que los usuarios introduzcan por teclado sus datos (nombre,apellido y
		// edad)
		System.out.println("Introduce tu nombre:");
		nombre1 = teclado.next();

		System.out.println("Introduce tu apellido:");
		apellido1 = teclado.next();

		System.out.println("Introduce tu edad:");
		edad1 = teclado.nextInt();

		System.out.println("Introduce tu nombre:");
		nombre2 = teclado.next();

		System.out.println("Introduce tu apellido:");
		apellido2 = teclado.next();

		System.out.println("Introduce tu edad:");
		edad2 = teclado.nextInt();

		// Mostramos el nombrede la persona con mayor edad

		if (edad1 > edad2) {
			System.out.println(nombre1 + " " + apellido1 + " es la persona con mayor edad");
		} else {
			System.out.println(nombre2 + " " + apellido2 + " es la persona con mayor edad");
		}
		teclado.close();
	}

}
