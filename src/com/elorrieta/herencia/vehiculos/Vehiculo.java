package com.elorrieta.herencia.vehiculos;

public class Vehiculo implements IArrancable {

	private String matricula;
	private String color;
	private int asientos;
	private int ruedas;

	public Vehiculo() {
		super();
		this.matricula = "";
		this.color = "Blanco";
		this.asientos = 1;
		this.ruedas = 2;
	}

	public Vehiculo(String matricula, String color, int asientos, int ruedas) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.asientos = asientos;
		this.ruedas = ruedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", asientos=" + asientos + ", ruedas=" + ruedas
				+ "]";
	}

	@Override
	public void arrancar() {
		System.out.println("Vehiculo arrancado");

	}

	@Override
	public void parar() {
		System.out.println("Vehiculo parado");
	}

}
