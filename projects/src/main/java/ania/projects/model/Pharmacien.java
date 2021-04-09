package ania.projects.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Pharmacien extends Utilisateur {

	@Column( name = "nomPharmacie",nullable = false)
	private String nom;
	
	@Column( name = "adressePharmacie",nullable = false)
	private String adresse;
	
	@Column( name = "autreInfoPharmacie")
	private String autre;
	
	 @OneToMany(mappedBy = "pharmacien")
	 private   List<Pharmacie_assureur> pharmacien;
	    
	    @OneToMany(mappedBy = "pharmacien")
	  private  List<Facture_pharmacie> pharmacie;
	
	public Pharmacien() {
		// TODO Auto-generated constructor stub
	}


	
}
