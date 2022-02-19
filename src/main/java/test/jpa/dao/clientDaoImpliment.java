package test.jpa.dao;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import test.jpa.models.Client;



public class clientDaoImpliment implements clientDaoInterface {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbaseOracle");
	EntityManager em=emf.createEntityManager();

	

	public clientDaoImpliment() { }

	
	
     public Client saveClient(Client c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	
		return null;

	}

    

	public 	Client  findClient(long id) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		
		Client c=em.find(Client.class, id);
		em.getTransaction().commit();
		return c;
		
	}



	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		return null;
	}



	public Client remouveClient(Client c) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		return null;
	}



		







	

}
