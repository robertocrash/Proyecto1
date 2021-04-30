package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListadoPokemon {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(
						"SELECT id, nombre, numero, precio, brillante FROM pokemon ORDER BY nombre ASC; ");

		) {

			while (rs.next()) {

				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String numero = rs.getString("numero");
				float precio = rs.getFloat("precio");
				int brillante = rs.getInt("brillante");

				// Muestro por pantalla
				System.out.println("ID: " + id + " - " + "Nombre: " + nombre + " /" + "Numero: " + numero + " /"
						+ "Precio: " + precio + "€" + " /" + "Brillante: " + brillante);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// metodo main

}
