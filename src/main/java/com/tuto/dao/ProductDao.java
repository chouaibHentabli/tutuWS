package com.tuto.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import comm.tuto.model.Product;

@Repository
public class ProductDao implements IProductDao {

	public static List<Product> products = new ArrayList<>();

	static {

		products.add(new Product(1, new String("Ordinateur portable"), 350, 200));

		products.add(new Product(2, new String("Aspirateur Robot"), 500, 200));

		products.add(new Product(3, new String("Table de Ping Pong"), 750, 200));

	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product ProductfindById(int id) {
		// TODO Auto-generated method stub
		for (Product product : products) {

			if (product.getId() == id) {

				return product;
			}
		}
		return null;
	}

	@Override
	public Product Productsave(Product product) {
		// TODO Auto-generated method stub
		products.add(product);
		return product;
	}

}
