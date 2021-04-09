package ania.projects.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"num_carte"}))
public class Pharmacie_assureur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Column(name = "num_carte", nullable = false)
	private String numCarte;
			
	@ManyToOne
    @JoinColumn(name = "assureur_id")
    Assureur assureur;

    @ManyToOne
    @JoinColumn(name = "pharmacien_id")
    Pharmacien pharmacien;
	
    
    LocalDateTime dateInscription;
    
    
	public Pharmacie_assureur() {
		// TODO Auto-generated constructor stub
	}

}
