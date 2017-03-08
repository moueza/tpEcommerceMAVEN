package entites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Panier {
	
	/** Represente la liste des produits dans le panier ainsi que leurs quantit� */
	Map<Produit, Integer> listProduit = new HashMap();
	
	/** Permet de r�cup�rer la liste des produits dans un panier*/
	public Map<Produit, Integer> getListProduit() {
		return listProduit;
	}
	
	public void setListProduit(Map<Produit, Integer> listProduit) {
		this.listProduit = listProduit;
	}
	
}
