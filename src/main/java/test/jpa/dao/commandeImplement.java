package test.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import test.jpa.models.Commande;

public class commandeImplement implements InterfaceCommande {
	
	
	EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("dbaseOracle");
	EntityManager manager=managerFactory.createEntityManager();
	
	
	public void addCommande(Commande commande) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(commande);
		manager.getTransaction().commit();
		
	}

	public void upateCommande(Commande commande) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.merge(commande);
		manager.getTransaction().commit();
	}

	public void deleteCommande(Commande commande) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.remove(commande);
		manager.getTransaction().commit();
		
	}

	/**
	 * @param clt the clt to set
	 */
	
	

}
