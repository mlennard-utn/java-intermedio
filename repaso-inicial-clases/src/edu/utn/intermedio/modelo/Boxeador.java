package edu.utn.intermedio.modelo;

import java.time.LocalDate;

public class Boxeador extends Persona {
	
	private Categoria categoria;
	
	public Boxeador(String x) {
		this.setNombre(x);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		String laCategoria = (categoria == null?"sin categoria":categoria.toString());
		return this.getNombre() + " - " + laCategoria;
	}

	@Override
	public void presentarse() {
		String presentacion = String.format("%s : %s : %s", 
								getNombre(), getCategoria().toString(), 
								getIdentificacion());
		System.out.println(presentacion);
	}

	@Override
	public boolean esMayorDeEdad() {
		LocalDate fecha = LocalDate.now();
		int anioActual = fecha.getYear();
		return anioActual - this.getAnioNacimiento() >= 15;
	}
	
	
}
