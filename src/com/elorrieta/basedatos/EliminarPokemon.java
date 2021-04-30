package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarPokemon {

	public static void main(String[] args) {

		// Para eliminar la fila del pokemon que queramos
		String sql = "DELETE FROM pokemon WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Dime el ID para eliminar una pokemon:");
			int id = Integer.parseInt(sc.nextLine());

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			if (filas == 1) {
				System.out.println("Hemos eliminado " + filas + " pokemon");
			} else {
				System.out.println("Persona no encontrada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}