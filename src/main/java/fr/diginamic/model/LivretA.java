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
public class LivretA extends Compte{
	private double taux;

	/** Getters
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setters
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
