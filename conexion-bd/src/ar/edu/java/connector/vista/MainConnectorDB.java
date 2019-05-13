package ar.edu.java.connector.vista;

import ar.edu.java.connector.dao.MySQLConnectorDAO;

public class MainConnectorDB {

	public static void main(String[] args) {
		MySQLConnectorDAO dao = new MySQLConnectorDAO();
		
		dao.getAutos();
		
	}

}
