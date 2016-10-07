package Exercice3;

import java.util.Map;

public class Formation {
	public String id;
	public Map<String, String> lmat;

	public void ajouterMatiere(String m, String c) {
		lmat.put(m, c);
	}

	public void supprimerMatiere(String m, String c) {
		lmat.remove(m);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the lmat
	 */
	public Map<String, String> getLmat() {
		return lmat;
	}

}