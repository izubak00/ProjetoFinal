package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.LivroDAO;
import br.edu.ifsp.modelo.Livro;
import br.edu.ifsp.tela.TelaInsere;
import br.edu.ifsp.tela.TelaVerificaInsere;

public class InsereController implements ActionListener {

	private TelaInsere tela;
	private Livro livro;
	
	public InsereController(TelaInsere ti) {
		this.tela = ti;
		livro = new Livro();
		this.tela.getbtnInserir().addActionListener(this);
		this.tela.getbtnVoltar().addActionListener(this);
	}	
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == this.tela.getbtnInserir()) {
			
			
			
			livro.setNome(this.tela.getTxtFieldNome().getText());
			livro.setPreco(Double.parseDouble(this.tela.getTxtFieldPreco().getText()));
			livro.setQtd(Integer.parseInt(this.tela.getTxtFieldQtd().getText()));
		
			LivroDAO dao = new LivroDAO();
			
			if (dao.verificaExiste(livro)) {
				TelaVerificaInsere tvi = new TelaVerificaInsere();
				VerificaController ic = new VerificaController(tvi);
				tvi.setVisible(true);	
				
			}else {
				
				dao.cadastrarLivro(livro);
				
				JOptionPane.showMessageDialog(null, "Livro inserido com sucesso");
				
			}
			
		}
		if(e.getSource() == this.tela.getbtnVoltar()) {
			
			tela.setVisible(false);
			
		}
	}
	

}
