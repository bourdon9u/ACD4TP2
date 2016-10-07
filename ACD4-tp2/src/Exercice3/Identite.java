package Exercice3;

/** Classe Identité */
public class Identite {
	
	/** Attributs privés : nom, prenom et nip */
	private String nom;
	private String prenom;
	private String nip;

	/** Constructeur Identite */
	public Identite(String nom, String prenom, String nip){
		this.nom=nom;
		this.prenom=prenom;
		this.nip=nip;
	}
	
	/** retourne le nom de la personne */
	public String getNom() {
		return nom;
	}
	
	/** retourne le prenom de la personne */
	public String getPrenom() {
		return prenom;
	}
	/** retourne le NIP de la personne */
	public String getNip() {
		return nip;
	}	
	
	
}
