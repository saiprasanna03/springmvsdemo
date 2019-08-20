package com.niit.frstbackendproject;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplyDao;
import com.niit.model.*;
public class SupplyTest 
{
	@Autowired
	
	static SupplyDao supplyDao;
	
	@BeforeClass
	public static void executeFirst1()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    supplyDao=(SupplyDao) context.getBean("supplyDao");
	}
	//@Ignore
	@Test
	public void addSupplyTest()
	{
	Supply s=new Supply();
	s.setSupplyName("prasanna");
	s.setSupplyAdderess("dresses");
	s.setSupplyDesc("womens wear");
		assertTrue("Problem in adding the supply",supplyDao.addSupply(s));
	}
	@Ignore
	@Test
	public void deleteSupplyTest()
	{
Supply supply=supplyDao.getSupply(1);
		
		assertTrue("Problem in deleting supply",supplyDao.deleteSupply(supply));
	}
	@Ignore
	@Test
	public void updateSuplyTest()
	{
		Supply s1=supplyDao.getSupply(2 );
		s1.setSupplyAdderess("dresses");
		
		assertTrue("Problem in updating supply",supplyDao.updateSupply(s1));
	}
}
 
	
	