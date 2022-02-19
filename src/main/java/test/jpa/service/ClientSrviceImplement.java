package test.jpa.service;

import test.jpa.dao.clientDaoImpliment;
import test.jpa.models.Client;

public class ClientSrviceImplement implements ClientServiceInterface {
	
	private clientDaoImpliment cltDao;
	
	
	
	public ClientSrviceImplement() {
		
		System.out.println("servicce");
	}




	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}




	public void setCltDao(clientDaoImpliment cltDao) {
		this.cltDao = cltDao;
	}




}
