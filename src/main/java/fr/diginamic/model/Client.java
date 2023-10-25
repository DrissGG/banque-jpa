/**
 * 
 */
package fr.diginamic.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author driss
 *
 */
@Entity
public class Client {
	
	@Id
	private int id;
	
	private String nom;
	private String prenom;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissance;

}
