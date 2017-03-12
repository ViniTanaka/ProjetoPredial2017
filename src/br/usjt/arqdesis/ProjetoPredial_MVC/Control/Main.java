package br.usjt.arqdesis.ProjetoPredial_MVC.Control;

import java.util.ResourceBundle;
import javax.swing.*;
import br.usjt.arqdesis.ProjetoPredial_MVC.Model.ConexaoMYSQL;
import br.usjt.arqdesis.ProjetoPredial_MVC.View.LoginGUI;

public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			JFrame frame = new LoginGUI();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setSize(600,350);
			frame.setLocation(400,150);
			frame.setResizable(false);
			
		      LerTxt application = new LerTxt();
		      application.openFile();
		      application.readRecords();
		      application.closeFile();
		

	}

}
