package com.org.serviceimpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.org.model.Product;
import com.org.service.ProductService;

public class ProductServiceImpl implements ProductService {

	List<Product> listOfProduct=new ArrayList();
	//This method will take one product object ad save it to List or any collection type
	@Override
	public void addProduct(Product product) {

      listOfProduct.add(product);
		
	}

	//This method will convert list into stream and return that stream
	@Override
	public Stream<Product> getAllProduct() {

    Stream<Product> streamOfProduct=listOfProduct.stream();
		//return listOfProduct.stream();
    return streamOfProduct;
	}

	//I have stream api
	@Override
	public List<Product> serachProductsBasedPrice() {
		// TODO Auto-generated method stub
		/*List<Product> list=new ArrayList();
		for(int i=0; i<listOfProduct.size(); i++)
		{
			if(listOfProduct.get(i).getpPrice() >=5000.00)
			{
				list.add(listOfProduct.get(i));
			}
		}*/
		//List<Product> list=listOfProduct.stream().filter(p->p.getpPrice()>=5000.00).collect(Collectors.toList());
		return listOfProduct.stream().filter(p->p.getpPrice()>=5000.00).collect(Collectors.toList());
	}

	//This will calculate total price for all product
	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Product> sortProductFromLowPricetoHighPrice() {
		// TODO Auto-generated method stub
		/*
		 * interface Comparator
		 * {
		 * int compare(Object obj1, Object obj2);
		 * 
		 * {
		 * if(obj1.getProductPrice()>obj2.getproduct()
		 * {
		 * return 1;
		 * }
		 * return -1;
		 * 
		 * }
		 * 
		 * 
		 */
		Comparator<Product> productComparator=(product1, product2)->product1.getpPrice() <product2.getpPrice()?1:-1;
	List<Product> list=	listOfProduct.stream().sorted(productComparator).collect(Collectors.toList());
	ArrayList<Product> al=new ArrayList<Product>(list);
	
		
		return al;
	}

	@Override
	public Product getMaxProductPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product removeProduct(int pId) {
		// TODO Auto-generated method stub
		//listOfProduct.stream().filter(p->p.getProductId()==pId).forEach(p->p.);;
		//listOfProduct.stream().filter(p->listOfProduct.removeIf(p->p.getProductId()==pId));
		
	Product p=	listOfProduct.forEach(p->p.getProductId()==pId?listOfProduct.remove(pId):null);
		for(int i =0; i<listOfProduct.size(); i++)
		{
		if(listOfProduct.removeIf(p->p.getProductId()==pId))
		{
			
			return listOfProduct.get(i);
		}
		}
		
		
		
		
		
		
		return null;
	}

	@Override
	public List<Product> updateProduct(int prductId) {
		// TODO Auto-generated method stub
		return null;
	}

}
