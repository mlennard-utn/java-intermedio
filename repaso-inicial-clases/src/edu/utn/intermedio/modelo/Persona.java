package edu.utn.intermedio.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Persona {
	
	private String nombre;
	private int anioNacimiento;
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return this.nombre;
	}
	
	public abstract void presentarse();
	
	public boolean esMayorDeEdad() {
		LocalDate fecha = LocalDate.now();
		int anioActual = fecha.getYear();
		return anioActual - anioNacimiento >= 18;
	}
	
	public boolean esNombreValido() {
		return nombre != null && nombre.length() > 10;
	}
	
	
	
}
