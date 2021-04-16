package com.elorrieta.primerdia;

/**
 *Pedir por teclado la temperatura de los 7 dias de la semana y calcular media
 *@author Roberto Blanco Benito 
 */
import java.util.Scanner;

public class PedirTemperatura {

	public static void main(String[] args) {
		// METEMOS LA ENTRADA POR TECLADO
		Scanner teclado = new Scanner(System.in);

		// TAMBIEN SE PUEDE PONER DE LA SIGUIENTE MANERA:
		// float lunes,martes,miercoles,jueves,viernes,sabado,domingo; COGE POR DEFECTO

		float lunes = 0;
		float martes = 0;
		float miercoles = 0;
		float jueves = 0;
		float viernes = 0;
		float sabado = 0;
		float domingo = 0;

		System.out.println("Introduzca la temperatura del Lunes:");
		lunes = teclado.nextFloat();

		System.out.println("Introduzca la temperatura del Martes:");
		martes = teclado.nextFloat();

		System.out.println("Introduzca la temperatura del Miercoles:");
		miercoles = teclado.nextFloat();

		System.out.println("Introduzca la temperatura del Jueves:");
		jueves = teclado.nextFloat();

		System.out.println("Introduzca la temperatura del Viernes:");
		viernes = teclado.nextFloat();

		System.out.println("Introduzca la temperatura del Sabado:");
		sabado = teclado.nextFloat();

		System.out.println("Introduzca la temperatura del Domingo:");
		domingo = teclado.nextFloat();

		// CALCULAMOS LA MEDIA DE LAS TEMPERATURAS DE TODA LA SEMANA
		float MediaTemperatura = (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / 7;
		System.out.println("La temperatura media de la semana es:" + MediaTemperatura);

		// PONEMOS IF, SI LA TEMPERATURA ES MENOR QUE 20 HACE FRIO
		// SI LA TEMPERATURA ES MAYOR QUE 20 HACE CALOR
		if (MediaTemperatura < 20) {
			System.out.println("Hace frio");
		} else {
			System.out.println("Hace calor");
		}
		// CIERRO EL TECLADO
		teclado.close();
	}

}
