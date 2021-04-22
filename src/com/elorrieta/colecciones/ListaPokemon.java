package com.elorrieta.colecciones;

import java.util.ArrayList;

import com.elorrieta.objetos.Pokemon;

public class ListaPokemon {

	public static void main(String[] args) throws Exception {

		float precioTotal = 0;
		Pokemon pMasCaro = new Pokemon();
		Pokemon pMasBarato = new Pokemon();
		pMasBarato.setPrecio(Pokemon.PRECIO_MAXIMO);

		ArrayList<Pokemon> coleccion = new ArrayList<Pokemon>();
		// coleccion.add(new Pokemon("pikachu",1000, true));

		Pokemon p = new Pokemon();
		p.setNombre("Pikachu");
		p.setPrecio(1000);
		p.setBrillante(true);
		coleccion.add(p);

		p = new Pokemon();
		p.setNombre("Charmander");
		p.setPrecio(500);
		p.setBrillante(false);
		coleccion.add(p);

		p = new Pokemon();
		p.setNombre("Bulbasur");
		p.setPrecio(5);
		p.setBrillante(true);
		coleccion.add(p);

		p = new Pokemon();
		p.setNombre("Doraemon");
		p.setPrecio(100);
		p.setBrillante(true);
		coleccion.add(p);

		// System.out.println(coleccion);
		int cont = 0;
		int cont2 = 0;
		for (Pokemon pokemon : coleccion) {
			float precioMasCaro = pMasCaro.getPrecio();
			float precioMasBarato = pMasBarato.getPrecio();
			float precios = pokemon.getPrecio();

			precioTotal = precioTotal + precios;

			if (precioMasCaro < precios) {
				pMasCaro = pokemon;
			}
			if (precioMasBarato > precios) {
				pMasBarato = pokemon;
			}

			if (pokemon.isBrillante()) {
				cont++;
			}
			if (!pokemon.isBrillante()) {
				cont2++;
			}
		} // final del for

		for (int i = 0; i < coleccion.size(); i++) {
			Pokemon pokemon = coleccion.get(i);// lo mismo que: Pokemon pokemon : coleccion

		}
		System.out.println("Pokemon brillantes: " + cont + "/ Sin brillo: " + cont2);
		System.out.println("El precio total de los pokemon es:" + precioTotal);
		System.out.println("El pokemon mas caro es: " + pMasCaro.getPrecio());
		System.out.println("El pokemon mas barato es: " + pMasBarato.getPrecio());
	}
}