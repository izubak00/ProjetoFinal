package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.LivroDAO;
import br.edu.ifsp.modelo.Livro;
import br.edu.ifsp.tela.TelaAtualiza;
import br.edu.ifsp.tela.TelaInsere;
import br.edu.ifsp.tela.TelaVerificaAtualiza;
import br.edu.ifsp.tela.TelaVerificaInsere;

public class AtualizaController implements ActionListener{
	
	private TelaAtualiza tela;
	private Livro livro;
	
	public AtualizaController(TelaAtualiza ta) {
		this.tela = ta;
		livro = new Livro();
		this.tela.getBtnAtualizar().addActionListener(this);
		this.tela.getBtnBuscar().addActionListener(this);
		this.tela.getBtnVoltar().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnBuscar()) {
			
						
			LivroDAO dao = new LivroDAO();
			livro = dao.consultarLivro(this.tela.getTextNome().getText());
			if (dao.verificaExiste(livro)) {
				tela.setTextArea("ID: " + livro.getId() + " Nome: "+ livro.getNome() + " Preço: " + livro.getPreco() + " Quantidade: " + livro.getQtd() + "\n");
				tela.getBtnAtualizar().setEnabled(true);
			}else {
				TelaVerificaAtualiza tva = new TelaVerificaAtualiza();
				VerificaAtController iac = new VerificaAtController(tva);
				tva.setVisible(true);
			}
		}
		if(e.getSource() == this.tela.getBtnAtualizar()) {
			
			LivroDAO dao = new LivroDAO();
			livro = dao.consultarLivro(this.tela.getTextNome().getText());
			
			if (Integer.parseInt(this.tela.getTextQtd().getText()) >= 0) {
				dao.atualizarQtd(livro.getId(), Integer.parseInt(this.tela.getTextQtd().getText()));	
				JOptionPane.showMessageDialog(null, "Quantidade atualizada com sucesso");
				tela.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "A quantidade precisa ser zero ou mais");
			}
			
			
		}
		
		if(e.getSource() == this.tela.getBtnVoltar()) {
			
			tela.setVisible(false);
			
		}
		
	}

}
