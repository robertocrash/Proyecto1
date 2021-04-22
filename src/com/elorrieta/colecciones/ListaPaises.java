package com.elorrieta.colecciones;

import java.util.ArrayList;

public class ListaPaises {

	public static void main(String[] args) {
		// ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		ArrayList<String> paises = new ArrayList<String>();

		paises.add("España");
		paises.add("Iia");
		paises.add("Francia");
		paises.add("Andorra");
		paises.add("España");
		paises.add("España");
		paises.add("España");

		// Recorrer con for de toda la vida
		for (int i = 0; i < paises.size(); i++) {
			String pais = paises.get(i);
			System.out.println(pais + i);

		}

		// Bucle foreach es mas rapido, pero no tenemos la i
		for (String pais : paises) {

		}

		// contar cuantas veces esta el pais "X"
		String paisBuscar = "España";
		int cont = 0;
		for (int indice = 0; indice < paises.size(); indice++) {
			String paisIteracion = paises.get(indice);
			if (paisBuscar.equalsIgnoreCase(paisIteracion)) {
				cont++;
			}
		}
		System.out.println("El pais " + paisBuscar + " esta " + cont + " veces");

		// contar paises con mas de 5 caracteres
		int cont1 = 0;
		for (int i = 0; i < paises.size(); i++) {
			String paisCaracteres = paises.get(i);
			if (paisCaracteres.length() > 5)
				cont1++;
		}
		System.out.println("Los paises con mas de 5 caracteres son: " + cont1);
		System.out.println("Prueba de españa:" + "España".length());
	}

}
