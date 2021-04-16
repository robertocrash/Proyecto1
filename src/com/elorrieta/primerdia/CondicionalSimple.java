package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * @author Roberto Blanco Benito <br>
 *         Ejercicio 7
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=7&codigo=80&inicio=0
 */
public class CondicionalSimple {

	public static void main(String[] args) {
		// creo la entrada del teclado
		Scanner teclado = new Scanner(System.in);

		// creo una variable llamada sueldo
		float sueldo = 0;

		// pido al usuario que introduzca el sueldo que ha recibido
		System.out.println("Introduce el sueldo que has recibido: ");
		sueldo = teclado.nextFloat();

		// si el sueldo es mayor de 3000 esta persona debera abonar impuestos
		if (sueldo > 3000) {
			System.out.println("Esta persona debe abonar impuestos");
			// si el sueldo es menor de 3000 nada
		} else {
			System.out.println("NADA");
		}
		// cierro el teclado
		teclado.close();
	}

}
