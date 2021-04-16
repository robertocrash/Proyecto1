package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * @author Roberto Blanco Benito Ejercicio 6 <br>
 *         <br>
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=6&codigo=79&inicio=0
 */
public class ProgramacionSecuencial {

	public static void main(String[] args) {
		// introduzca la entrada por teclado
		Scanner teclado = new Scanner(System.in);

		// creo la variable numerouno y la variable numerodos
		int numerouno = 0;
		int numerodos = 0;

		// pido escribir el primer numero al usuario
		System.out.println("Introduzca un numero por favor:");
		numerouno = teclado.nextInt();
		// pido escribir el segundo numero al usuario
		System.out.println("Introduzca otro numero por favor:");
		numerodos = teclado.nextInt();

		// ahora creo la variable de numero1 + numero2
		int suma = (numerouno + numerodos);
		System.out.println("La suma de ambos numeros es: " + suma);

		// creo la variable del producto numero1 * numero2
		int producto = (numerouno * numerodos);
		System.out.println("El producto de ambos numeros es: " + producto);

		// por ultimo cierro el teclado
		teclado.close();
	}

}
