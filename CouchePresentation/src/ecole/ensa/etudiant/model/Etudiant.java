package ecole.ensa.etudiant.model;

import java.io.Serializable;

public class Etudiant implements Serializable {
	private String nom;
	private String cin;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Etudiant(String nom, String cin) {
		super();
		this.nom = nom;
		this.cin = cin;
	}
	
	@Override
	public String toString()
	{
		return nom+" : " + cin;
	}
}
