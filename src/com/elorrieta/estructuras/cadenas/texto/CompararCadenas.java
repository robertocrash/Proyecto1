package com.elorrieta.estructuras.cadenas.texto;

/**
 * En este caso hemos comparado 2 nombres que son iguales ( pero contiene una
 * mayuscula y el otro una minuscula) por lo tanto son distintos; para que seria
 * indiferente tendremos que usar--> Nombre1.equalsIgnoreCase(Nombre2)
 * 
 * @author Roberto Blanco Benito
 *
 */
public class CompararCadenas {

	public static void main(String[] args) {

		String nombre1 = "Roberto";
		String nombre2 = "roberto";
		// Si el nombre1 equivale a nombre2 los dos nombres seran iguales.
		// en este caso seran distintos porque uno es Roberto y otro es roberto.
		if (nombre1.equals(nombre2)) {
			System.out.println("Los dos nombres son iguales, comparando mayusculas con minusculas");
		} else {
			System.out.println("Los dos nombres son diferentes, comparando mayusculas con minusculas");
		}
		System.out.println("-----------------------------------------------");
		// Aqui estamos dando uso del equalsIgnoreCase, por lo tanto no se fija en
		// minusculas/mayusculas
		if (nombre1.equalsIgnoreCase(nombre2)) {
			System.out.println("Los dos nombres son iguales");
		} else {
			System.out.println("Los nombres son distintos");
		}

	}

}
