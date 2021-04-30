package com.elorrieta.herencia;

public class Pez extends Animal {

	// El pez puede nadar
	private boolean acuatico;

	public Pez() {
		super();
		this.acuatico = true;
	}

	public boolean isAcuatico() {
		return acuatico;
	}

	public void setAcuatico(boolean acuatico) {
		this.acuatico = acuatico;
	}

	@Override
	public void cantar() {

		System.out.println("glu glu glu");
	}

}
