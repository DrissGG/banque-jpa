/**
 * 
 */
package fr.diginamic.executable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.model.Adresse;
import fr.diginamic.model.AssuranceVie;
import fr.diginamic.model.Banque;
import fr.diginamic.model.Client;
import fr.diginamic.model.Compte;
import fr.diginamic.model.LivretA;
import fr.diginamic.model.Operation;
import fr.diginamic.model.Virement;

/**
 * @author driss
 *
 */
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpaBanque_essai");
		EntityManager em = emFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		//création d'une adresse 
		Adresse addr1 = new Adresse();
		addr1.setNumero(122);
		addr1.setRue("Avenue de la liberte");
		addr1.setCodePostal(34000);
		addr1.setVille("Montpellier");
		
		//création d'une banque
		Banque banque = new Banque();
		banque.setNom("Caisse d'épargne");
		
		//creation client 1
		Client client1 = new Client();
		client1.setNom("Laporte");
		client1.setPrenom("Jean");
		client1.setAdresse(addr1);
		client1.setBanque(banque);
		
		//creation client 2
		Client client2 = new Client();
		client2.setNom("Malo");
		client2.setPrenom("Aurelie");
		client2.setAdresse(addr1);
		client2.setBanque(banque);
		
		//creation client 3
		Client client3 = new Client();
		client3.setNom("neymar");
		client3.setPrenom("Junior");
		
		//création Compte
		Compte compte = new Compte();
		compte.setSolde(20000);;
		compte.setNumero("2");
		
		//Associer le compte aux 2 clients 
		List<Client> clients = new ArrayList<>();
		clients.add(client1);
		clients.add(client2);
		compte.setClients(clients);
		
		// Création d'un compte d'assurance vie
		AssuranceVie assuranceVie = new AssuranceVie();
		assuranceVie.setTaux(0.05); // Exemple de taux
	    assuranceVie.setDateFin(new Date(124, 0, 1));
	    
	    // Création d'un compte Livret A
	    LivretA livretA = new LivretA();
	    livretA.setTaux(0.02);
		
	    // Associer les comptes aux clients
	    List<Compte> compteClients1 = new ArrayList<>();
	    List<Compte> compteClients2 = new ArrayList<>();
	    
	    compteClients1.add(compte);
	    compteClients1.add(assuranceVie);	    
	    
	    compteClients2.add(compte);
	    compteClients2.add(livretA);
	    
	    client1.setCompte(compteClients1);
	    client2.setCompte(compteClients2);
	    
	    // Création d'opérations de virement
	    Virement virement = new Virement();
	    virement.setMontant(500.0); 
	    virement.setBeneficiaire("Bénéficiaire1");
	    virement.setCompte(compte);
	    
	    // Création d'opérations
	    Operation operation = new Operation();
	    operation.setMontant(200.000); 
	    operation.setMotif("Achat imobilier"); 
	    operation.setCompte(compte);
	    
	    em.persist(banque);
	    em.persist(client1);
	    em.persist(client2);
	    em.persist(compte);
	    em.persist(assuranceVie);
	    em.persist(livretA);
	    em.persist(virement);
	    em.persist(operation);
	    
		transaction.commit();
		em.close();
	    emFactory.close();

	}

}
