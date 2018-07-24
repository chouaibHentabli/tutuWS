package com.tuto.tutoWS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tuto.dao.ProductDao;

import comm.tuto.model.Product;

@RestController
public class ProductcController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = "/Produits", method = RequestMethod.GET)
	public List<Product> listeProduits() {
		return productDao.findAll();
	}

	@RequestMapping(value = "/Produits/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable int id) {
		return productDao.ProductfindById(id);
	}

	@RequestMapping(value = "/Produits", method = RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		return productDao.Productsave(product);
	}

	@RequestMapping(value = "/Produits/{id}", method = RequestMethod.PUT)
	public String updateProduct() {
		return "Un exemple de produit";
	}

	@RequestMapping(value = "/Produits", method = RequestMethod.DELETE)
	public String deleteProduct() {
		return "Un exemple de produit";
	}

}
