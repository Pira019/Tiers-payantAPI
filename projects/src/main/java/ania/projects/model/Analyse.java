package ania.projects.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "analyse_medicales")
public class Analyse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Temporal(TemporalType.DATE)
	private Date dateAnalyse;
	
	@ManyToMany(mappedBy = "analyses")
	private Set<Medecin> medecins = new HashSet<>();
	
	
	@ManyToOne
	@JoinTable(name = "facture_analyses",
				joinColumns = {@JoinColumn(name = "analyse_id_Fk" , insertable = false,
				updatable = false, referencedColumnName = "id")},
				inverseJoinColumns = {@JoinColumn(name ="laboratoire_id_Fk", insertable = false,
				updatable = false, referencedColumnName = "id")})	
	private Laboratoire laboratoire;
	
	@ManyToMany(mappedBy="analyses")
    private Set<Patient> patients;
	
	
	public Analyse() {
		// TODO Auto-generated constructor stub
	}

}
