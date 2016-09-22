package br.com.jdbc.factory;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import java.sql.Connection;

public class ConnectionFactory{
	
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:postgresql://localhost:5432/livraria";
		String user = "postgres";
		String password = "qwer1234";
		try{
			return DriverManager.getConnection(url, user, password);
		}catch(Error e){
			throw new RuntimeErrorException(e);
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
