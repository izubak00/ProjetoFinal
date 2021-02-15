package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.LivroDAO;
import br.edu.ifsp.modelo.Livro;
import br.edu.ifsp.tela.TelaAtualiza;
import br.edu.ifsp.tela.TelaEstoque;
import br.edu.ifsp.tela.TelaInsere;

public class EstoqueController implements ActionListener{

	private TelaEstoque tela;
	private Livro livro;
	
	public EstoqueController(TelaEstoque te) {
		this.tela = te;
		this.tela.getbtnAdicionarNovoLivro().addActionListener(this);
		this.tela.getbtnAtualizarQuantidade().addActionListener(this);
		this.tela.getbtnListarEstoque().addActionListener(this);
		this.tela.getbtnVoltar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnAdicionarNovoLivro()) {
			
			TelaInsere ti = new TelaInsere();
			InsereController ic = new InsereController(ti);
			ti.setVisible(true);			
		}
		
		if(e.getSource() == this.tela.getbtnVoltar()) {
			
			tela.setVisible(false);
			
		}
		
		if(e.getSource() == this.tela.getbtnAtualizarQuantidade()) {
			
			TelaAtualiza ta = new TelaAtualiza();
			AtualizaController ic = new AtualizaController(ta);
			ta.setVisible(true);	
			
		}
		
		if(e.getSource() == this.tela.getbtnListarEstoque()) {
			
			tela.LimparTxtArea();
			
			ArrayList<Livro> lista = new ArrayList<Livro>();
			LivroDAO dao = new LivroDAO();
			
			lista = dao.consultarTodos();
			
			for (Livro l : lista) {
				tela.setTextArea("ID: " + l.getId() + " Nome: "+ l.getNome() + " Preço: " + l.getPreco() + " Quantidade: " + l.getQtd() + "\n");
			}
			

		}
		
	}

}
