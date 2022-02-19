package test.jpa.test;


 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.jpa.controllers.clientController;


public class appRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		clientController clt=(clientController) context.getBean("ctrl");
//		Client c=new Client("Ali","majdoubi",66);
//		List<Commande>lc=Arrays.asList(new Commande("jupe", c),new Commande("foulard", c));
//		c.setListC(lc);
//		clt.saveClient(c);
		
// clt.saveClient(new Client("hayat","laaouni",49));
//		clt.saveClient(new Client("abdo","ouifaya",19));
//	clt.saveClient(new Client("mohamed","ouifaya",16));
//		
//		
//		
	
//	Commande c=clt.findCommande(1);
//	System.out.print(c);
//	Client c=new Client("adil", "fatfi", 67);
//	Commande co=  new Commande("pinture");
//
//    clt.saveClient(c);
//	
//			clt.saveClient(c1);
	//Client c=clt.findClient(1);
//	c.setName("awatif");
//	c.setPrenom("salhi");
//   c.setAge(23);
//	clt.updateClient(c);
//		clt.remouveClient(c3);
		
	}

}
