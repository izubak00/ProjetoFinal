package br.edu.ifsp.main;

import java.util.ArrayList;

import br.edu.ifsp.controlador.PrincipalController;
import br.edu.ifsp.tela.TelaPrincipal;

public class Main {

	public static void main(String[] args)  {
		
		TelaPrincipal tp = new TelaPrincipal();
		PrincipalController pc = new PrincipalController(tp);
		tp.setVisible(true);
		
	}

}
