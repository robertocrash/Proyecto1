package com.elorrieta.herencia.vehiculos;

public class Coche extends Vehiculo {

	private boolean itv;

	public Coche() {
		super();
		this.itv = false;
	}

	public Coche(String matricula, String color, int asientos, int ruedas) {
		super(matricula, color, asientos, ruedas);
		this.itv = false;

	}

	public Coche(String matricula, String color, int asientos, int ruedas, boolean itv) {
		super(matricula, color, asientos, ruedas);
		this.itv = itv;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	@Override
	public String toString() {
		return "coche [itv=" + itv + ", Matricula=" + getMatricula() + ", Color=" + getColor() + ", Asientos="
				+ getAsientos() + ", Ruedas=" + getRuedas() + "]";
	}

}
