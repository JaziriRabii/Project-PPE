package Metier;

import java.io.Serializable;
import java.lang.Long;
import java.util.Arrays;
import java.sql.*;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_CPT", discriminatorType = DiscriminatorType.STRING, length = 2)

public  class Sinistre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long numSinistre;
	public Date dateSinistre;
	public String lieuSinistre;
	public String heureSinistre;
       
	public Sinistre(Long numSinistre) {
		this.numSinistre = numSinistre;

	}

	public Long getNumSinistre() {
		return numSinistre;
	}

	public void setNumSinistre(Long numSinistre) {
		this.numSinistre = numSinistre;
	}

	public Date getDatesinistre() {
		return dateSinistre;
	}

	public void setDatesinistre(Date datesinistre) {
		this.dateSinistre = datesinistre;
	}

	public String getLieuSinistre() {
		return lieuSinistre;
	}

	public void setLieuSinistre(String lieuSinistre) {
		this.lieuSinistre = lieuSinistre;
	}

	public String getHeuresinistre() {
		return heureSinistre;
	}

	public void setHeuresinistre(String heuresinistre) {
		this.heureSinistre = heuresinistre;
	}


	public Sinistre(Date dateSinistre, String lieuSinistre, String heureSinistre) {
		super();
		this.dateSinistre = dateSinistre;
		this.lieuSinistre = lieuSinistre;
		this.heureSinistre = heureSinistre;
	}

	public Sinistre( String lieuSinistre, String heuresinistre) {
		super();
		this.lieuSinistre = lieuSinistre;
		this.heureSinistre = heuresinistre;
	
	}

	public Sinistre() {
		super();
		// TODO Auto-generated constructor stub
	}

}