package com.org.service;

import java.util.List;
import java.util.stream.Stream;

import com.org.model.Product;

public interface ProductService {

	public void addProduct(Product product);
Stream<Product>	 getAllProduct();
//This method will search product whose price is more than 5000.00
 List<Product> serachProductsBasedPrice();
	double  getTotalPrice();
	List<Product> sortProductFromLowPricetoHighPrice();
	Product getMaxProductPrice();
	Product removeProduct(int pId);
List<Product> updateProduct(int productId);
	
	
	
	
}
