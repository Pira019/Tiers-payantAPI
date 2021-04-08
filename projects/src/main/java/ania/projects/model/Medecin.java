package ania.projects.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
 
@Data
@Entity
public class Medecin extends Utilisateur {
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	private Set<Analyse> analyses = new HashSet<>();
	
	
	@OneToMany
	@JoinTable(name = "facture_consultation",
	joinColumns  = {@JoinColumn(name ="medecin_id_Fk" , referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn (name = "consultation_id_Fk", referencedColumnName = "id")}) 
	private Set<Consultation> consultations;

	public Medecin() {
		// TODO Auto-generated constructor stub
		
	}

	 
}
