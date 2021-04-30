package com.elorrieta.herencia.vehiculos;

public class CocheElectrico extends Coche {

	private int kw;

	public CocheElectrico(String matricula, String color, int asientos, int ruedas, boolean itv) {
		super(matricula, color, asientos, ruedas, itv);
		this.isItv();

	}

	public CocheElectrico(String matricula, String color, int asientos, int ruedas, int kw) {
		super(matricula, color, asientos, ruedas);
		this.kw = kw;
		this.isItv();

	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + getMatricula() + ", color=" + getColor() + ", asientos=" + getAsientos()
				+ ", ruedas=" + getRuedas() + ", itv=" + isItv() + "]";
	}

}
