package edu.utn.intermedio.modelo;

public class Boxeador {
	
	private String nombre;
	private Categoria categoria;
	
	public Boxeador(String x) {
		this.nombre = x;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return nombre + " - " + laCategoria;
	}
	
	
	
	
	
}
