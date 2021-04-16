package com.elorrieta.estructuras.cadenas.texto;

import java.util.Scanner;

/**
 * Solicita el ingreso del nombre y edad de 2 personas. Mostrar el nombre de la
 * persona con mayor edad.
 * 
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=13&codigo=86&inicio=0
 *      Problema1
 * @author Roberto Blanco Benito
 *
 */
public class CadenaCaracteres {

	public static void main(String[] args) {
		// Introducimos la entrada por teclado
		Scanner teclado = new Scanner(System.in);

		// creamos 2 nombres
		String nombre1 = "";
		String nombre2 = "";

		// creamos 2 edades
		int edad1 = 0;
		int edad2 = 0;

		// Pedimos al usuario1 que introduzca un nombre
		System.out.println("Introduzca su nombre por favor: ");
		nombre1 = teclado.next();

		// Pedimos al usuario1 que introduzca su edad
		System.out.println("Introduzca su edad por favor: ");
		edad1 = teclado.nextInt();

		// Pedimos al usuario2 que introduzca un nombre
		System.out.println("Introduzca su nombre por favor: ");
		nombre2 = teclado.next();

		// Pedimos al usuario2 que introduzca su edad
		System.out.println("Introduzca su edad por favor: ");
		edad2 = teclado.nextInt();

		// Vamos a mostrar el nombre de la persona que tenga mayor edad

		// Si la edad1 es mayor que la edad2
		if (edad1 > edad2) {
			System.out.println(nombre1 + "es la persona con mayor edad");
		} else {
			System.out.println(nombre2 + " es la persona con mayor edad");
		}
		teclado.close();
	}

}
