/**
 * 
 */
package fr.diginamic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author driss
 *
 */
@Entity
public class Compte {	
	@Id
	private int id;
	
	private String numero;
	private double solde;
	
	
	

}
