package com.elorrieta.estructuras.repetitivas;

import java.util.Scanner;

/**
 * Pedir a los usuarios por teclado que introduzcan las notas que han sacado en
 * los examenes, para salir tendran que escribir 111. Hacer la media de los
 * examenes realizados
 * 
 * @author cursos_externos
 *
 */
public class BucleSumarNotas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int notas = 0;
		int total = 0; // la suma de las notas
		int notasobtenidas = 0; // las notas que has obtenido

		// creo una variable que sea 111
		int salir = 111;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca la nota " + (i + 1));
			notas = teclado.nextInt();
			// si las notas son igual a salir(111) saldras del bucle
			if (notas != salir) {
				total += notas; // total = total+ notas;
				notasobtenidas++;
			}
		}
//Mostrar media de los examenes realizados
		System.out.println("La media es: " + (total / notasobtenidas));

		teclado.close();
	}

}
