package com.elorrieta.herencia.vehiculos;

public class Avion extends Vehiculo {

	private int alas;

	public Avion() {
		super();
		this.alas = 2;
	}

	public Avion(String matricula, String color, int asientos, int ruedas, int alas) {
		super(matricula, color, asientos, ruedas);
		this.alas = alas;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	@Override
	public String toString() {
		return "Avion [alas=" + alas + ", getMatricula()=" + getMatricula() + ", getColor()=" + getColor()
				+ ", getAsientos()=" + getAsientos() + ", getRuedas()=" + getRuedas() + "]";
	}

}// main
