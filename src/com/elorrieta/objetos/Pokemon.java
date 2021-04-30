package com.elorrieta.objetos;

public class Pokemon implements Cantarin {

	public static final int PRECIO_MAXIMO = 2000;
	public static final int PRECIO_MINIMO = 0;
	// atributos
	private int id = 0;
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// constructor
	public Pokemon() {
		super();
		this.id = 0;
		this.nombre = "sin nombre";
		this.precio = 0;
		this.numero = 0;
		this.isBrillante = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pokemon(String nombre, float precio) {
		this(); // CUIDADO, cambiar super por this
		this.nombre = nombre;
		this.precio = precio;
	}

	public Pokemon(String nombre) {
		this(); // llamamos al constructor vacio
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return (isBrillante) ? (precio) : precio;
	}

	/**
	 * Setea el precio
	 * 
	 * @param precio float en euros
	 * @throws Exception si el precio < 0
	 */
	public void setPrecio(float precio) throws Exception {
		if (precio < 0) {
			throw new Exception("El precio debe ser 0 o superior");
		}
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", numero=" + numero
				+ ", isBrillante=" + isBrillante + "]";
	}

	@Override
	public void cantar() {
		// TODO Auto-generated method stub

	}

}
