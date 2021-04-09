package ania.projects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Ordonnance_detail {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	private long quatite;
	
	@Column(nullable = false)
	private String indication;
	
	@ManyToOne
    @JoinColumn(name = "ordonnance_id")
    Ordonnance ordonnance;

    @ManyToOne
    @JoinColumn(name = "medicament_id")
    Medicaments medicaments;
    
    
	public Ordonnance_detail() {
		// TODO Auto-generated constructor stub
	}

}
