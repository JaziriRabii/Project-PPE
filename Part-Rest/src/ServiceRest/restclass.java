
package ServiceRest;


import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import Metier.*;
@Stateless

@Path("/form")
public class restclass {
	
@EJB
ISinistre metier;
@POST
@Path("/sinistre")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Bris_de_glace addS(	
				
				 @FormParam(value = "numSinistre") Long numSinistre,
					@FormParam(value = "lieuSinistre") String lieuSinistre,
					@FormParam(value = "matricule") String matricule,
		            @FormParam(value = "photo") String photo,

					@FormParam(value = "heureSinistre") String heureSinistre,
					@FormParam(value = "dateSinistre") Date dateSinistre
	           ) {
			System.out.println("ok");
			return metier.AddS(new Bris_de_glace( numSinistre, lieuSinistre ,photo, matricule ,heureSinistre,dateSinistre));
		}

		
@POST
@Path("/domc")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Dommage_collision AddD(	
				
	            @FormParam(value = "numSinistre") Long numSinistre,
				@FormParam(value = "lieuSinistre") String lieuSinistre,
				@FormParam(value = "photoV") String photoV,
	            @FormParam(value = "constat") String constat,

				@FormParam(value = "heureSinistre") String heureSinistre,
				@FormParam(value = "dateSinistre") Date dateSinistre
				) {
			System.out.println("ok");
			return metier.AddD(new Dommage_collision(numSinistre,  lieuSinistre , photoV, constat, heureSinistre, dateSinistre));
		}

@POST
@Path("/inc")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Incendie AddI(	
	           	            
	            @FormParam(value = "numSinistre") Long numSinistre,
				@FormParam(value = "lieuSinistre") String lieuSinistre,
				 @FormParam(value = "document") String document,
				@FormParam(value = "photoV") String photo,
	           
				@FormParam(value = "heureSinistre") String heureSinistre,
				@FormParam(value = "dateSinistre") Date dateSinistre

				
				
				) {
			System.out.println("ok");
			return metier.AddI(new Incendie(numSinistre,  lieuSinistre , document, photo, heureSinistre, dateSinistre));
		}

@POST
@Path("/c")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Vol AddV(
				@FormParam(value = "numSinistre") Long numSinistre,
				@FormParam(value = "lieuSinistre") String lieuSinistre,

				@FormParam(value = "document") String document,
				@FormParam(value = "coordonnes_temoins") String coordonnes_temoins,
				@FormParam(value = "heureSinistre") String heureSinistre,
				@FormParam(value = "dateSinistre") Date dateSinistre

	            ) {
			System.out.println("ok");
			return metier.AddV(new Vol(numSinistre,lieuSinistre,document,coordonnes_temoins,heureSinistre,dateSinistre));
		}
		
@POST
@Path("/addx")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Document Addx(
				@FormParam(value = " Num_doc") int Num_doc
	            ) {
			System.out.println("ok");
			return metier.AddDoc(new Document(Num_doc));
		}
@POST
@Path("/sui")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Suivie AddS(
				@FormParam(value = "id_S") long id_S,
				@FormParam(value = "date_realisation")Date date_realisation,
				@FormParam(value = "  Realiser;")  int Realiser 

	            ) {
			System.out.println("ok");
			return metier.AddS(new Suivie( id_S,date_realisation,Realiser));
		}
@GET
@Path("/comptes/{numSinistre}")
@Produces(value={MediaType.APPLICATION_JSON})
     public Sinistre getCompte(@PathParam(value="numSinistre")Long numSinistre) {
			
			System.out.println("ok");

			
		return metier.consulterCompte(numSinistre);
		
		}	
@GET
@Path("/comp")
@Produces(value={MediaType.APPLICATION_JSON})
		public List<Sinistre> getComptes(){
			System.out.println("ok");

			return metier.getAllComptes();
		}
@DELETE
@Path("/comptes/{code}")
public void supprimer(@PathParam("code") Long numSinistre) {
	metier.deleteSinistre(numSinistre);
}

@POST
@Path("/assure")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public assure AddA(
				
				@FormParam(value = "id")  long id,

				@FormParam(value = "CinA")  long CinA,
				@FormParam(value = "NumCIN") int NumCIN,
				@FormParam(value = "Nom") String Nom,
				@FormParam(value = "Prenom") String Prenom,
				
				@FormParam(value = "Adress") String Adress

	
	            ) {
			System.out.println("ok");
			return metier.AddA(new assure(id,CinA,  NumCIN, Nom,  Prenom, Adress));
		}

@GET
@Path("/assure")
@Produces(value={MediaType.APPLICATION_JSON})
	public List<assure>getAllassure(){
		System.out.println("ok");

		return metier.getAllassure();
	}

	@DELETE
	@Path("/delta/{id}")
	public void deleter(@PathParam("id") long id) {
		metier.deleteassure(id);
	}

	@GET
	@Path("/geta/{id}")
	@Produces(value={MediaType.APPLICATION_JSON})
	     public assure consulterassure(@PathParam(value="id")long id) {
				
				System.out.println("ok");

			
			return metier.consulterassure(id);
			
			}
@POST
@Path("/did")
@Consumes("application/x-www-form-urlencoded")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Assureur AddAssureur(
				
				@FormParam(value = "idASS")  int idASS,

				@FormParam(value = "cinASS")  int cinASS,
				@FormParam(value = "nomASS") String nomASS,
				@FormParam(value = "prenomASS") String prenomASS
	
	            ) {
			System.out.println("ok");
			return metier.AddAssureur(new Assureur( idASS, cinASS, nomASS, prenomASS));
		}
@GET
@Path("/get")
@Produces(value={MediaType.APPLICATION_JSON})
	public List<Assureur>getAllAssureur(){
		System.out.println("ok");

		return metier.getAllAssureur();
	}
	@DELETE
	@Path("/delet/{idASS}")
	public void deleterASS(@PathParam("idASS") int idASS) {
		metier.deleteAssureur(idASS);
	}
	@GET
	@Path("/assureur/{idASS}")
	@Produces(value={MediaType.APPLICATION_JSON})
	     public Assureur consulterAssureur(@PathParam(value="id")int idASS) {
				
				System.out.println("ok");

				
			return metier.consulterAssureur(idASS);
			
			}














	
	
	
	
	
	
	
	
	
	
	@POST
	@Path("/expp")
	@Consumes("application/x-www-form-urlencoded")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
			public expert Addexpert(
					
					@FormParam(value ="id_Expert")  int id_Expert,
					@FormParam(value ="nom_Expert")  String nom_Expert,
					@FormParam(value ="prenom_Expert") String prenom_Expert,
					@FormParam(value = "numSinistre")  Long numSinistre

		
		            ) {
				System.out.println("ok");
				return metier.Addexpert(new expert( id_Expert, nom_Expert, prenom_Expert, numSinistre));
			}
	



	@GET
	@Path("/getexpert")
	@Produces(value={MediaType.APPLICATION_JSON})
		public List<expert>getAllexpert(){
			System.out.println("ok");

			return metier.getAllexpert();
		}
		@DELETE
		@Path("/pika/{id_Expert}")
		public void deleteexpert(@PathParam("id_Expert") int id_Expert) {
			metier.deleteexpert(id_Expert);
		}
		@GET
		@Path("/fifo/{id_Expert}")
		@Produces(value={MediaType.APPLICATION_JSON})
		     public expert consulterexpert(@PathParam(value="id_Expert")int id_Expert) {
					
					System.out.println("ok");

					
				return metier.consulterexpert(id_Expert);
				
				}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	








}

