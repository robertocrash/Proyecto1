package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		// Para insertar datos a nuestra base de datos pokemon
		String sql = "INSERT INTO pokemon (nombre, numero, precio, brillante) VALUES (?, ?, ?, ?);";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// Esta es la forma de hacerlo hardcoreando (manualmente)

			// pst.setString(1, "Pikachu");
			// pst.setString(2, "PI_001");
			// pst.setFloat(3, 50.50f);
			// pst.setBoolean(4, true);

			// Ahora ejecutamos
			// pst.executeUpdate();

			// Pedimos al usuario que introduzca los datos

			String nombre = "";
			System.out.println("introduce un pokemon:");
			nombre = sc.nextLine();
			pst.setString(1, nombre);

			String numero = "";
			System.out.println("Introduce el numero del pokemon");
			numero = sc.nextLine();
			pst.setString(2, numero);

			float precio = 0;
			System.out.println("Introduce el precio del pokemon");
			precio = Float.parseFloat(sc.nextLine());
			pst.setFloat(3, precio);

			System.out.println("¿El pokemon es brillante? Si/No");
			String brillante = sc.nextLine();
			boolean isbrillante = false;
			if ("s".equalsIgnoreCase(brillante) || "si".equalsIgnoreCase(brillante)) {
				isbrillante = true;
			}
			pst.setBoolean(4, isbrillante);

			boolean repetir = true;

			// bucle
			do {

				try {

					if (1 == pst.executeUpdate()) {
						System.out.println("Pokemon guardado en la base de datos.");
						repetir = false;
					} else {
						System.out.println("No se ha insertado el pokemon");
					}
				} catch (Exception e) {
					// pedir de nuevo el numero, debido a que no puede estar repetido en la base de
					// datos
					System.out.println("Lo sentimos el numero " + numero + " ya esta asignado, por favor asigne otro:");
					numero = sc.nextLine();
					pst.setString(2, numero);
				}
			} while (repetir);
			// fin del bucle

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// metodo main

}
