package com.elorrieta.primerdia;

import java.util.Scanner;

public class SueldoOperario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int HorasTrabajadas = 0;
		int CostoHora = 0;
		int Sueldo = 0;

		System.out.println("Introduzca por favor las horas trabajadas:");
		HorasTrabajadas = teclado.nextInt();

		System.out.println("Introduzca el coste de las horas:");
		CostoHora = teclado.nextInt();

		Sueldo = HorasTrabajadas * CostoHora;
		System.out.println("El sueldo del trabajador es:" + Sueldo);
		teclado.close();
	}

}
