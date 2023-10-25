/**
 * 
 */
package fr.diginamic.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author driss
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	private double montant;
	private String motif;
	
	/** Constructor
	 * 
	 */
	public Operation() {
	}

	@ManyToOne
	@JoinColumn(name="id_compte")
	private Compte compte;

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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/** Setters
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/** Getters
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Setters
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/** Getters
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/** Setters
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/** Getters
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/** Setters
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
