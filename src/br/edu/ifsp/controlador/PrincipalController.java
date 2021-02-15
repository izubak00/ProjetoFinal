package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.edu.ifsp.tela.TelaEstoque;
import br.edu.ifsp.tela.TelaPrincipal;
import br.edu.ifsp.tela.TelaVenda;


public class PrincipalController implements ActionListener {

	private TelaPrincipal tela;
	
	public PrincipalController(TelaPrincipal tp) {
		this.tela = tp;
		this.tela.getbtnControleDeEstoque().addActionListener(this);
		this.tela.getbtnControleDeVenda().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnControleDeEstoque()) {			
			
			TelaEstoque te = new TelaEstoque();
			EstoqueController ec = new EstoqueController(te);
			te.setVisible(true);
			
		}
		if(e.getSource() == this.tela.getbtnControleDeVenda()) {
			
			TelaVenda tv = new TelaVenda();
			VendaController vc = new VendaController(tv);
			tv.setVisible(true);
		}
		
	}

}
