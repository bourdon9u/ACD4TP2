package Exercice3;

import java.util.*;

public class Etudiant {

	private Identite id;
	private Formation f;
	private Map<String, List<Float>> notes;
	
	public Etudiant(Identite id, Map<String,List<Float>> notes,Formation f ){
		this.id = id;
		this.notes = new HashMap<String,List<Float>>();
		this.f =f;
	}
	public void addNote(String id, float n){
		if(n>0 && n<=20) {
			if(!notes.containsKey(id)){
				notes.put(id, new ArrayList<Float>());
			}
			notes.get(id).add(n);
		}		
		else
			System.out.println("Entrer une note entre 0 et 20");
	}
	
	
	public void Moyenne(){
		float compteur = 0;
		float moyenne = 0;
	
		if(!notes.containsKey(this))
			System.out.println("Choisissez une matière qui existe !");
		else
			for(int g=0; g<notes.get(this).size(); g++){
				compteur = compteur + notes.get(this).get(g);
			}
	
		moyenne = compteur / notes.get(this).size();
		System.out.println("La moyenne est de :");
		
	}
	public void Moyennecompteur(){
		float compteur = 0;
		float moyenne = 0;
		if(!notes.containsKey(this))
			System.out.println("Cette matière n'existe pas");
		else
			for(int i=0; i<notes.get(this).size();i++){
				compteur = compteur + notes.get(this).get(i);
			}
		
		moyenne=compteur/notes.get(this).size();
		if(!notes.containsKey(this))
			System.out.println("Choisissez une matière qui existe !");
		else
			for(int g=0; g<notes.get(this).size(); g++){
				compteur = compteur + notes.get(this).get(g);
			}
	
		moyenne = compteur / notes.get(this).size();
		System.out.println("La moyenne est de :");
		
	}
	public Identite getId() {
		return id;
	}

	public Formation getF() {
		return f;
	}

	public Map<String, List<Float>> getNotes() {
		return notes;
	}
	
}
