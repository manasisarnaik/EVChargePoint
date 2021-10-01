package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Users;

public class ReadUser 
{
	public Users readUser(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from users as a where a.id=:e");
			query.setParameter("e", id);
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
}
