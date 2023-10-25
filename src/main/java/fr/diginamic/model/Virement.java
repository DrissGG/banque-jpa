/**
 * 
 */
package fr.diginamic.model;

import javax.persistence.Entity;

/**
 * @author driss
 *
 */
@Entity
public class Virement extends Operation{
	private String beneficiaire;

	/** Getters
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/** Setters
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
}
