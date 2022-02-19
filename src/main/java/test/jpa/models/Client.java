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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity  @Table(name = "Client")
public class Client {

	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private long id;
	private String name;
	private String prenom;
	private int age;
	
	
   @OneToMany(cascade = {CascadeType.ALL})
	private List<Commande> listC;

   @ManyToMany(cascade = {CascadeType.ALL})
   @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
		   name = "client_fk",
		   referencedColumnName = "id"
		   ),
		   inverseJoinColumns = @JoinColumn(
		   name = "promotion_fk",
		   referencedColumnName = "id"
		   ))
   private List<Promotion>lpromo;
   
   
	@OneToOne (cascade = {CascadeType.ALL})
	private CarteFidelio carte;
	

	public void setCarte(CarteFidelio carte) {
		this.carte = carte;
	}

	
	
   public void setLpromo(List<Promotion> lpromo) {
	this.lpromo = lpromo;
}
   
public void setListC(List<Commande> listC) {
	this.listC = listC;
}

	
	public Client(String name,String prenom,int age) {
		
	this.prenom=prenom;
	this.age=age;
	this.name = name;
	
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Client() {
	
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", prenom=" + prenom + ", age=" + age + "]";
	}

	/**
	 * @param co the co to set
	 */
	
	
	
}
