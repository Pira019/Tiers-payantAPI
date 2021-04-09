package ania.projects.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "facture_analyses")
@Data

public class Facture_analyses extends Facture {
 
	public Facture_analyses() {
		// TODO Auto-generated constructor stub
	}
 
}
