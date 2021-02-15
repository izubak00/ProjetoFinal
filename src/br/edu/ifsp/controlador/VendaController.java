package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.LivroDAO;
import br.edu.ifsp.modelo.Livro;
import br.edu.ifsp.tela.TelaInsere;
import br.edu.ifsp.tela.TelaVenda;
import br.edu.ifsp.tela.TelaVerificaAtualiza;

public class VendaController implements ActionListener{

	private TelaVenda tela;
	private Livro livro;
	ArrayList<Livro> lista = new ArrayList<Livro>();
	private double total = 0;
	
	public VendaController(TelaVenda tv) {
		this.tela = tv;
		livro = new Livro();
		this.tela.getBtnAdicionar().addActionListener(this);
		this.tela.getBtnBuscar().addActionListener(this);
		this.tela.getBtnRemover().addActionListener(this);
		this.tela.getBtnFinalizarCompra().addActionListener(this);
		this.tela.getBtnVoltar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnBuscar()) {
			
			LivroDAO dao = new LivroDAO();
			livro = dao.consultarLivro(this.tela.getTextNome().getText());
			if (dao.verificaExiste(livro)) {
				tela.setTextAreaBusca("ID: " + livro.getId() + " Nome: "+ livro.getNome() + " Preço: " + livro.getPreco() + " Quantidade: " + livro.getQtd() + "\n");
				tela.getBtnAdicionar().setEnabled(true);
			}else {
				TelaVerificaAtualiza tva = new TelaVerificaAtualiza();
				VerificaAtController iac = new VerificaAtController(tva);
				tva.setVisible(true);
			}
		}
		
		if(e.getSource() == this.tela.getBtnAdicionar()) {
			
			LivroDAO dao = new LivroDAO();
			livro = dao.consultarLivro(this.tela.getTextNome().getText());
			
			if (livro.getQtd() >= Integer.parseInt(tela.getTextFieldQtd().getText())) {
				livro.setQtd(Integer.parseInt(tela.getTextFieldQtd().getText()));
			}else {
				JOptionPane.showMessageDialog(null, "Quantidade maior que a disponivel");
			}
			
			/*for (Livro l : lista) {
				if (livro.getId() == l.getId()) {
					JOptionPane.showMessageDialog(null, "O item ja esta no carrinho");
					break;
				}else {
					lista.add(livro);
					total = (total + (livro.getPreco() * livro.getQtd()));
				}
			}*/
			
			lista.add(livro);
			total = (total + (livro.getPreco() * livro.getQtd()));
			tela.LimparTxtArea();
			for (Livro l : lista) {
				tela.setTextArea(" Nome: "+ l.getNome() + " Preço: " + l.getPreco() + " Quantidade: " + l.getQtd() + "\n");
			}
			
			tela.setTextFieldTotal(String.valueOf(total));	
			tela.getBtnAdicionar().setEnabled(false);
			tela.getBtnRemover().setEnabled(true);
			tela.getBtnFinalizarCompra().setEnabled(true);
		}
		
		if(e.getSource() == this.tela.getBtnRemover()) {
			
			LivroDAO dao = new LivroDAO();
			livro = dao.consultarLivro(this.tela.getTextNome().getText());
			
		}
		
		if(e.getSource() == this.tela.getBtnFinalizarCompra()) {
			
			LivroDAO dao = new LivroDAO();
			for (Livro l : lista) {
				livro = dao.consultarLivro(l.getNome());
				dao.atualizarQtd(l.getId(), (livro.getQtd() - l.getQtd()));
			}
			tela.LimparTxtArea();
			lista.clear();
			total = 0;
			tela.setTextFieldTotal(String.valueOf(total));
		}
		
		if(e.getSource() == this.tela.getBtnVoltar()) {
			tela.setVisible(false);
		}
		
	}

}

