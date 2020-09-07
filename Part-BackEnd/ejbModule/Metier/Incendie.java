package Metier;


import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("cc")

public class Incendie extends Sinistre{
private String photo;
private String document;

public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getDocument() {
	return document;
}
public void setDocument(String document) {
	this.document = document;
}

	public Incendie(String photo,String document) {
		this.photo=photo;
		this.document=document;
	}
	public Incendie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Incendie(Long numSinistre, String lieuSinistre ,String document,String photo,String heureSinistre,Date dateSinistre) {
		this.lieuSinistre=lieuSinistre;
		this.dateSinistre=dateSinistre;
		this.document = document;
		this.photo = photo;
		this.heureSinistre=heureSinistre;
	}
	public Incendie(Long numSinistre) {
		super(numSinistre);
		// TODO Auto-generated constructor stub
	}
}
