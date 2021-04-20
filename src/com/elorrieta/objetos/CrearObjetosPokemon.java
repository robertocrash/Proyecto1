package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearObjetosPokemon {

	public static void main(String[] args) {
		// vamos a crear instancias

		// TODO crear toString en Pokemon
		// TODO crear la segunda cancion y mostrar por pantalla uno a uno los campos
		// TODO crear un pokemon, pero pedir los datos por pantalla con Scanner

		// Introduzco el teclado
		try {
			Scanner teclado = new Scanner(System.in);
			cancion c1 = new cancion();

			c1.setNombre("Enter SandMan");
			c1.setGrupo("Metallica");
			c1.setDuracion(46);
			System.out.println(c1.toString());
			System.out.println("----------------------------------------------------------------");
			cancion c2 = new cancion();

			c2.setNombre("Living on the edge");
			c2.setGrupo("Aerosmith");
			c2.setDuracion(34);
			System.out.println(c2.toString());

			System.out.println("----------------------------------------------------------------");

			// queremos crear a Pikachu

			Pokemon p1 = new Pokemon();

			p1.setNombre("Pikachu");
			p1.setNumero(0);
			p1.setPrecio(20000);
			p1.setBrillante(true);
			System.out.println(p1.toString());

			System.out.println("----------------------------------------------------------------");
			// queremos crear a charmander
			Pokemon p2 = new Pokemon();
			p2.setNombre("Charmander");
			p2.setNumero(3);
			p2.setPrecio(800);
			p2.setBrillante(true);
			System.out.println(p2.toString());
			System.out.println("----------------------------------------------------------------");

			// queremos crear a bulbasur
			Pokemon p3 = new Pokemon();
			p3.setNombre("Bulbasur");
			p3.setNumero(5);
			p3.setPrecio(500);
			p3.setBrillante(false);
			System.out.println(p3.toString());

			// crear otro pokemon pero pedir datos por pantalla
			Pokemon p4 = new Pokemon();
			System.out.println("Escribe el nombre del pokemon");
			String nombre = teclado.nextLine();
			// El usuario ha introducido el nombre por teclado, asique usamos set ya que
			// hemos modificado el nombre ( en este caso le hemos dado un nombre)
			p4.setNombre(nombre);
			System.out.println("Escribe el numero del pokemon:");
			int numero = 0;
			do {
				try {
					numero = teclado.nextInt();
				} catch (Exception e) {
					System.out.println("Formato erroneo, vuelva a introducir el numero");
				}
			} while (numero <= 0);
			p4.setNumero(numero);

			System.out.println("Escribe el precio del pokemon:");
			int precio = teclado.nextInt();
			p4.setPrecio(precio);

			System.out.println("Escribe si pokemon es brillante(escribe si o no):");
			boolean brillante = teclado.nextBoolean();
			p4.setBrillante(brillante);

			System.out.println(p4.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
