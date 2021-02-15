package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaInsere extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldNome;
	private JTextField txtFieldPreco;
	private JTextField txtFieldQtd;
	private JButton btnInserir;
	private JButton btnVoltar;

	public TelaInsere() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(10, 36, 46, 14);
		contentPane.add(lblPreo);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 61, 64, 14);
		contentPane.add(lblQuantidade);
		
		txtFieldNome = new JTextField();
		txtFieldNome.setBounds(85, 8, 86, 20);
		contentPane.add(txtFieldNome);
		txtFieldNome.setColumns(10);
		
		txtFieldPreco = new JTextField();
		txtFieldPreco.setBounds(85, 33, 86, 20);
		contentPane.add(txtFieldPreco);
		txtFieldPreco.setColumns(10);
		
		txtFieldQtd = new JTextField();
		txtFieldQtd.setBounds(85, 58, 86, 20);
		contentPane.add(txtFieldQtd);
		txtFieldQtd.setColumns(10);
		
		btnInserir = new JButton("Inserir");
		btnInserir.setBounds(10, 89, 89, 23);
		contentPane.add(btnInserir);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(109, 89, 89, 23);
		contentPane.add(btnVoltar);
	}
	
	public JTextField getTxtFieldPreco() {
		return txtFieldPreco;
	}

	public void setTxtFieldPreco(JTextField txtFieldPreco) {
		this.txtFieldPreco = txtFieldPreco;
	}

	public JTextField getTxtFieldQtd() {
		return txtFieldQtd;
	}

	public void setTxtFieldQtd(JTextField txtFieldQtd) {
		this.txtFieldQtd = txtFieldQtd;
	}

	public JTextField getTxtFieldNome() {
		return txtFieldNome;
	}

	public void setTxtFieldNome(JTextField txtFieldNome) {
		this.txtFieldNome = txtFieldNome;
	}

	public JButton getbtnInserir() {
		return btnInserir;
	}

	public void setbtnInserir(JButton btnInserir) {
		this.btnInserir = btnInserir;
	}
	
	public JButton getbtnVoltar() {
		return btnVoltar;
	}

	public void setbtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}
}
