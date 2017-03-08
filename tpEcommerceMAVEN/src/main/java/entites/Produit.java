package entites;

public class Produit {
	private String ref;
	private String nom;
	private Double pxUnitr;
	
	public Produit(){
		
	}

	public Produit(String ref, String nom, Double pxUnitr, Integer qantStock) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.pxUnitr = pxUnitr;
		this.qantStock = qantStock;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPxUnitr() {
		return pxUnitr;
	}

	public void setPxUnitr(Double pxUnitr) {
		this.pxUnitr = pxUnitr;
	}

	public Integer getQantStock() {
		return qantStock;
	}

	public void setQantStock(Integer qantStock) {
		this.qantStock = qantStock;
	}

	private Integer qantStock;

}
