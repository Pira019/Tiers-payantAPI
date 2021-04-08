package ania.projects.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Laboratoire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@OneToMany
	@JoinTable(name = "facture_analyses",
	joinColumns  = {@JoinColumn(name ="laboratoire_id_Fk" , referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn (name = "analyse_id_Fk", referencedColumnName = "id")})
	
	private Set<Analyse> analyses;

	public Laboratoire() {
		// TODO Auto-generated constructor stub
	}

}
