package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class TelaAtualiza extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textQtd;
	private JButton btnBuscar;
	private JButton btnAtualizar;
	private JTextArea textArea;
	private JButton btnVoltar;

	public TelaAtualiza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(57, 8, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 36, 89, 23);
		contentPane.add(btnBuscar);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 70, 269, 22);
		contentPane.add(textArea);
		
		JLabel lblNovaQuantidade = new JLabel("Nova Quantidade:");
		lblNovaQuantidade.setBounds(10, 108, 111, 14);
		contentPane.add(lblNovaQuantidade);
		
		textQtd = new JTextField();
		textQtd.setBounds(116, 105, 86, 20);
		contentPane.add(textQtd);
		textQtd.setColumns(10);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setEnabled(false);
		btnAtualizar.setBounds(10, 133, 89, 23);
		contentPane.add(btnAtualizar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 167, 89, 23);
		contentPane.add(btnVoltar);
	}
	
	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(String text) {
		textArea.setText(text);
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public JTextField getTextQtd() {
		return textQtd;
	}

	public void setTextQtd(JTextField textQtd) {
		this.textQtd = textQtd;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}
}
