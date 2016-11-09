package igMVC.exercice_mvc;

import java.util.*;
import javax.swing.*;

public class VueMin extends JTextField implements Observer {
	
	public VueMin(){
		super(10);
	}
	
	public void update(Observable o, Object arg) {
	/*	Model mod = (Model) o;
		ArrayList<String> list = mod.getListe();
		String mot = list.get(0);
		this.setText(mot);*/
	}
	
	
	
	
}
