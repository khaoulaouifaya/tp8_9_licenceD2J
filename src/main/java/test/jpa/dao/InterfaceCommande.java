package test.jpa.dao;

import test.jpa.models.Commande;

public interface InterfaceCommande {
	void addCommande(Commande commande);
	void upateCommande(Commande commande);
	void deleteCommande(Commande commande);

}
