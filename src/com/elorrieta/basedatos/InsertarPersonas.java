package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPersonas {
	public static void main(String[] args) {

		String sql = "INSERT INTO person (id, name) VALUES ( ?, ?) ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// TODO pedir datos por consola
			Scanner teclado = new Scanner(System.in);

			// Voy a insertar una persona(nombre) con un id

			// prueba
			String nombre1 = "";
			int id1 = 0;

			String nombre = "";
			int id = 0;

			System.out.println("Introduce un nombre:");
			nombre = teclado.nextLine();
			System.out.println("Introduce el id:");
			id = Integer.parseInt(teclado.nextLine());

			// prueba

			System.out.println("Introduce un nombre:");
			nombre1 = teclado.nextLine();
			System.out.println("Introduce el id:");
			id1 = Integer.parseInt(teclado.nextLine());

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);
			pst.setString(2, nombre);

			// test
			pst.setInt(1, id1);
			pst.setString(2, nombre1);

			pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado

			System.out.println("Persona insertada");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
