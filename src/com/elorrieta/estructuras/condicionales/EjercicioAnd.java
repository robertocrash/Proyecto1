package com.elorrieta.estructuras.condicionales;

public class EjercicioAnd {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 5;
		int num3 = 3;

		if (num1 > num2 && num1 > num3) {
			System.out.println("numero mas alto es: " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("numero mas alto es: " + num2);
			} else {
				System.out.println("numero mas alto es: " + num3);
			}
		}

		System.out.println("Otro ejercicio----------------------");

		int mes = 4;
		if (mes == 1 || mes == 2 || mes == 3) {
			System.out.println("Estamos en el primer trimestre");
		} else {
			System.out.println("NO estamos en el primer trimestre");
		}

	}

}
