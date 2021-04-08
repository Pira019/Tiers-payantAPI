package ania.projects.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
 @Data
public class Consultation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	
	@ManyToOne
	@JoinTable(name = "facture_consultation",
				joinColumns = {@JoinColumn(name = "consultation_id_Fk" , insertable = false,
				updatable = false, referencedColumnName = "id")},
				inverseJoinColumns = {@JoinColumn(name ="medecin_id_Fk", insertable = false,
				updatable = false, referencedColumnName = "id")})	
	private Medecin medecin;
	
	@ManyToMany(mappedBy = "consultations")
	private Set<Patient> patients = new HashSet<>();
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	private Set<Prestation> prestations = new HashSet<>();
	
	
	public Consultation() {
		// TODO Auto-generated constructor stub
	}

}
