package ania.projects.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class AyantDroit extends Patient {

	public AyantDroit() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany(mappedBy = "ayantDroits")
	private Set<Souscripteur> souscripteurs = new HashSet<>();
}
