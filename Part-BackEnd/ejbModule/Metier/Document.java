package Metier;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document implements Serializable{
	@Id
	private int Num_doc;

	public int getNum_doc() {
		return Num_doc;
	}

	public void setNum_doc(int num_doc) {
		Num_doc = num_doc;
	}

	public Document(int num_doc) {
		super();
		this.Num_doc = num_doc;
	}
	
	
	

}
