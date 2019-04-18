package edu.utn.intermedio.modelo;

public enum Categoria {
	mediano(10,20),
	pesado(22,990),
	welter(1,8);
	
	private int pesoMinimo;
	private int pesoMaximo;
	
	private Categoria(int min, int max) {
		this.pesoMinimo = min;
		this.pesoMaximo = max;
	}
	
	public int minimo() {
		return pesoMinimo;
	}
	
	public int maximo() {
		return pesoMaximo;
	}
	

}
