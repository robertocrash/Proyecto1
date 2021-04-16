package com.elorrieta.estructuras.cadenas.texto;

/**
 * Mostrar la persona mas alta de las 2
 * 
 */
import java.util.Scanner;

public class CompararCadenas1 {

	public static void main(String[] args) {
		// Introducimos el teclado
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables de 2 personas con nombre, apellido y edad
		String nombre1 = "";
		String nombre2 = "";

		int edad1 = 0;
		int edad2 = 0;

		float altura1 = 0;
		float altura2 = 0;

		// Pedimos que los usuarios introduzcan por teclado sus datos (nombre,apellido y
		// edad)
		System.out.println("Introduce tu nombre:");
		nombre1 = teclado.nextLine();

		System.out.println("Introduce tu edad:");
		edad1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce tu altura en metros, por ejemplo 1,70");
		altura1 = Float.parseFloat(teclado.nextLine());

		System.out.println("Introduce tu nombre:");
		nombre2 = teclado.nextLine();

		System.out.println("Introduce tu edad:");
		edad2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce tu altura en metros, por ejemplo 1.70");
		altura2 = Float.parseFloat(teclado.nextLine());

		// Mostramos la persona mas alta de las dos

		if (altura1 > altura2) {
			System.out.println(nombre1 + " de  " + edad1 + " años" + " es la persona con mayor altura");
		} else {
			System.out.println(nombre2 + " de  " + edad2 + " años" + " es la persona con mayor altura");
		}
		teclado.close();

	}

}
