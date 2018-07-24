package com.tuto.dao;

import java.util.List;

import comm.tuto.model.Product;

public interface IProductDao {
	
	
	public List<Product> findAll();

	public Product ProductfindById(int id);

	public Product Productsave(Product product);
}
