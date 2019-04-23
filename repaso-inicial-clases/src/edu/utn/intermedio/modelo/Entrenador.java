package edu.utn.intermedio.modelo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Entrenador extends Persona implements Identificable {
	
	private int cantidadMaximaBoxeadores;
	private Collection<Boxeador> boxeadores;
	private Categoria[] categorias;

	public Entrenador(String y, Categoria cat1, 
			Categoria cat2, int maximo) {
		this.setNombre(y);
		categorias = new Categoria[2];
		categorias[0] = cat1;
		categorias[1] = cat2;
		boxeadores = new ArrayList<Boxeador>();
		cantidadMaximaBoxeadores = maximo;
	}
	
	public void entrenar() {
		Random random = new Random();
		for (Boxeador boxeador : boxeadores) {
			boxeador.entrenarse(random.nextInt(5),random.nextBoolean());
		}
	}
	
	public boolean asignarBoxeador(Boxeador b) {
		if(boxeadores.size() >= cantidadMaximaBoxeadores) {
			return false;
		} else {
			boxeadores.add(b);
		}
		return true;
	}
	
	public void imprimirBoxeadores() {
		for (Boxeador boxeador : boxeadores) {
			System.out.println(boxeador);
		}
	}

	@Override
	public void presentarse() {
		StringBuilder presentacion = new StringBuilder();
		presentacion.append(getIdentificacion());
		presentacion.append(" : ");
		presentacion.append("[").append(this.categorias[0]);
		presentacion.append(",").append(this.categorias[1]);
		presentacion.append("]");
		System.out.println(presentacion.toString());
	}

	@Override
	public String identificate() {
		return "entrenador: " + this.getIdentificacion();
	}
	
	

}
