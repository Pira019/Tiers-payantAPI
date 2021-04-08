package ania.projects.model;

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

import lombok.Data;

@Entity
@Data
public class Analyse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@ManyToMany(mappedBy = "analyses")
	private Set<Medecin> medecins = new HashSet<>();
	
	
	@ManyToOne
	@JoinTable(name = "facture_analyses",
				joinColumns = {@JoinColumn(name = "analyse_id_Fk" , insertable = false,
				updatable = false, referencedColumnName = "id")},
				inverseJoinColumns = {@JoinColumn(name ="laboratoire_id_Fk", insertable = false,
				updatable = false, referencedColumnName = "id")})	
	private Laboratoire laboratoire;
	
	
	public Analyse() {
		// TODO Auto-generated constructor stub
	}

}
