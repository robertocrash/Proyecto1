package com.elorrieta.herencia.vehiculos;

public class CocheGasolina extends Coche {

	private int combustible;
	private int cilindrada;

	public CocheGasolina(String matricula, String color, int asientos, int ruedas, int combustible, int cilindrada) {
		super(matricula, color, asientos, ruedas);
		this.combustible = combustible;
		this.cilindrada = cilindrada;
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "CocheGasolina [combustible=" + combustible + ", cilindrada=" + cilindrada + ", getMatricula()="
				+ getMatricula() + ", getColor()=" + getColor() + ", getAsientos()=" + getAsientos() + ", getRuedas()="
				+ getRuedas() + "]";
	}

}
