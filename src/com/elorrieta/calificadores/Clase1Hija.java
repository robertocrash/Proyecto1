package com.elorrieta.calificadores;

public class Clase1Hija {

	public static void main(String[] args) {

		String a = Clase1.a1;// Puede todo el mundo

		String b = Clase1.aPackaged;// Como es de mi paquete puedo acceder

		String c = Clase1.aprotected;// Como soy hijo puedo

	}

}
