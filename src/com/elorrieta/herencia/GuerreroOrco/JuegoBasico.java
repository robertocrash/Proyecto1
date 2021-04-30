package com.elorrieta.herencia.GuerreroOrco;

public class JuegoBasico {
	public static void main(String[] args) {

		// Primero vamos a crear un orco
		Guerrero orco = new Orco(1.8, "rojo", 500, 5, 10, 100);
		System.out.println("Nuestro orco " + orco.toString());

		// Orco ataca
		orco.ataque();

		// Orco baila
		orco.bailar();

		// orco saluda
		orco.saludar();

		// Orco corre
		orco.correr();

		System.out.println("-----------------------Creacion de Guerrero---------------------------------");

		Guerrero guerrero = new Guerrero(1.7, "blanco", 300, 200, 100, 70);
		System.out.println("Nuestro " + guerrero.toString());

		guerrero.ataque();

		guerrero.bailar();

		guerrero.saludar();

		guerrero.correr();

		// int vidaNueva = guerrero.elixirVida();
		guerrero.elixirVida();
		System.out.println("Elixir tomado: " + guerrero.getVida());

		System.out.println(guerrero);

		guerrero.atacar();
		System.out.println(guerrero.getFuerza());
		// test cosas random

	}
}
