package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;

public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextArea textAreaBusca;
	private JButton btnBuscar;
	private JTextArea textAreaCarrinho;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JButton btnFinalizarCompra;
	private JTextField textFieldTotal;
	private JLabel lblQuantidade;
	private JTextField textFieldQtd;
	private JButton btnVoltar;

	public TelaVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(46, 8, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textAreaBusca = new JTextArea();
		textAreaBusca.setEditable(false);
		textAreaBusca.setBounds(10, 37, 414, 22);
		contentPane.add(textAreaBusca);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(162, 7, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblCarrinho = new JLabel("Carrinho");
		lblCarrinho.setBounds(10, 125, 46, 14);
		contentPane.add(lblCarrinho);
		
		textAreaCarrinho = new JTextArea();
		textAreaCarrinho.setEditable(false);
		textAreaCarrinho.setBounds(10, 142, 414, 122);
		contentPane.add(textAreaCarrinho);
		
		btnAdicionar = new JButton("Adicionar ao Carrinho");
		btnAdicionar.setEnabled(false);
		btnAdicionar.setBounds(10, 91, 142, 23);
		contentPane.add(btnAdicionar);
		
		btnRemover = new JButton("Remover do Carrinho");
		btnRemover.setEnabled(false);
		btnRemover.setBounds(162, 91, 142, 23);
		contentPane.add(btnRemover);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(10, 275, 46, 14);
		contentPane.add(lblTotal);
		
		btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.setEnabled(false);
		btnFinalizarCompra.setBounds(10, 297, 111, 23);
		contentPane.add(btnFinalizarCompra);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setEditable(false);
		textFieldTotal.setBounds(46, 272, 86, 20);
		contentPane.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 66, 74, 14);
		contentPane.add(lblQuantidade);
		
		textFieldQtd = new JTextField();
		textFieldQtd.setBounds(74, 63, 86, 20);
		contentPane.add(textFieldQtd);
		textFieldQtd.setColumns(10);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(131, 297, 89, 23);
		contentPane.add(btnVoltar);
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public JTextArea getTextAreaBusca() {
		return textAreaBusca;
	}

	public void setTextAreaBusca(String text) {
		textAreaBusca.setText(text);
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public void setBtnAdicionar(JButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}

	public JButton getBtnRemover() {
		return btnRemover;
	}

	public void setBtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}

	public JButton getBtnFinalizarCompra() {
		return btnFinalizarCompra;
	}

	public void setBtnFinalizarCompra(JButton btnFinalizarCompra) {
		this.btnFinalizarCompra = btnFinalizarCompra;
	}

	public JTextField getTextFieldTotal() {
		return textFieldTotal;
	}

	public void setTextFieldTotal(String text) {
		textFieldTotal.setText(text);
	}

	public JTextField getTextFieldQtd() {
		return textFieldQtd;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}
	
	public void LimparTxtArea() {
		textAreaCarrinho.setText("");
	}

	public void setTextArea(String text) {		
		textAreaCarrinho.append(text);
	}
}
