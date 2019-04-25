package edu.utn.intermedio.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		String[] arreglo = {"a", "bcb", "asd"};
		
		Integer[] enteros = {15,0,12,44,42,21,32,22,7};
		
		List<Integer> listaEnteros = Arrays.asList(enteros);
				
		List<String> lista = new ArrayList<>();
		List<String> lista1 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			lista.add("elemento-"+i);
		}
		
		for(int i = 0; i < 10; i++) {
			lista1.add(i, "elemento-"+i);
		}
		
		System.out.println(lista1.remove(5));
		
//		for(int i = 0; i < lista1.size() ; i ++) {
//			System.out.println(String.format("lista: %s vs lista1: %s", 
//										lista.get(i), lista1.get(i)));
//		}
		System.out.println("Recorro lista");
		
		lista1.forEach( elementoDeLista -> System.out.println(elementoDeLista) );
		
		
		System.out.println("Recorro lista:");
		listaEnteros.forEach(elem -> System.out.println(elem));
		System.out.println("Ordeno lista");
		listaEnteros.sort( (elem1, elem2) -> {
			if (elem1.intValue() > elem2.intValue()) {
				return 1;
			} else if (elem2.intValue() > elem1.intValue()) {
				return -1;
			} else {
				return 0;
			}
		} );
		
		System.out.println("Recorro lista:");
		listaEnteros.forEach(elem -> System.out.println(elem));

	}

}
