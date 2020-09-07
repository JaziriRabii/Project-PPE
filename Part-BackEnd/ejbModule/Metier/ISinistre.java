package Metier;
import java.util.List;

import javax.ejb.Local;
import javax.persistence.Query;
@Local
public interface ISinistre {
public Bris_de_glace AddS(Bris_de_glace s);

public Dommage_collision AddD(Dommage_collision d);
public Incendie AddI(Incendie i);
public Vol AddV(Vol v);
public Document AddDoc(Document x);
public Suivie AddS(Suivie u);
public Sinistre consulterCompte(Long numSinistre);
public List<Sinistre> getAllComptes();
public void deleteSinistre(Long numSinistre);

public assure AddA(assure A);
public List<assure> getAllassure();
public void deleteassure(long id);
public assure consulterassure(long id);







public Assureur AddAssureur(Assureur AS);
public List<Assureur> getAllAssureur();
public void deleteAssureur(int idASS);
public Assureur consulterAssureur(int idASS);




public expert Addexpert(expert ex);
public List<expert> getAllexpert();
public void deleteexpert(int Id_Expert);
public expert consulterexpert(int Id_Expert);


}















	


