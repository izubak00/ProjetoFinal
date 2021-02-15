package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaInsere;
import br.edu.ifsp.tela.TelaVerificaInsere;

public class VerificaController  implements ActionListener{

	private TelaVerificaInsere tela;
	
	public VerificaController(TelaVerificaInsere tvi) {
		this.tela = tvi;
		this.tela.getbtnSim().addActionListener(this);
		this.tela.getbtnNo().addActionListener(this);
	}	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnSim()) {			
			
			TelaInsere ti = new TelaInsere();
			InsereController ic = new InsereController(ti);
			ti.setVisible(true);			
		}
		
		if(e.getSource() == this.tela.getbtnNo()) {
			
			tela.setVisible(false);
		}
		
	}

}
