package com.elorrieta.metodos;

import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {

		// Solicitar por pantalla el sueldo
		// Si el sueldo es mayor que 1000 se aplica un IVA del 5%
		// Si el sueldo es menor que 1000 se aplica un IVA del 0%
		// Si el sueldo es mayor que 2000 se aplica un IVA del 10%
		// Si el sueldo es mayor que 5000 se aplica un IVA del 25%
		Scanner teclado = new Scanner(System.in);

		// creo una variable llamada sueldo
		float sueldo = 0;
		float iva = 0;

		System.out.println("Introduce el sueldo que cobras: ");
		sueldo = teclado.nextFloat();

		// Utilidades.calculoIva(sueldo, 0);

		// Si el sueldo introducido por el usuario es mayor de 1000 se le aplicara un
		// IVA del 5%
		// Por el contrario si su sueldo es menor de 5000 no se le aplicara ningun IVA
		if (sueldo > 1000) {
			iva = 5;
			System.out.println("Se te ha aplicado un IVA del 5%");
		} else {
			iva = 0;
			System.out.println("Se te ha aplicado un IVA del 0%");
		}
		// Creo una variable llamada sueldorecibido que cogera la formula del
		// calculoIva(de la clase Utilidades)

		float sueldorecibido = Utilidades.calculoIva(sueldo, iva);
		System.out.println(
				"A tu sueldo de " + sueldo + " se le ha aplicado un IVA del " + iva + " y queda en:" + sueldorecibido);
		System.out.println("--------------------------------------------------------------------");
		// Quiero que me digas un numero el cual sera sumado por lo que decida el admin
		int numero1 = 0;
		int numeroañadido = 2;
		int numerosumado = Utilidades.suma(numero1, numeroañadido);

		// Pido al usuario que introduzca un numero
		System.out.println("Introduce un número por favor: ");
		numero1 = teclado.nextInt();

		System.out.println("Tu numero introducido ha ido el:" + numero1);
		System.out.println("El numero añadido por el admin ha sido:" + numeroañadido);
		System.out.println("La suma de ambos ha sido: " + numerosumado);
		teclado.close();
	}

}
