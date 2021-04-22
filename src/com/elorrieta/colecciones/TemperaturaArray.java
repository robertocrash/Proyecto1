package com.elorrieta.colecciones;

public class TemperaturaArray {

	public static void main(String[] args) {

		// Creamos el array
		int[] Temperaturas = new int[7];

		// Damos los valores al array
		Temperaturas[0] = 12; // posicion 0 valor12
		Temperaturas[1] = 20; // posicion 1 valor 20
		Temperaturas[2] = 18;
		Temperaturas[3] = 5;
		Temperaturas[4] = 22;
		Temperaturas[5] = 15;
		Temperaturas[6] = 18;

		// int temp = Temperaturas[7];
		// Creamos una variable double porque en el resultado pueden salir numeros con
		// decimales
		double media = 0.0;
		// Creamos un bucle for para recorrer el array; este bucle iterara tantas veces
		// como elementos tenga el array
		for (int i = 0; i < Temperaturas.length; i++) {
			media = media + Temperaturas[i];
		}
		// Para sacar la media dividiremos la suma de todos los valores por el
		// numero de elementos del array
		media = media / Temperaturas.length;
		System.out.println("La media del array es:" + media);

		/**
		 * Obtener numero mayor
		 */

		// Asumimos que el mayor es el primero
		int mayor = Temperaturas[0];
		int menor = Temperaturas[0];
		for (int i = 1; i < Temperaturas.length; i++) {
			if (Temperaturas[i] > mayor) {
				mayor = Temperaturas[i];
			}
			if (Temperaturas[i] < menor) {
				menor = Temperaturas[i];
			}
		}
		System.out.println("El numero mayor es:" + mayor);
		System.out.println("El numero menor es:" + menor);
	}
}
