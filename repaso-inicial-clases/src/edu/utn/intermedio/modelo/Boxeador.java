package edu.utn.intermedio.modelo;

import java.time.LocalDate;

public class Boxeador extends Persona implements Identificable{
	
	private Categoria categoria;
	private int cantidadMinutosEntrenamiento;
	
	public Boxeador(String x) {
		this.setNombre(x);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getCantidadMinutosEntrenamiento() {
		return cantidadMinutosEntrenamiento;
	}

	public void setCantidadMinutosEntrenamiento(int cantidadMinutosEntrenamiento) {
		this.cantidadMinutosEntrenamiento = cantidadMinutosEntrenamiento;
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
	
	public void entrenarse() {
		System.out.println("\nComienzo entrenamiento");
		for(int i = 0; i < cantidadMinutosEntrenamiento; i ++) {
			System.out.print("x");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nFin entrenamiento");
	}
	
	public void entrenarse(int cantidadMinutos, boolean intenso) {
		System.out.println("\nComienzo entrenamiento");
		String marcaEntrenamiento = intenso?"X":"x";
		for(int i = 0; i < cantidadMinutos; i++) {
			System.out.print(marcaEntrenamiento);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nFin entrenamiento");
	}

	public void entrenarse(int cantidadMinutos) {
		System.out.println("\nComienzo entrenamiento");
		for(int i = 0; i < cantidadMinutos; i ++) {
			System.out.print("x");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nFin entrenamiento");
		
	}

	@Override
	public String identificate() {
		return "boxeador: " + this.getIdentificacion();
	}
	
}
