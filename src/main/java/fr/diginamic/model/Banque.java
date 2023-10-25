/**
 * 
 */
package fr.diginamic.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 * @author driss
 *
 */
@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	@OneToMany(mappedBy = "banque")
	private List<Client> clients;

	
	/** Constructor
	 * 
	 */
	public Banque() {
	}   
	/** Getters
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setters
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getters
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/** Setters
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	/** Getters
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/** Setters
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	
}
