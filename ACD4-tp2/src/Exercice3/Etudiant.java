package Exercice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {

	private Identite id;
	private Formation f;
	private Map<String, ArrayList<Float>> notes;
	
	public Etudiant(Identite id, Formation f){
		this.id=id;
		this.f=f;
		this.notes = new HashMap<String, ArrayList<Float>>();
	}

	public Identite getId() {
		return id;
	}

	public Formation getF() {
		return f;
	}

	public Map<String, ArrayList<Float>> getNotes() {
		return notes;
	}
	
	
}
