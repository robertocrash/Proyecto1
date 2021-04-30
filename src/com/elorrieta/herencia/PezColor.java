package com.elorrieta.herencia;

public class PezColor extends Pez {

	private String color;

	public String getColor() {
		return color;
	}

	public PezColor(String color) {
		this();
		this.color = color;
	}

	public PezColor() {

	}

	public void setColor(String color) {
		this.color = color;
	}

}
