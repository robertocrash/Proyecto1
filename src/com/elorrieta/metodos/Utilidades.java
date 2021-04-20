package com.elorrieta.metodos;

public class Utilidades {

	// main es un metodo dnde vamos a ejecutar el programa
	public static void main(String[] args) {

		// El metodo saludar esta sobrecargado, se llama igual pero tiene distintos
		// parametros
		saludar();
		saludar(" Don Pimpon");
		saludar(" Josebita");

		saludar("Paco", "castellano");
		saludar("Patxi", "Euskera");

		float precio = calculoIva(100f, 21f);
		System.out.println("El precio con iva es: " + precio);

		int sumita = suma(2, 3);
		System.out.println("La suma es: " + sumita);

		int numeroMayor = numeroMayor(3, 7, 3);
		System.out.println("El mayor numero es: " + numeroMayor);

		if (isKapikua(54)) {
			System.out.println("Es kapikua");
		} else {
			System.out.println("No es kapikua ");
		}

	}
	/* vamos a declarar nuevos metodos */

	/**
	 * metodo publico que no retorna nada "void". Saluda por consola
	 */

	// vamos a declara nuevos metodos
	public static void saludar() {
		System.out.println("Aupa, que tal?");
	}

	public static void saludar(String nombre) {
		System.out.println("kaixo" + nombre);
	}

	/**
	 * 
	 * @param nombre String con el nombre de la persona a saludar
	 * @param idioma String, si pones "castellano" saluda en castellano, cualquier
	 *               otro valor en Euskera
	 */
	public static void saludar(String nombre, String idioma) {
		if (idioma.equals("castellano")) {
			System.out.println("Hola " + nombre);
		} else {
			System.out.println("Kaixo " + nombre);
		}
	}

	public static float calculoIva(float precioSinIva, float Iva) {
		float precioConIva = precioSinIva + (precioSinIva * Iva / 100);

		return precioConIva;
	}

	public static int suma(int num1, int num2) {
		// metodo que devuelva una suma
		int LaSuma = num1 + num2;

		return LaSuma;
	}

	public static int numeroMayor(int num1, int num2, int num3) {
		// metodo que devuelva el numero mayor
		int resultado;
		if (num1 >= num2 && num1 >= num3) {
			resultado = num1;
		} else {
			if (num2 > num3) {
				resultado = num2;
			} else {
				resultado = num3;
			}

		}
		return resultado;
	}

	public static boolean isKapikua(int numero) {
		// Cambiar el retorno y hacer el algoritmo
		boolean resultado;
		int inverso = 0;
		int resto = 0;
		int numerosinmodificar = 0;
		numerosinmodificar = numero;

		while (numero > 0) {

			resto = numero % 10;
			inverso = inverso * 10 + resto;
			numero = numero / 10;
		}

		if (numerosinmodificar == inverso) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

}
