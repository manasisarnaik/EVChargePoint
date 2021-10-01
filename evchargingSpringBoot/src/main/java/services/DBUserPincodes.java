package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Users;
import hibernate.UserPincodes;

public class DBUserPincodes {
	public boolean createUserPincodes(Session s,UserPincodes pincode,Users user){
		try {
			Transaction t = s.beginTransaction();
			pincode.setUser(user);
			s.save(pincode);
			t.commit();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateUserPincodes(Session s, UserPincodes pincode) {
		try {
			Transaction t = s.beginTransaction();
			s.update(pincode);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public Users readUserPincodes(Session s) {
		try {
			Transaction t = s.beginTransaction();
			Query query = s.createQuery("from userpincodes");
//			query.setParameter("c", id);
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
	
	
	public Users readUserPincodes(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query = s.createQuery("from userpincodes as a where a.id=:c");
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
	
	public List<Users> getAllUsers(Session s)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from userpincodes");
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
