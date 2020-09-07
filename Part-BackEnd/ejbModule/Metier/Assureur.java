package Metier;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Assureur {
 @Id     
	private int IdASS;

	private int CinASS ;
	private String NomASS;
	public Assureur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdASS() {
		return IdASS;
	}
	public void setIdASS(int idASS) {
		IdASS = idASS;
	}
	public int getCinASS() {
		return CinASS;
	}
	public void setCinASS(int cinASS) {
		CinASS = cinASS;
	}
	public String getNomASS() {
		return NomASS;
	}
	public void setNomASS(String nomASS) {
		NomASS = nomASS;
	}
	public String getPrenomASS() {
		return PrenomASS;
	}
	public void setPrenomASS(String prenomASS) {
		PrenomASS = prenomASS;
	}
	private String PrenomASS;
	public Assureur(int idASS, int cinASS, String nomASS, String prenomASS) {
		
		this.IdASS = idASS;
		this.CinASS = cinASS;
		this.NomASS = nomASS;
		this.PrenomASS = prenomASS;
	}
	
}
