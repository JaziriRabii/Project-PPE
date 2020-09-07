package Metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class assure  {
	@Id
	private long id;
	private long CinA;
	private long NumCIN ;
	public assure(long id,long CinA, long NumCIN, String Nom, String Prenom, String Adress) {
		this.id=id;
		this.CinA = CinA;
		this.NumCIN = NumCIN;
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Adress = Adress;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public assure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCinA() {
		return CinA;
	}
	public void setCinA(long cinA) {
		CinA = cinA;
	}
	public long getNumCIN() {
		return NumCIN;
	}
	public void setNumCIN(long numCIN) {
		NumCIN = numCIN;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String Nom) {
		Nom = Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String Prenom) {
		Prenom = Prenom;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String Adress) {
		Adress = Adress;
	}
	private String Nom ;
	private String Prenom ;
	private String Adress ;
	
	}
	


