package com.elorrieta.herencia.vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConcesionario {

	// Las variables que necesitamo en el metodo
	private static Scanner sc = new Scanner(System.in);
	private static String opcion = "";

	// Creacion del arrayList y lo importamos
	private static ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

	public static void main(String[] args) {
		System.out.println("Bienvenido");

		try {

			cargarVehiculos();

			do {

				menu();
				leerOpcion();

				switch (opcion) {

				case "1": {
					listar();
					break;
				}

				case "2": {
					darDeAlta();
					break;
				}

				case "3": {
					darDeBaja();
					break;
				}

				case "4": {
					System.out.println("****TODO*****Modificar, servicio no disponible");
					break;
				}

				case "s": {
					System.out.println("Adios");
					break;
				}

				default:
					System.out.println(opcion + " opcion no disponible");
					break;
				}

			} while (!"s".equalsIgnoreCase(opcion));

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Termina el programa");
	}// fin metodo main

	private static void darDeBaja() {
		// Para eliminar un vehiculo vamos a pedir la matricula
		System.out.println("Introduce la matricula del vehiculo que deseas eliminar:");
		String matriculaEliminada = sc.nextLine();
		boolean eliminado = false;
		for (Vehiculo vehiculo : stock) {

			if (matriculaEliminada.equals(vehiculo.getMatricula())) {
				stock.remove(vehiculo);
				eliminado = true;
				System.out.println("El vehiculo de " + matriculaEliminada + " ha sido eliminado.");
				break;// sale del bucle
			}
		} // for
		if (!eliminado) {
			System.out.println("coche no encontrado");

		}

	}// darDebaja

	private static void darDeAlta() {
		Vehiculo v2 = new Vehiculo();
		System.out.println("Introduce la matricula del vehiculo:");
		v2.setMatricula(sc.nextLine());

		System.out.println("Introduce el color del vehiculo:");
		v2.setColor(sc.nextLine());

		boolean repetir = true;
		do {
			System.out.println("Introduce el numero de asientos");
			try {
				v2.setAsientos(Integer.parseInt(sc.nextLine()));
				repetir = false;
				if (v2.getAsientos() <= 0) {
					repetir = true;
					System.out.println("formato incorrecto, escribe un numero mayor que cero");
				}
			} catch (Exception e) {
				System.out.println("formato incorrecto, escribe un numero");
			}

		} while (repetir);

		boolean repetir1 = true;
		do {
			System.out.println("Introduce el numero de ruedas:");
			try {
				v2.setRuedas(Integer.parseInt(sc.nextLine()));
				repetir1 = false;
				if (v2.getRuedas() <= 0) {
					repetir1 = true;
					System.out.println("formato incorrecto,escribe un numero mayor que 0");
				}
			}

			catch (Exception e) {
				System.out.println("formato incorrecto, escribe un numero");
			}

		} while (repetir1);

		stock.add(v2);
	}

	private static void listar() {
		System.out.println("--------------------------------------");
		System.out.println(" Listado Vehiculos");
		System.out.println("--------------------------------------");
		for (Vehiculo vehiculo : stock) {
			System.out.println(vehiculo);
		}
		System.out.println("");
		System.out.println("");

	}

	private static void cargarVehiculos() {
//Añadimos vehiculos a nuestra lista del Array

		stock.add(new Vehiculo("PJ12343", "Blanco", 4, 4));
		Vehiculo v1 = new Vehiculo();

		v1.setColor("Rojo");
		v1.setRuedas(4);
		v1.setAsientos(7);
		v1.setMatricula("PO432");
		stock.add(v1);
	}

	private static void leerOpcion() {

		System.out.println("Elije una opcion del menu:");
		opcion = sc.nextLine();
	}

	private static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Dar de Alta");
		System.out.println("3. Dar de baja");
		System.out.println("4. modificar");
		System.out.println("------------------");
		System.out.println("S- salir");

	}

}