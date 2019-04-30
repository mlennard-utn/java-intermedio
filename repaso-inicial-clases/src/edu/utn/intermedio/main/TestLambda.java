package edu.utn.intermedio.main;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		List<Integer> enteros = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			enteros.add(i);
		}

		System.out.println("Los valores son:");
		enteros.forEach(ent -> System.out.println(ent));

		/*
		 * enteros.replaceAll(ent -> { if (ent % 2 == 1) { double potencia =
		 * Math.pow(ent, 2); Double cuadrado = Double.valueOf(potencia); return
		 * cuadrado.intValue(); } return ent; });
		 * System.out.println("Los valores impares al cuadrado son:");
		 * enteros.forEach(ent -> System.out.println(ent));
		 */

		// Elimino los multiplos de 4
		enteros.removeIf(ent -> esMultiploDeCuatro(ent));

		System.out.println("Sin los multiplos de 4:");
		enteros.forEach(i -> System.out.println(i));

	}

	public static boolean esMultiploDeCuatro(Integer entero) {
		return entero % 4 == 0;
	}

}
