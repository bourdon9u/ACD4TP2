package igMVC.exercice_mvc;

import java.awt.Dimension;
import java.util.*;
import javax.swing.*;

public class VueMax extends JTextField implements Observer {
	
	public VueMax(){
		super(10);
		this.setPreferredSize(new Dimension(200,30));
	}
	
	public void update(Observable o, Object arg) {
		Model mod = (Model) o;
		ArrayList<String> list = mod.getListe();
		String mot = list.get(0);
		this.setText(mot);
	}
	
	
	
}
