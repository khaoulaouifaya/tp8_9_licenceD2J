package test.jpa.dao;

import test.jpa.models.Client;

public interface clientDaoInterface {
	
	
	 Client saveClient(Client c);
	 Client updateClient(Client c);
	 Client findClient(long id);
	 Client remouveClient(Client c);

}
