package test.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity     @Table(name = "commande")
public class Commande {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int  IDC        ;                             
	private String LIBELEE ;
	
	
	
	@ManyToOne
	private Client client;
	
	public Commande(String lIBELEE,Client CLIENT) {
		
		LIBELEE = lIBELEE;
		client=CLIENT;
	}
	public Commande() {
		
	}
	public int getIDC() {
		return IDC;
	}
	public void setIDC(int iDC) {
		IDC = iDC;
	}
	public String getLIBELEE() {
		return LIBELEE;
	}
	public void setLIBELEE(String lIBELEE) {
		LIBELEE = lIBELEE;
	}
	
	
	@Override
	public String toString() {
		
		return "Commande [IDC=" + IDC + ", LIBELEE=" + LIBELEE + "]";
		
	}
	 

}
