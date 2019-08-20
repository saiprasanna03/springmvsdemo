package com.niit.frstbackendproject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

public class ProductTest 
{
	@Autowired
	static ProductDao productDao;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    productDao=(ProductDao) context.getBean("productDao");
	}
	//@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProName("children Dresses");
		product.setProDesc("cotton wear");
		product.setProprice(2500);
		product.setStock(20);
		product.setProId(101);
		product.setCategoryID(201);
		product.setSupplierId(301);
		
		
		
		assertTrue("Problem in adding the product",productDao.addProduct(product));
	}
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDao.getProduct(3);
		
		assertTrue("Problem in deleting product",productDao.deleteProduct(product));
	}
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDao.getProduct(2);
		product.setProDesc("cotton  Wear");
		
		assertTrue("Problem in updating product",productDao.updateProduct(product));
	}



}
