package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * @author Roberto Blanco Benito <br>
 *         Ejercicio 8
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=8&codigo=81&inicio=0
 */
public class CondicionalesAnidadas {

	public static void main(String[] args) {
		// creo la entrada del teclado
		Scanner teclado = new Scanner(System.in);
		// creo las variables de 3 notas
		float notauno = 0;
		float notados = 0;
		float notatres = 0;

		// pido que el usuario introduzca la primera nota
		System.out.println("Introduzca su primera nota:");
		notauno = teclado.nextFloat();

		// pido que el usuario introduzca la segunda nota
		System.out.println("Introduzca su segunda nota:");
		notados = teclado.nextFloat();

		// pido que el usuario introduzca la tercera nota
		System.out.println("Introduzca la tercera nota:");
		notatres = teclado.nextFloat();

		// HAGO LA MEDIA DE LAS 3 NOTAS
		float notamedia = (notauno + notados + notatres) / 3;

		// si la nota media es mayo/igual que 7 seras promocionado
		if (notamedia >= 7) {
			System.out.println("Promocionado");
		} else {
			// si la nota es mayor/igual que 4 seras regular
			if (notamedia >= 4) {
				System.out.println("Regular");
				// si la nota media es menor que 4 seras reprobado
			} else {
				System.out.println("Reprobado");
			}
		} // 1ª condicion

		// cierro el teclado
		teclado.close();
	}// cierre main

}
