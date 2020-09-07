package Metier;


import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity 

@DiscriminatorValue("ck")


public class Bris_de_glace extends Sinistre {
	
	private String photo ;
    private String matricule;
	public Bris_de_glace(Long numSinistre, Date datesinistre, String lieuSinistre, String heuresinistre, String photo,
			String matricule,Date dateSinistre) {
		super();
		this.photo = photo;
		this.matricule = matricule;
	}
	public Bris_de_glace() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bris_de_glace(Long numSinistre,Date dateSinistre, String lieuSinistre, String heureSinistre) {
		super(dateSinistre, lieuSinistre, heureSinistre);
		// TODO Auto-generated constructor stub
	}
	public Bris_de_glace(Long numSinistre) {
		super(numSinistre);
		// TODO Auto-generated constructor stub
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public Bris_de_glace( String photo, String matricule) {
		
		this.photo = photo;
		this.matricule = matricule;
	}
	
	public Bris_de_glace(Long numSinistre, String lieuSinistre ,String photo,String matricule ,String heureSinistre,Date dateSinistre) {
		this.lieuSinistre=lieuSinistre;
		this.dateSinistre=dateSinistre;
		this.photo = photo;
		this.matricule = matricule;
		this.heureSinistre=heureSinistre;
	}
	
	}

