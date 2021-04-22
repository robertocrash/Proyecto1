package com.elorrieta.colecciones;

import java.util.ArrayList;

public class ListaPaises1 {

	public static void main(String[] args) {

		ArrayList<String> paises = new ArrayList<String>();
		paises.add("España");
		paises.add("NuevaGuinea");
		paises.add("Portu");
		paises.add("Portugal");
		// Recorremos la lista con un for
		for (int i = 0; i < paises.size(); i++) {
			String pais = paises.get(i);
			System.out.println("posicion" + i + "-" + pais);

		}

		// Vamos a contar cuantas veces esta el pais Portugal
		String paisBuscado = "Portugal";
		int cont = 0;
		for (int i = 0; i < paises.size(); i++) {
			String paisIteracion = paises.get(i);
			if (paisBuscado.equalsIgnoreCase(paisIteracion))
				cont++;

		}
		// Contar caracteres de los paises que tengan mas de 7
		int cont1 = 0;
		for (int i = 0; i < paises.size(); i++) {
			String paisesCaracteres = paises.get(i);
			if (paisesCaracteres.length() > 7)
				cont1++;

		}
		String letraBuscar = "a";
		int cont2 = 0;

		for (int i = 0; i < paises.size(); i++) {
			String palabraIteracion = paises.get(i);
			if ("a".equalsIgnoreCase(palabraIteracion)) {
				cont2++;

			}

			// Muestra por pantalla cuantas veces esta en la lista la palabra "Portugal"
			// System.out.println("Portugal esta: " + cont + " veces");

			// Muestra por pantalla los paises que poseen mas de 7 caracteres
			// System.out.println("Los paises con mas de 7 caracteres son:" + cont1);
		}
		System.out.println("España tiene la a:" + cont2 + " veces");

	}
}
