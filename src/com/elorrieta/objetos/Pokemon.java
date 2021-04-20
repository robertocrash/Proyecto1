package com.elorrieta.objetos;

public class Pokemon {
	// atributos
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// constructor
	public Pokemon() {
		super();
		nombre = "sin nombre";
		precio = 0;
		numero = 0;
		isBrillante = false;

	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", precio=" + precio + ", numero=" + numero + ", isBrillante="
				+ isBrillante + "]";
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	/**
	 * 
	 * Setea el precio
	 * 
	 * @param precio float
	 * @throws Exception si el precio es < 0
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

}
