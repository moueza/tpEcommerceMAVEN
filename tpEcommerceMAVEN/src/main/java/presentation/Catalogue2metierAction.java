package presentation;

import metier.Services;

public class Catalogue2metierAction {
	// DI
	Services metier;
	
	String chaine;

	
	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	private String executeString() {
		// if
		return "success";
		// return "input";
	}

	String execute() {
		return this.chaine;
	}

	public void validate() {
	}

	public Services getMetier() {
		return metier;
	}

	public void setMetier(Services metier) {
		this.metier = metier;
	}
	
	public String toToPanier(){
		return "success";
	}
	
	public void afficherCatalogue(){
		this.chaine= "afficheCatalogue";
	}
	
}
