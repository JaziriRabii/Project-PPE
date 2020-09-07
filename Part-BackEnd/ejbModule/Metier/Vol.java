package Metier;


import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("cf")

public class Vol extends Sinistre{

public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getCoordonnes_temoins() {
		return coordonnes_temoins;
	}
	public void setCoordonnes_temoins(String coordonnes_temoins) {
		this.coordonnes_temoins = coordonnes_temoins;
	}
private String document;
private String coordonnes_temoins ;


public Vol(  String document,String coordonnes_temoins) {
	this.document = document;
	this.coordonnes_temoins = coordonnes_temoins;
}
public Vol() {
	super();
	// TODO Auto-generated constructor stub
}
public Vol(Long numSinistre, String lieuSinistre ,String document,String coordonnes_temoins,String heureSinistre,Date dateSinistre) {
	this.lieuSinistre=lieuSinistre;
	this.dateSinistre=dateSinistre;
	this.document = document;
	this.coordonnes_temoins = coordonnes_temoins;
	this.heureSinistre=heureSinistre;
}
public Vol(Long numSinistre) {
	super(numSinistre);
	// TODO Auto-generated constructor stub
} 

}