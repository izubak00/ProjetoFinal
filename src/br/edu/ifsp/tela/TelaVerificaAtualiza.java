package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaVerificaAtualiza extends JFrame {

	private JPanel contentPane;
	private JButton btnSim;
	private JButton btnNo;

	public TelaVerificaAtualiza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 137);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Não existe o livro cadastrado, deseja cadastrar?");
		lblNewLabel.setBounds(10, 11, 296, 14);
		contentPane.add(lblNewLabel);
		
		btnSim = new JButton("Sim");
		btnSim.setBounds(10, 36, 89, 23);
		contentPane.add(btnSim);
		
		btnNo = new JButton("N\u00E3o");
		btnNo.setBounds(205, 36, 89, 23);
		contentPane.add(btnNo);
	}
	
	public JButton getbtnSim() {
		return btnSim;
	}

	public void setbtnSim(JButton btnSim) {
		this.btnSim = btnSim;
	}
	
	public JButton getbtnNo() {
		return btnNo;
	}

	public void setbtnNo(JButton btnNo) {
		this.btnNo = btnNo;
	}
}
