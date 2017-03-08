package entites;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	List<Produit> listeDeProduits = new ArrayList<Produit>();

	public List<Produit> getListeDeProduits() {
		return listeDeProduits;
	}

	public void setListeDeProduits(List<Produit> listeDeProduits) {
		this.listeDeProduits = listeDeProduits;
	}
}
