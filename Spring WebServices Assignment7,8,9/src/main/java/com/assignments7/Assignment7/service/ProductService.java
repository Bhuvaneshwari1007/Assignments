package com.assignments7.Assignment7.service;

import java.util.List;

import com.assignments7.Assignment7.bean.Product;

public interface ProductService {
		   public List<Product> showAllProduct();
		   public Product showById(int id);
		   public Product addProduct(Product product);
		   public Product updateProduct(Product p);
		   public void deleteProduct(int id);
		}


