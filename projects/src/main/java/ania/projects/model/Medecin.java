package ania.projects.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
 
@Data
@Entity
public class Medecin extends Utilisateur {
	
	private String nomMedecin;
	private String prenomMedecin;
	
	@Column(name="specialiteMedecin")
	private String specialite;
	
	@Column(name="adresseMedecin")
	private String adresse;
	
	@Column(name="emailMedecin")
	private String email;
	
	@Column(name="telMedecin")
	private String tel;
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	@JoinTable(name = "medecins_analyses")
	private Set<Analyse> analyses = new HashSet<>();
	
	
	@ManyToMany(mappedBy = 	"medecins")
	private List<Assureur> assureurs = new ArrayList<>();
	

	
	
	@OneToMany
	@JoinTable(name = "facture_consultation",
	joinColumns  = {@JoinColumn(name ="medecin_id_Fk" , referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn (name = "consultation_id_Fk", referencedColumnName = "id")}) 
	private List<Consultation> consultations;
	
	@OneToMany(mappedBy = "medecin")
    List<Ordonnance> ordonnances; 

	public Medecin() {
		// TODO Auto-generated constructor stub
		
	}

	public Medecin(String nomMedecin, String prenomMedecin, String specialite, String adresse, String email,
			String tel) {
	 
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.specialite = specialite;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.login ="login";
		this.motDePasse="1243";
	 
	}
	
	

	 
}
