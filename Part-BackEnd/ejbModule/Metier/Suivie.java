package Metier;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Suivie implements Serializable {
	@Id
	private long id_S;
	private Date date_realisation ;
	private int Realiser ;
	public Suivie(long id_S, Date date_realisation, int Realiser) {
		super();
		this.id_S = id_S;
		this.date_realisation = date_realisation;
		this.Realiser = Realiser;
	}
	public long getId_S() {
		return id_S;
	}
	public void setId_S(long id_S) {
		this.id_S = id_S;
	}
	public Date getDate_realisation() {
		return date_realisation;
	}
	public void setDate_realisation(Date date_realisation) {
		this.date_realisation = date_realisation;
	}
	public int getRealiser() {
		return Realiser;
	}
	public void setRealiser(int realiser) {
		realiser = realiser;
	}

}
