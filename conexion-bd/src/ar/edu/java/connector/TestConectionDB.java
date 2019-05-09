package ar.edu.java.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConectionDB {

	public static void main(String[] args) {
		
		// Registro del driver de conexion a la base de datos
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al recuperar el driver");
			e.printStackTrace();
			return;
		}
		System.out.println("Registro correcto del driver");
		
		Connection connection = null;

		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/java?useLegacyDatetimeCode=false&serverTimezone=UTC","javaintermedio", "JavaIntermedio@1234");

		} catch (SQLException e) {
			System.out.println("Fallo la conexion!! Mirar la consola con el resultado");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("Yoohoo !");
			
		} else {
			System.out.println("Fallo la conexion!");
		}
		
		
	}
}
