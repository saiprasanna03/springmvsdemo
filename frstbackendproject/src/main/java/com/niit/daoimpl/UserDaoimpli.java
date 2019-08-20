package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDao;
import com.niit.model.User;
import com.niit.model.User;
@Repository("userDao") 
@Transactional

public class UserDaoimpli implements UserDao
{
	
	@Autowired
    SessionFactory sessionFactory;
    
	public boolean addUser(User User) {
		
		 try
	        {
	        sessionFactory.getCurrentSession().save(User);
	        return true;
	        }
	        catch(Exception e)
	        {
	        return false;
		}
	}

	public boolean deleteUser(User User) {
	
		try
        {
        sessionFactory.getCurrentSession().delete(User);
        return true;
        }
        catch(Exception e)
        {
        return false;
        }
	}

	public boolean updateUser(User User) {
		
		try
        {
        sessionFactory.getCurrentSession().update(User);
        return true;
        }
        catch(Exception e)
        {
        return false;
	}
	}

	public List<User> listUsers() {
		
		 Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from User");
	        List<User> listUsers=query.list();
	        session.close();
			return listUsers;
	}

	public User getUser(int UserID) {
		
		   Session session=sessionFactory.openSession();
	        User User=session.get(User.class,UserID);        
			return User ;
	}

	
}
