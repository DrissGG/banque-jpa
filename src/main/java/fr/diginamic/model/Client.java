/**
 * 
 */
package fr.diginamic.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author driss
 *
 */
@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Constructor
	 * 
	 */
	public Client() {
	}

	private String nom;
	private String prenom;
	@Embedded
	private Adresse adresse;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name ="id_banque")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name = "client_compte",
    joinColumns = @JoinColumn(name = "id_compte"),
    inverseJoinColumns = @JoinColumn(name = "id_client"))
	private List<Compte> compte;

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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setters
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getters
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/** Setters
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getters
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/** Setters
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/** Getters
	 * @return the compte
	 */
	public List<Compte> getCompte() {
		return compte;
	}

	/** Setters
	 * @param compte the compte to set
	 */
	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}

	/** Getters
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/** Setters
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
