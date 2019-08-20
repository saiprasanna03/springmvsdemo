package com.niit.frstbackendproject;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;
import com.niit.model.User;

public class UserTest
{
	
	@Autowired
	static UserDao UserDao;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    UserDao=(UserDao) context.getBean("userDao");
	}
	//@Ignore
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUsername("prasanna");
		user.setPassword("prasanna32");
		user.setRole("ROLE_USER");
		user.setEnabled(true);
		user.setCustomerName("pinky");
		
		
		
		
		assertTrue("Problem in adding the User",UserDao.addUser(user));
	}
	@Ignore
	@Test
	public void deleteUserTest()
	{
		User User=UserDao.getUser(1);
		
		assertTrue("Problem in deleting User",UserDao.deleteUser(User));
	}
	@Ignore
	@Test
	public void updateUserTest()
	{
		User User=UserDao.getUser(2 );
		User.setCustomerName("nani");
		
		assertTrue("Problem in updating User",UserDao.updateUser(User));
	}

}
