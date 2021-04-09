package ania.projects.model;
 
 

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Assureur extends Utilisateur {

	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(name = "medecins_Assureur")
	private List<Medecin> medecins = new ArrayList<>();
	
	@OneToMany( targetEntity=Patient.class, mappedBy="assureur" )
    private List<Patient> patients = new ArrayList<>();
	
	@OneToMany(mappedBy = "assureur")
    List<Pharmacie_assureur> assureur; 
    
	public Assureur() {
		// TODO Auto-generated constructor stub
	} 
	

}
