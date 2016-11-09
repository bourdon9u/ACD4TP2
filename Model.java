package igMVC.exercice_mvc;

import java.util.*;
import javax.swing.*;
/**
 * Classe correspondant au modele de l'architecture MVC 
 * de l'exemple compteur_MVC
 *
 */
public class Model extends Observable {
	ArrayList<String> liste;
	
	public Model(){
		this.liste = new ArrayList<String>();
	}
	
	/**
	 * modifie la valeur de compteur en fonction du parametre
	 * 
	 * @param valeur entiere à ajouter au compteur
	 */
	public void ajouterMot(String mot){
		this.liste.add(mot);
		
		setChanged();
		notifyObservers();
		
	}


	public ArrayList<String> getListe(){
		return this.liste;
		
	}


}
