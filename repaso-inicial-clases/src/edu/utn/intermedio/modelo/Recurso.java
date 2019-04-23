package edu.utn.intermedio.modelo;

public class Recurso implements Identificable{
	private String etiqueta;

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	@Override
	public String identificate() {
		return "recurso: " + this.etiqueta;
	}
	
}
