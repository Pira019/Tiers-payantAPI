package ania.projects.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Prestation {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	
	@ManyToMany(mappedBy = "prestations")
	private Set<Consultation> consultations = new HashSet<>();

	public Prestation() {
		// TODO Auto-generated constructor stub
	}

}
