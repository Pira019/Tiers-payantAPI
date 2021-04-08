package ania.projects.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	
	@ManyToMany(cascade =  {CascadeType.ALL})
	private Set<Consultation> consultations = new HashSet<>();
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

}
