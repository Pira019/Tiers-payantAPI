package ania.projects.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Column(name = "nomPatient", nullable = false)
	protected String nom;
	
	@Column(name = "prenomPatient", nullable = false)
	protected String prenom;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	protected Date dateDeNaissance;
	
	protected String tel;
	protected String tel1;
	
	@Column(nullable = false)
	protected String profession ;
	
	
	protected String statutMatrimorial;
	
	
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	private Set<Consultation> consultations = new HashSet<>();
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	private List<Analyse> analyses = new ArrayList<>();
	
	@ManyToOne 
    private Assureur assureur;
    
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

}
