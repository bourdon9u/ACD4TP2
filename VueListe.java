package igMVC.exercice_mvc;

import java.util.*;
import javax.swing.*;


public class VueListe extends JTextArea implements Observer {
	
	public VueListe(){
		super(5,5);
	}
	
	public void update(Observable o, Object arg) {
	/*	Model mod = (Model) o;
		ArrayList<String> list = mod.getListe();
		String mot = list.get(0);
		this.setText(mot);*/
	}
	
	
	
}
