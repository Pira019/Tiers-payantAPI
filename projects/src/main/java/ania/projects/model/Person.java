/**
 * 
 */
package ania.projects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
 

/**
 * @author InsurBT20
 * fr/ classe personne
 */
@Entity
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	protected String lastName,fistName;

}
