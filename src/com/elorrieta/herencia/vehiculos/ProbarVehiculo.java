package com.elorrieta.herencia.vehiculos;

public class ProbarVehiculo {
	public static void main(String[] args) {

		Vehiculo coche = new Vehiculo("JPK85621", "Blanco", 5, 4);
		System.out.println(coche.toString());

		CocheElectrico cocheE = new CocheElectrico("POU620383", "blanco", 4, 4, true);
		cocheE.getKw();
		System.out.println(cocheE.toString());

		CocheGasolina cocheG = new CocheGasolina("LKP1836736", "Verde", 4, 20, 100, 1000);
		System.out.println(cocheG.toString());

		cocheG.arrancar();
		cocheG.parar();

	}// main

}
