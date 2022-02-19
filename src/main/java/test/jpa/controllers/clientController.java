package test.jpa.controllers;



import test.jpa.dao.clientDaoImpliment;
import test.jpa.dao.commandeImplement;
import test.jpa.models.Client;





public class clientController{
	
	       private clientDaoImpliment daoOnClass;
	      private  commandeImplement  daoCommande;
	       
	       
	
			public clientController() { }



			public void setDaoOnClass(clientDaoImpliment daoOnClass) {
				this.daoOnClass = daoOnClass;


			}



			public void saveClient(Client c1) {
				// TODO Auto-generated method stub
				daoOnClass.saveClient(c1);
				
			}



			public Client findClient(long i) {
				// TODO Auto-generated method stub
				Client c=daoOnClass.findClient(i);
				return c;
			}



			public void updateClient(Client c2) {
				// TODO Auto-generated method stub
				daoOnClass.updateClient(c2);
				
			}



			public void remouveClient(Client c3) {
				// TODO Auto-generated method stub
				daoOnClass.remouveClient(c3);
				
			}



			/**
			 * @param daoCommande the daoCommande to set
			 */
			public void setDaoCommande(commandeImplement daoCommande) {
				this.daoCommande = daoCommande;
			}





			

			
			
			
			
			
		
			
			
			
}
