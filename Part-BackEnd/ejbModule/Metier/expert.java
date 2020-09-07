package Metier;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class expert {
@Id
	private int id_Expert;
	private String nom_Expert;
	private String prenom_Expert;
	private  Long numSinistre;
	public int getId_Expert() {
		return id_Expert;
	}
	public void setId_Expert(int id_Expert) {
		this.id_Expert = id_Expert;
	}
	public String getNom_Expert() {
		return nom_Expert;
	}
	public void setNom_Expert(String nom_Expert) {
		this.nom_Expert = nom_Expert;
	}
	public String getPrenom_Expert() {
		return prenom_Expert;
	}
	public void setPrenom_Expert(String prenom_Expert) {
		this.prenom_Expert = prenom_Expert;
	}
	public Long getNumSinistre() {
		return numSinistre;
	}
	public void setNumSinistre(Long numSinistre) {
		this.numSinistre = numSinistre;
	}
	public expert(int id_Expert, String nom_Expert, String prenom_Expert, Long numSinistre) {
		super();
		this.id_Expert = id_Expert;
		this.nom_Expert = nom_Expert;
		this.prenom_Expert = prenom_Expert;
		this.numSinistre = numSinistre;
	}
	public expert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
