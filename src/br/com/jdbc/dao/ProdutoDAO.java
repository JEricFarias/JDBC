package br.com.jdbc.dao;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.imageio.spi.RegisterableService;

import br.com.jdbc.factory.ConnectionFactory;
import br.com.jdbc.model.Produto;


public class ProdutoDAO {
	public void inserir(Produto produto){
		String dml = "INSERT INTO produto(nome, descricao, preco) " + "VALUES(?, ?, ?)"; 
		Connection connection = null;
		PreparedStatement pstm = null;
		
		try{
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);
			pstm = connection.prepareStatement(dml);
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setDouble(3, produto.getValor());
			pstm.execute();
			
		}catch(Exception e){
			e.printStackTrace();
			try{
				if(connection != null){
					connection.rollback();
				}
			}catch(SQLException r){
				r.printStackTrace();
			}
		}finally{
			try{
				if(pstm != null){
					pstm.close();
				}
				if(connection != null){
					connection.commit();
					connection.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public Produto recuperar (String nome){
		
		String dml = "SELECT * FROM produto WHERE nome LIKE %?%";
		
		Connection connection = null;
		PreparedStatement statement = null;
		try{
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(dml);
			ResultSet rest = statement.getResultSet();
			rest.getInt
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			
		}
		
		
		
		return
	}
}
