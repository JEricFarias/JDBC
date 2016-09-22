package br.com.jdbc.factory;

import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.Connection;

public class ConnectionFactory{
	
	public static Connection getConnection(){
		String url = "jdbc:postgresql://localhost:5432/livraria";
		String user = "postgres";
		String password = "qwer1234";
		try{
			return DriverManager.getConnection(url, user, password);
		}catch(SQLException e){
			System.out.println(e.toString());
			return null;
		}
	}
	
	public Integer getId(){
		return 3;
	}
	
	public static void main(String [] args) throws SQLException{
		Connection com = ConnectionFactory.getConnection();
		System.out.println("Fincionou");
		com.close();
	}

}
