package br.edu.ifsp.tela;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class TelaEstoque extends JFrame {
	
	private JButton btnListarEstoque;
	private JButton btnAdicionarNovoLivro;
	private JButton btnAtualizarQuantidade;
	private JButton btnVoltar;
	private JTextArea textArea;

	public TelaEstoque() {
		setBounds(100, 100, 450, 357);
		getContentPane().setLayout(null);
		
		btnListarEstoque = new JButton("Listar Estoque");
		btnListarEstoque.setBounds(10, 52, 109, 23);
		getContentPane().add(btnListarEstoque);
		
		btnAdicionarNovoLivro = new JButton("Adicionar novo Livro");
		btnAdicionarNovoLivro.setBounds(10, 11, 137, 23);
		getContentPane().add(btnAdicionarNovoLivro);
		
		btnAtualizarQuantidade = new JButton("Atualizar Quantidade");
		btnAtualizarQuantidade.setBounds(151, 11, 133, 23);
		getContentPane().add(btnAtualizarQuantidade);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 86, 317, 221);
		getContentPane().add(textArea);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(161, 52, 89, 23);
		getContentPane().add(btnVoltar);

	}
	
	public void LimparTxtArea() {
		textArea.setText("");
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(String text) {		
		textArea.append(text);
	}

	public JButton getbtnVoltar() {
		return btnVoltar;
	}

	public void setbtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	public JButton getbtnListarEstoque() {
		return btnListarEstoque;
	}

	public void setbtnListarEstoque(JButton btnListarEstoque) {
		this.btnListarEstoque = btnListarEstoque;
	}
	
	public JButton getbtnAdicionarNovoLivro() {
		return btnAdicionarNovoLivro;
	}

	public void setbtnAdicionarNovoLivro(JButton btnAdicionarNovoLivro) {
		this.btnAdicionarNovoLivro = btnAdicionarNovoLivro;
	}
	
	public JButton getbtnAtualizarQuantidade() {
		return btnAtualizarQuantidade;
	}

	public void setbtnbtnAtualizarQuantidade(JButton btnAtualizarQuantidade) {
		this.btnAtualizarQuantidade = btnAtualizarQuantidade;
	}
}
