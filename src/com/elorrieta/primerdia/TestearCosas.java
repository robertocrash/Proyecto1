package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * @author Roberto Blanco Benito <br>
 *         Ejercicio 8
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=8&codigo=81&inicio=0
 */
public class TestearCosas {

	public static void main(String[] args) {
		// CREO LA ENTRADA DEL TECLADO
		Scanner teclado = new Scanner(System.in);
		// CREO LAS VARIABLES DE 3 NOTAS
		float notauno = 0;
		float notados = 0;
		float notatres = 0;

		// PIDO QUE EL USUARIO INTRODUZCA LA PRIMERA NOTA
		System.out.println("Introduzca su primera nota:");
		notauno = teclado.nextFloat();

		// PIDO QUE EL USUARIO INTRODUZCA LA SEGUNDA NOTA
		System.out.println("Introduzca su segunda nota:");
		notados = teclado.nextFloat();

		// PIDO QUE EL USUARIO INTRODUZCA LA TERCERA NOTA
		System.out.println("Introduzca la tercera nota:");
		notatres = teclado.nextFloat();

		// HAGO LA MEDIA DE LAS 3 NOTAS
		float notamedia = (notauno + notados + notatres) / 3;

		// SI LA NOTA MEDIA ES MAYOR/IGUAL QUE 7 SERAS PROMOCIONADO
		if (notamedia >= 7) {
			System.out.println("Promocionado");
		}

		// CIERRO EL TECLADO
		teclado.close();
	}

}