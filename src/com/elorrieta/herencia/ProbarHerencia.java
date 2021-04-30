package com.elorrieta.herencia;

public class ProbarHerencia {

	public static void main(String[] args) {

		Animal aCerdo = new Animal("cerdo");
		aCerdo.cantar();
		System.out.println(aCerdo.toString());

		Pajaro pColibri = new Pajaro("Colibri");
		pColibri.cantar();
		System.out.println("Puede volar " + pColibri.isVolador());
		System.out.println(pColibri.toString());

		Pajaro pPinguino = new Pajaro();
		pPinguino.setNombre("pinguino");
		pPinguino.setVolador(false);
		pPinguino.cantar();
		System.out.println("Puede volar " + pPinguino.isVolador());

		Perro p1 = new Perro();
		p1.setNombre("Snoppy");
		p1.cantar();

		PerroPresa p2 = new PerroPresa();
		p2.setNombre("Bubba");
		p2.cantar();

		// Voy a crear un pez (Nemo)
		Pez pPez = new Pez();
		pPez.setNombre("NemoPlastico");
		pPez.setAcuatico(false);
		pPez.cantar();
		System.out.println("Este pez llamado " + pPez.getNombre() + " nada?:" + pPez.isAcuatico());

		// creo un pez de color
		PezColor pColor = new PezColor();
		pColor.setNombre("Pez payaso");
		pColor.setAcuatico(true);
		pColor.setColor("rojo");
		System.out.println("el pez de nombre:" + pColor.getNombre() + " es de color " + pColor.getColor());

	}
}
