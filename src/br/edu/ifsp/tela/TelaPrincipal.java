package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class TelaPrincipal extends JFrame {
	
	private JButton btnControleDeEstoque;
	private JButton btnControleDeVenda;

	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblLivraria = new JLabel("LIVRARIA XYZ");
		lblLivraria.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLivraria.setBounds(105, 23, 213, 46);
		getContentPane().add(lblLivraria);
		
		JLabel lblSelecioneAOperao = new JLabel("Selecione a opera\u00E7\u00E3o desejada");
		lblSelecioneAOperao.setBounds(116, 80, 228, 14);
		getContentPane().add(lblSelecioneAOperao);
		
		btnControleDeEstoque = new JButton("Controle de Estoque");
		btnControleDeEstoque.setBounds(52, 105, 131, 39);
		getContentPane().add(btnControleDeEstoque);
		
		btnControleDeVenda = new JButton("Controle de Venda");
		btnControleDeVenda.setBounds(217, 105, 131, 39);
		getContentPane().add(btnControleDeVenda);
	}
	
	public JButton getbtnControleDeEstoque() {
		return btnControleDeEstoque;
	}

	public void setbtnControleDeEstoque(JButton btnControleDeEstoque) {
		this.btnControleDeEstoque = btnControleDeEstoque;
	}
	
	public JButton getbtnControleDeVenda() {
		return btnControleDeVenda;
	}

	public void setbtnControleDeVenda(JButton btnControleDeVenda) {
		this.btnControleDeVenda = btnControleDeVenda;
	}
}
