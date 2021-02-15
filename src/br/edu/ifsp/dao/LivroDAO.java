package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.modelo.Livro;

public class LivroDAO {
	
	public Conexao con = null;
	
	public void cadastrarLivro(Livro livro) {
		
		try {
		
			this.con = Conexao.getInstance();
		
			String sql = "insert into livro (nome, qtd, preco) values (?, ?, ?)";
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setString(1, livro.getNome());
			pstm.setInt(2, livro.getQtd());
			pstm.setDouble(3, livro.getPreco());
			pstm.executeUpdate();
			
			System.out.println("Livro cadastrado com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao cadastrar");
			e.printStackTrace();
		}	
	}
	
	public ArrayList<Livro> consultarTodos() {
		
		ArrayList<Livro> listaLivros = new ArrayList<Livro>();
		
		try {
			
			this.con = Conexao.getInstance();
			
			String sql = "SELECT * FROM livro";
			
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				Livro l = new Livro();
				l.setId(rs.getInt("id"));
				l.setNome(rs.getString("nome"));
				l.setPreco(rs.getDouble("preco"));
				l.setQtd(rs.getInt("qtd"));
				
				listaLivros.add(l);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return listaLivros;
	}

	public boolean verificaExiste(Livro livro) {		
		boolean resultado = false;
		int i = 0;
		
		try {
			
			this.con = Conexao.getInstance();
			
			String sql = "SELECT COUNT(*) AS total FROM livro where nome = ?";
			
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setString(1, livro.getNome());
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {

				i = rs.getInt("total");
			}
			
			if (i > 0) {
				resultado = true;
			}			

		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
	
	public Livro consultarLivro(String nome) {
		
		Livro l = new Livro();

		try {

			this.con = Conexao.getInstance();

			String sql = "SELECT * FROM livro WHERE nome = ?";

			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setString(1, nome);
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {
				
				l.setId(rs.getInt("id"));
				l.setNome(rs.getString("nome"));
				l.setPreco(rs.getDouble("preco"));
				l.setQtd(rs.getInt("qtd"));
			}

		} catch(SQLException e) {
			
			System.out.println("Problema ao encontrar uma pessoa");
			e.printStackTrace();
		}
		
		
		return l;
	}
	
	public void atualizarQtd(int id, int qtd) {
		
		try {
			
			this.con = Conexao.getInstance();
		
			String sql = "UPDATE livro SET qtd= ? WHERE `id` = ?";
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setInt(1, qtd);
			pstm.setInt(2, id);
			pstm.executeUpdate();
		
		} catch(SQLException e) {
			
			e.printStackTrace();
		}	
		
	}
}
