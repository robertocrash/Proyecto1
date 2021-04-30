package com.elorrieta.herencia.GuerreroOrco;

public class Orco extends Guerrero {

	public Orco(double altura, String colorDePiel, int vida, int inteligencia, int agilidad, int fuerza) {
		super(altura, colorDePiel, vida, inteligencia, agilidad, fuerza);

		// Voy a sobreescribir a la clase guerrero

	}

	@Override
	public void ataque() {
		System.out.println("Grrrr Grrrr te pego!");
	}

	@Override
	public void saludar() {
		System.out.println("Los orcos no saludamos");
	}

	@Override
	public void bailar() {
		System.out.println("Un orco bailando? No");
	}

	@Override
	public void correr() {
		System.out.println("No queremos correr...");
	}
}
