package com.elorrieta.objetos;

public class cancion {

	// atributos

	private String nombre;
	private String grupo;
	private int duracion; // segundos

	public cancion() {
		super();
		this.nombre = "";
		this.grupo = "anonimo";
		this.duracion = 0;
	}

	@Override
	public String toString() {
		return "cancion [nombre=" + nombre + ", grupo=" + grupo + ", duracion=" + duracion + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) throws Exception {
		if (duracion > 400) {
			throw new Exception("Es una cancion muy larga");
		}
		this.duracion = duracion;
	}

}
