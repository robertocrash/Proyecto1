package com.elorrieta.herencia.videojuego;

import java.util.ArrayList;

public class Coleccion {

	public static void main(String[] args) {

		ArrayList<Personaje> coleccion = new ArrayList<Personaje>();
		ArrayList<Guerrero> orda = new ArrayList<Guerrero>();
		Guerrero g = new Guerrero();
		Guerrero g1 = new Guerrero();
		Mago m = new Mago();

		// Añado los personajes a la lista
		coleccion.add(g);
		coleccion.add(g1);
		coleccion.add(m);
		orda.add(g1);
		orda.add(g);

		// System.out.println("tenemos " + coleccion.size() + " personajes en la
		// colección");

		// test contar guerreros y magos
		// System.out.println(coleccion);
		// System.out.println(g);
		// System.out.println(m);
		// System.out.println(g1);

		int tamanoColeccion = coleccion.size();
		System.out.println(tamanoColeccion);

		int contMago = 0;
		int contGuerrero = 0;

		for (Personaje p : coleccion) {

			if (p instanceof Guerrero) {
				contGuerrero++;
			}
			if (p instanceof Mago) {
				contMago++;
			}
		} // final del for
		System.out.println(contGuerrero);
		System.out.println(contMago);

	}
}// main
