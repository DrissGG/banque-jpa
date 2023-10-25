/**
 * 
 */
package fr.diginamic.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author driss
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String numero;
	private double solde;
	
	@ManyToMany
	@JoinTable(name = "client_compte",
    joinColumns = @JoinColumn(name = "id_client"),
    inverseJoinColumns = @JoinColumn(name = "id_compte"))
	private List<Client> clients;
	
	@OneToMany(mappedBy="compte")
	private List<Operation> operation;

	/** Constructor
	 * 
	 */
	public Compte() {
		
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

	/** Getters
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setters
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getters
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setters
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
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
	
	
	
	
	

}
