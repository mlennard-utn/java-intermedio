package edu.utn.intermedio.main;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;

public class IncripcionGimnasio {

	public static void main(String[] args) {
		
		Boxeador box = new Boxeador("Pepe");
		Boxeador box2 = new Boxeador("Pipo");
		box2.setCategoria(Categoria.pesado);
		Boxeador box3 = new Boxeador("Peppo");
		
		Entrenador ent = new Entrenador("Juan", Categoria.mediano, 
						Categoria.welter, 2);
		
		ent.setAnioNacimiento(1999);
		System.out.println(ent.esMayorDeEdad());
		box2.setAnioNacimiento(2002);
		System.out.println(box2.esMayorDeEdad());
		
		ent.setIdentificacion("1321321");
				
		ent.asignarBoxeador(box);
		ent.asignarBoxeador(box2);
		ent.asignarBoxeador(box3);
		
		ent.presentarse();
		
		System.out.println("Mostrar boxeadores:");
		ent.imprimirBoxeadores();

	}

}
