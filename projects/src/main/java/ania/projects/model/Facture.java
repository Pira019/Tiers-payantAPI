package ania.projects.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Facture {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateFacture;
	
	@Column(name ="detailFacture") 
	protected Date detail;
	
	public Facture() {
		// TODO Auto-generated constructor stub
	}

}
