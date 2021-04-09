package ania.projects.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Ordonnance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOrdonnace;
	
	
	private String detailOrdonnace;
	
	@OneToMany(mappedBy = "ordonnance")
    List<Ordonnance_detail> ordonnance_details; 
    
    @OneToMany(mappedBy = "ordonnance")
	  private  List<Facture_pharmacie> ordonance;
    
    @ManyToOne 
    Medecin medecin;
    
	LocalDateTime dateOrdonance;
	
	public Ordonnance() {
		// TODO Auto-generated constructor stub
	}

}
