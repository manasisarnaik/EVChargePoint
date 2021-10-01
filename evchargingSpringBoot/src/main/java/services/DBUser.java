package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Users;

public class DBUser {
	public boolean createUser(Session s, Users user)
	{
		try {
			Transaction t = s.beginTransaction();
			s.save(user);
			t.commit();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateUser(Session s, Users user) {
		try {
			Transaction t = s.beginTransaction();
			s.update(user);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	public Users readUser(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query = s.createQuery("from users as a where a.id=:c");
			query.setParameter("c", id);
			List<Users> list = query.list();
			Users user_res = null;
			for(Users user:list)
			{
				user_res = user;
			}
			t.commit();
			return user_res;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Users readUser(Session s, String email)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from users as a where a.email_id=:e");
			query.setParameter("e", email);
			List<Users> list = query.list();
			Users user_res = null;
			for(Users user: list)
			{
				user_res = user;
			}
			t.commit();
			return user_res; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Users> getAllUsers(Session s)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from users");
			List<Users> list = query.list();
			t.commit();
			return list; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
