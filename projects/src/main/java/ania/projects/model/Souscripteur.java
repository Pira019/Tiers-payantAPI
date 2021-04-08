package ania.projects.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Souscripteur extends Patient{

	public Souscripteur() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	private Set<AyantDroit> ayantDroits = new HashSet<>();

}
