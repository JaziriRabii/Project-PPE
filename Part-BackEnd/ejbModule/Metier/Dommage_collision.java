package Metier;


import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity 
@DiscriminatorValue("cv")

public class Dommage_collision extends Sinistre {
private String photoV;
private String constat;
public String getPhotoV() {
	return photoV;
}
public void setPhotoV(String photoV) {
	this.photoV = photoV;
}



public String getConstat() {
	return constat;
}
public void setConstat(String constat) {
	this.constat = constat;
}
public Dommage_collision(Long numSinistre, String lieuSinistre ,String photoV,String constat,String heureSinistre,Date dateSinistre) {
	this.lieuSinistre=lieuSinistre;
	this.dateSinistre=dateSinistre;
	this.photoV = photoV;
	this.constat = constat;
	this.heureSinistre=heureSinistre;
}

public Dommage_collision(String photoV, String constat) {
	
	this.photoV=photoV;
	this.constat=constat;
	
	
	
}

public Dommage_collision(Long numSinistre) {
	super(numSinistre);
	// TODO Auto-generated constructor stub
}

public Dommage_collision() {
	super();
	// TODO Auto-generated constructor stub
}
}

