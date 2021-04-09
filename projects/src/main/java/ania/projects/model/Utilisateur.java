package ania.projects.model;

 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
 

@Data
@MappedSuperclass
public abstract class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Column(nullable = false)
	protected String login;
	
	@Column(nullable = false)
	protected String motDePasse;
	
	protected boolean isState = true;
	
	@Temporal(TemporalType.DATE)
	protected Date dateInscription;
	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	
 

}
