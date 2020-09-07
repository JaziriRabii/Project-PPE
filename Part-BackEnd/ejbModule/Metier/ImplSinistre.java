package Metier;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless(name="BP")

public class ImplSinistre implements ISinistre {
	@PersistenceContext
	EntityManager em;

	public Bris_de_glace AddS(Bris_de_glace s) {
		
		em.persist(s);
		
		return s;
	}
	@Override
	public Dommage_collision AddD(Dommage_collision d) {
		em.persist(d);
		return d;
		}

	@Override
	public Incendie AddI(Incendie i) {
em.persist(i);
		
		return i;
	}

	@Override
	public Vol AddV(Vol v) {
em.persist(v);
		
		return v;
	}

	@Override
	public Document AddDoc(Document x) {
em.persist(x);
		
		return x;
	}

	@Override
	public Suivie AddS(Suivie u) {
em.persist(u);
		
		return u;
	}
	@Override
	public Sinistre consulterCompte(Long numSinistre) {
		Sinistre c=em.find(Sinistre.class,numSinistre);
		if (c==null) throw new RuntimeException ("compte introuvable");

		return  c;
	}
	@Override
	public List<Sinistre> getAllComptes() {
		
			Query rep=em.createQuery("select c from Sinistre c");
			return rep.getResultList();
		}
	@Override
	public assure AddA(assure A) {
em.persist(A);
		
		return A;
	}
	@Override
	public void deleteSinistre(Long numSinistre) {
		Sinistre c=em.find(Sinistre.class, numSinistre);
		em.remove(c);
	}
	@Override
	public Assureur AddAssureur(Assureur AS) {
em.persist(AS);
		
		return AS;
	}
	@Override
	public List<assure> getAllassure() {
		Query rep=em.createQuery("select l from assure l");
		return rep.getResultList();
	}
	@Override
	public void deleteassure(long id) {
		assure e=em.find(assure.class, id);
		em.remove(e);
	}
	@Override
	public assure consulterassure(long id) {
		assure d=em.find(assure.class,id);
		if (d==null) throw new RuntimeException ("compte introuvable");

		return  d;
	}
	@Override
	public List<Assureur> getAllAssureur() {
		Query res=em.createQuery("select g from Assureur g");
		return res.getResultList();
	}
	@Override
	public void deleteAssureur(int idASS) {
		Assureur x=em.find(Assureur.class, idASS);
		em.remove(x);
	}
	@Override
	public Assureur consulterAssureur(int idASS) {
		Assureur b=em.find(Assureur.class,idASS);
		if (b==null) throw new RuntimeException ("compte introuvable");

		return  b;
	}
	@Override
	public expert Addexpert(expert ex) {
em.persist(ex);
		
		return ex;
	}
	@Override
	public List<expert> getAllexpert() {
		Query res=em.createQuery("select e from expert e");
		return res.getResultList();
	}
	@Override
	public void deleteexpert(int Id_Expert) {
		expert x=em.find(expert.class, Id_Expert);
		em.remove(x);
	}
	@Override
	public expert consulterexpert(int Id_Expert) {
		expert b=em.find(expert.class,Id_Expert);
		if (b==null) throw new RuntimeException ("compte introuvable");

		return  b;
	}
	
	
	}

	
	
	
		
	
	




