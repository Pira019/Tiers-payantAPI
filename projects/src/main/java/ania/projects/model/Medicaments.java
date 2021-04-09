package ania.projects.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Medicaments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	//designation = nom commercial
	@Column(nullable = false)
	private String designation; 
	 
	private String indication;
	 
	
	@Column(name="denominationCommuneInternationle")
	private String denominationCommune;
	
	
	private double ppm;
	
	private double phm;
	 
	
	private String autre;  
	
	
	@OneToMany(mappedBy = "medicaments")
    List<Ordonnance_detail> ordonnance_details;
	
	public Medicaments() {
		// TODO Auto-generated constructor stub
	}

}
