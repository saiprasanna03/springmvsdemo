package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplyDao;
import com.niit.model.Category;
import com.niit.model.Supply;

@Repository("supplyDao") 
@Transactional


public class SupplyDaoimpli implements SupplyDao 
{
	@Autowired
    SessionFactory sessionFactory;
    
	public boolean addSupply(Supply supply)
	{
		
		 try
	        {
	        sessionFactory.getCurrentSession().save(supply);
	        return true;
	        }
	        catch(Exception e)
	        {
	        return false;
		}
	}

	public boolean deleteSupply(Supply supply) 
	{
	
		try
        {
        sessionFactory.getCurrentSession().delete(supply);
        return true;
        }
        catch(Exception e)
        {
        return false;
        }
	}

	public boolean updateSupply(Supply supply) {
		
		try
        {
        sessionFactory.getCurrentSession().update(supply);
        return true;
        }
        catch(Exception e)
        {
        return false;
	}
	}

	public List<Supply> listsuppliers1() {
		
		 Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from supply");
	        List<SupplyDao> listSuppliers=query.list();
	        session.close();
			return listsuppliers();
	}
	public Category getCategory(int categoryID) {
		
		   Session session=sessionFactory.openSession();
	        Category category=session.get(Category.class,categoryID);        
			return category ;
	}

	public List<Supply> listsuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Supply getSupply(int supplyID) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	}
		
