package metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entites.Catalogue;
import entites.Panier;
import entites.Produit;

public class ServicesImpl implements Services {
	
	
	public void ajouterProduitPanier(Produit produit, Panier panier, Integer qte) {
		Map<Produit, Integer> tempProduit;
		tempProduit = panier.getListProduit();
		tempProduit.put(produit, qte);
		panier.setListProduit(tempProduit);
	}

	public void retirerProduitPanier(Produit produit, Panier panier) {
		Map<Produit, Integer> tempProduit;
		tempProduit = panier.getListProduit();
		tempProduit.remove(produit);
		panier.setListProduit(tempProduit);
	}

	public Map<Produit, Integer> listerPanier(Produit produit, Panier panier) {
		return panier.getListProduit();
	}

	public void validerPanier(Panier panier, Map<Produit, Integer> tempProduit) {
		for (int i = 0; i < tempProduit.size(); i++) {
			ajouterProduitPanier((Produit) ((List) tempProduit.keySet()).get(i), panier,
					(Integer) ((List) tempProduit.values()).get(i));
		}
	}

	public List<Produit> listerCatalogue(Catalogue catalogue) {
		catalogue.setListeDeProduits(creerCatalogueDur()); //ligne temporaire
		return catalogue.getListeDeProduits();
	}
	
	public List<Produit> creerCatalogueDur(){
		List<Produit> liste = new ArrayList<Produit>();
		Produit p1 = new Produit("A200", "Avion", 5000., 2);
		Produit p2 = new Produit("Nimbus", "balais", 300., 55);
		Produit p3 = new Produit("Orange", "carotte", 1.99, 100);
		Produit p4 = new Produit("Bec", "Flamant rose", 500000., 1);
		
		liste.add(p1);
		liste.add(p2);
		liste.add(p3);
		liste.add(p4);
		
		return liste;
	}
}
