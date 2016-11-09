package igMVC.exercice_mvc;

import java.awt.event.*;

import javax.swing.*;


public class Controler implements ActionListener {
	
	Model model;
	
	public Controler(Model m) {
		this.model=m;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField jt = (JTextField) e.getSource();
		String mot = jt.getText();
		model.ajouterMot(mot);
		jt.setText("");
	}
}
