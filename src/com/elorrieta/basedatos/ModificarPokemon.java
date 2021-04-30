package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPokemon {

	public static void main(String[] args) {

		// Para modificar los valores que queramos de nuestra base de datos
		String sql = "UPDATE pokemon SET nombre = ?, numero = ?, precio = ?, brillante = ? WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// Quiero modificar el nombre del pokemon, llamamos al ID.
			System.out.println("Dime el ID para modificar un pokemon");
			int id = Integer.parseInt(sc.nextLine());

			// Pedimos introducir el nombre del pokemon
			System.out.println("Introduzca el nombre nuevo:");
			String nombre = sc.nextLine();
			// Pedimos introducir el numero
			System.out.println("Introduzca el numero nuevo:");
			String numero = sc.nextLine();
			// Pedimos introducir el precio
			System.out.println("Introduzca el precio nuevo");
			float precio = Float.parseFloat(sc.nextLine());

			// Pedimos introducir si es brillante o no
			System.out.println("Introduzca si es brillante o no");
			String isbrillante = sc.nextLine();
			boolean brillante = false;

			// Si el usuario introduce s/si el pokemon es brillante, si escribe cualquier
			// otra cosa sera NO brillante
			if ("s".equalsIgnoreCase(isbrillante) || "si".equalsIgnoreCase(isbrillante)) {
				brillante = true;
			}

			// Aplico los cambios cambiando las '?' de SQL
			pst.setString(1, nombre);
			pst.setString(2, numero);
			pst.setFloat(3, precio);
			pst.setBoolean(4, brillante);

			pst.setInt(5, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			if (filas == 1) {
				System.out.println("Pokemon modificado");
			} else {
				System.out.println("Pokemon NO modificado");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// metodo main

}