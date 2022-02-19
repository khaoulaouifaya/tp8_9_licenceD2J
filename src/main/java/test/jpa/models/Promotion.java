package test.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promotion {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String description;
	
		public Promotion(long ID,String Description) {
			
			this.setId(ID);
			this.setDescription(Description);
				
			}
	
	
	
	public Promotion() {
		
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
