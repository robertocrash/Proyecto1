package com.elorrieta.herencia.vehiculos;

import java.util.ArrayList;

public class Concesionario {

	public static void main(String[] args) {

		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

		Coche c = new Coche();
		Avion a = new Avion();

		stock.add(c);
		stock.add(a);

		System.out.println("tenemos " + stock.size() + " vehiculos en stock");

		for (Vehiculo vehiculo : stock) {

			if (vehiculo instanceof Avion) {
				System.out.println("Este vehiculo es un avion");
				Avion avion = (Avion) vehiculo;
				avion.getAlas();
			}

			if (vehiculo instanceof Coche) {
				System.out.println("Este vehiculo es un coche");
				Coche coche = (Coche) vehiculo;
				coche.isItv();
			}

		} // for

	}
}
