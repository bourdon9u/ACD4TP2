package igMVC.exercice_mvc;

import java.awt.*;
import javax.swing.*;

public class Principale {


	 public static void main(String[] args) { 
		 
		 Model mod = new Model();
		 Controler con = new Controler(mod);
		 
		 JTextField saisie;

		 VueMax max = new VueMax();
		 VueMin min = new VueMin();
		 VueListe liste = new VueListe();
		 mod.addObserver(max);
		 mod.addObserver(min);

		 mod.addObserver(liste);


		 //JPanel Nord
		 JTextField saisie ;
		 saisie= new JTextField(10);
		 saisie.setPreferredSize(new Dimension(200,30));
		 saisie.addActionListener(con);
		 
		 
		 JPanel panneauDeControle= new JPanel(new GridLayout(1,2));
		 panneauDeControle.add(new JLabel("Donner une chaîne "+"    ",JLabel.CENTER));
		 panneauDeControle.add(saisie);

		 //JPanel Sud
		 JPanel panMaxMin = new JPanel(new GridLayout(2,2));
		 panMaxMin.add(new JLabel("Plus grand mot ",JLabel.CENTER));
		 panMaxMin.add(max);

		 panMaxMin.add(new JLabel("Plus petit mot ", JLabel.CENTER));
		 panMaxMin.add(min);

		 //Construction de l'IG dans une JFrame		 
		 JFrame frame=new JFrame();
		 frame.getContentPane().add(panneauDeControle,BorderLayout.NORTH);
		 frame.getContentPane().add(new JScrollPane(liste),BorderLayout.CENTER);
		 frame.getContentPane().add(panMaxMin,BorderLayout.SOUTH);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(new Dimension(400,400));
		 frame.setVisible(true);	
		
	}

} 


