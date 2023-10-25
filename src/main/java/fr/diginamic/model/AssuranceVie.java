/**
 * 
 */
package fr.diginamic.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author driss
 *
 */
@Entity
public class AssuranceVie extends Compte{
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	private double taux;
	
	/** Getters
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/** Setters
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
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
