package test.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import jakarta.persistence.OneToOne;


@Entity
public class CarteFidelio {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String code;
	
	@OneToOne
   private Client clt;
	
	public void setClt(Client clt) {
		this.clt = clt;
	}
	
	public CarteFidelio() {
		
	}
	
	public CarteFidelio(long id,String code) {
	
	this.id=id;
	this.code=code;
		
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	

}
