package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
@Repository("productDao") 
@Transactional

public class ProductDaoimpli implements ProductDao
{
	@Autowired
    SessionFactory sessionFactory;
    
	public boolean addProduct(Product product) {
        try
        {
        sessionFactory.getCurrentSession().save(product);
        return true;
        }
        catch(Exception e)
        {
        return false;
	}
}
	public boolean deleteProduct(Product product) {
		try
        {
        sessionFactory.getCurrentSession().delete(product);
        return true;
        }
        catch(Exception e)
        {
        return false;
        }
	}
	public boolean updateProduct(Product product) {
		try
        {
        sessionFactory.getCurrentSession().update(product);
        return true;
        }
        catch(Exception e)
        {
        return false;
	}
}
	public List<Product> listProducts() {
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from Product");
        List<Product> listProducts=query.list();
        session.close();
		return listProducts;
	}
	public Product getProduct(int ProductID) {
        Session session=sessionFactory.openSession();
        Product product=session.get(Product.class,ProductID);        
		return product ;
	}
	



}
