package edu.utn.intermedio.main;

import java.util.ArrayList;
import java.util.Collection;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;
import edu.utn.intermedio.modelo.Identificable;
import edu.utn.intermedio.modelo.Persona;
import edu.utn.intermedio.modelo.Recurso;

public class IncripcionGimnasio {

	public static void main(String[] args) {
		
		Collection<Identificable> activosGimnasio = new ArrayList();
		
		Boxeador box = new Boxeador("Pepe");
		activosGimnasio.add(box);
		
		Boxeador box2 = new Boxeador("Pipo");
		activosGimnasio.add(box2);
		box2.setCategoria(Categoria.pesado);
		box2.setCantidadMinutosEntrenamiento(15);
		
		Boxeador box3 = new Boxeador("Peppo");
		activosGimnasio.add(box3);
		
		Entrenador ent = new Entrenador("Juan", Categoria.mediano, 
						Categoria.welter, 3);
		activosGimnasio.add(ent);
		
		ent.setAnioNacimiento(1999);
		System.out.println(ent.esMayorDeEdad());
		box2.setAnioNacimiento(2002);
		System.out.println(box2.esMayorDeEdad());
		
		ent.asignarBoxeador(box);
		ent.asignarBoxeador(box2);
		ent.asignarBoxeador(box3);
		
		ent.presentarse();
		
		System.out.println("Mostrar boxeadores:");
		ent.imprimirBoxeadores();
		
		ent.entrenar();
		
		Recurso recurso1 = new Recurso();
		activosGimnasio.add(recurso1);
		recurso1.setEtiqueta("MN-0419");
		
		Recurso recurso2 = new Recurso();
		activosGimnasio.add(recurso2);
		recurso2.setEtiqueta("MN-0420");
		
		Recurso recurso3 = new Recurso();
		activosGimnasio.add(recurso3);
		recurso3.setEtiqueta("MN-0421");
		
		for (Identificable activo : activosGimnasio) {
			System.out.println(activo.identificate());
		}
		
	}

}
