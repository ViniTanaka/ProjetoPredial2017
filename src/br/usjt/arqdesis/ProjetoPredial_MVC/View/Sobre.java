package br.usjt.arqdesis.ProjetoPredial_MVC.View;
import java.util.ResourceBundle;

import javax.swing.*;

public class Sobre extends JFrame {

	private ResourceBundle bn = null;
	
	public Sobre(ResourceBundle bn)
	{
		super("Sobre nosso trabalho");
		
		JOptionPane.showMessageDialog(null,"Projeto Integrado"
							 + "\nTrabalho desenvolvido por Matheus Alarcon e Vinicius Tanaka"
							 + "\nsobre um controle predial elaborado pelas mat�rias de:"
							 + "\n�Metodologia de Desenvolvimento de Sistemas"
							 + "\n�Pratica Programa��o Integrada"
							 + "\nLecionada pelos professores:"
							 + "\nAna Paula Serra - Edson Saraiva - Fulvio Bianco");
		
	}
}
