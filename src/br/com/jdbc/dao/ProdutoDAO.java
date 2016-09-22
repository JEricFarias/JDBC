package br.com.jdbc.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.jdbc.factory.ConnectionFactory;
import br.com.jdbc.model.Produto;


public class ProdutoDAO {
	public void inserir(Produto produto){
		String dml = "INSERT INTO produto(nome, descricao, preco) " + "VALUES(?, ?, ?)"; 
		Connection connection = null;
		PreparedStatement pstm = null;
		
		try{
			connection = ConnectionFactory.getConnection();
			pstm = connection.prepareStatement(dml);
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setDouble(3, produto.getValor());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstm != null){
					pstm.close();
				}
				if(connection != null){
					//connection.commit();
					connection.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
