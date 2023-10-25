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
public class Adresse {
	@Id
	private int id;
	
	private int numero;
	private String rue;
	private int codePostal;
	private String ville;
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
	public int getNumero() {
		return numero;
	}
	/** Setters
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/** Getters
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/** Setters
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/** Getters
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}
	/** Setters
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	/** Getters
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/** Setters
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
