package test.jpa.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity@Table(name = "produit")
public class Produitt {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private int price;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	 @JoinTable(name="my_join_table_produit_promotion",joinColumns = @JoinColumn(
			   name = "produuit_fk",
			   referencedColumnName = "id"
			   ),
			   inverseJoinColumns = @JoinColumn(
			   name = "promotion_fk",
			   referencedColumnName = "id"
			   ))
	List<Promotion>lp;
	
	
		public Produitt() {
				
			}
	
	public Produitt(String nom,int price) {
		
		this.nom=nom;
		this.price=price;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
