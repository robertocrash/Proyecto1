package com.elorrieta.excepciones;

import java.util.Scanner;

public class EjemploFinally {
	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Dime un numero");
			int numero = Integer.parseInt(teclado.nextLine());
			System.out.println("Tu numero es " + numero);
			teclado.close();
		} catch (Exception e) {
			System.out.println("Hemos tenido una excepcion!!!");
		} finally {
			System.out.println("Esto se ejecuta siempre, haya Excepcion o no");

		}

		System.out.println("Fin del Programa");

	}

}
