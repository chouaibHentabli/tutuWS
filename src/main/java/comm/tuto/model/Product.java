package comm.tuto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product {
	private int id;
	private String name;
	private int prix;
	@JsonIgnore
	private int prixAchat;

	public Product() {
		super();
	}

	public Product(int id, String name, int prix, int prixAchat) {
		super();
		this.id = id;
		this.name = name;
		this.prix = prix;
		this.prixAchat = prixAchat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	

}
