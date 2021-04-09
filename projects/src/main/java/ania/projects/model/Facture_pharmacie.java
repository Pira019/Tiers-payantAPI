package ania.projects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Facture_pharmacie {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@ManyToOne   
    private Pharmacien pharmacien;

    @ManyToOne    
    Ordonnance ordonnance;
    
    
	
	public Facture_pharmacie() {
		// TODO Auto-generated constructor stub
	}

}
