package TP5;

import java.util.*;
import javax.swing.*;


public class VueListe extends JTextArea implements Observer {
	
	public VueListe(){
		super(5,5);
	}
	
	public void update(Observable o, Object arg) {

		Model model = (Model)o;
		setText("");		
		for (String s : model.getListe())
			this.append(s+"\n");
	}
}
