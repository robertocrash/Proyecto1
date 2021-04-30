package com.elorrieta.herencia.GuerreroOrco;

/**
 * Vamos a crear una clase llamada guerrero (sera la clase padre de los orcos)
 * Asignaremos como propiedades: altura, colorDePiel, vida, inteligencia,
 * agilidad, y fuerza
 * 
 * @author cursos_externos
 *
 */
public class Guerrero implements Atacar {

	private double altura;
	private String colorDePiel;
	private int vida;
	private int inteligencia;
	private int agilidad;
	private int fuerza;

	public Guerrero(double altura, String colorDePiel, int vida, int inteligencia, int agilidad, int fuerza) {
		super();
		this.altura = altura;
		this.colorDePiel = colorDePiel;
		this.vida = vida;
		this.inteligencia = inteligencia;
		this.agilidad = agilidad;
		this.fuerza = fuerza;
	}

	@Override
	public String toString() {
		return "Guerrero [altura=" + altura + ", colorDePiel=" + colorDePiel + ", vida=" + vida + ", inteligencia="
				+ inteligencia + ", agilidad=" + agilidad + ", fuerza=" + fuerza + "]";
	}

	public void ataque() {
		System.out.println("Te ataco y te mueres.");
	}

	public void saludar() {
		System.out.println("Hola! Te gusta mi Espada?");
	}

	public void bailar() {
		System.out.println("Mira como bailo!");
	}

	public void correr() {
		System.out.println("Estoy corriendo cual relampago!");
	}

	public int atacar() {
		setFuerza(getFuerza() * 3);
		return getFuerza();

	}

	// test random
	public void elixirVida() {
		setVida(getVida() + 100);
		// return getVida();

	}

	// fin test

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getColorDePiel() {
		return colorDePiel;
	}

	public void setColorDePiel(String colorDePiel) {
		this.colorDePiel = colorDePiel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

}
