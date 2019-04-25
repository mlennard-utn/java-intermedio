package edu.utn.intermedio.main;

import java.time.LocalDateTime;

public class TestLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime fechaHora = LocalDateTime.now();
		
		System.out.println("Hora del dia: " + fechaHora.getHour());
		System.out.println("Minutos del dia: " + fechaHora.getMinute());
		
		int horarioMilitar = fechaHora.getHour() * 100 + fechaHora.getMinute();
		
		System.out.println(horarioMilitar);
		
	}

}
