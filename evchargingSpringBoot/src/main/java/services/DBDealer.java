package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Brands;
import hibernate.Dealers;

public class DBDealer {
	public boolean createDealer(Session s,Dealers dealers, List<Brands> brands)
	{
		try
		{
			Transaction t = s.beginTransaction();
			dealers.setBrands(brands);
			s.save(dealers);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateDealers(Session s, Dealers dealers)
	{
		try
		{
			Transaction t = s.beginTransaction();
			s.update(dealers);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Dealers readDealerById(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from dealers as a where a.id=:c");
			query.setParameter("c", id);
			List<Dealers> list = query.list();
			if(list!=null)
			{
				for(Dealers dealers:list)
				{
					t.commit();
					return dealers;
				}
			}
			t.commit();
			return null; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Dealers readDealerByName(Session s, String name)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from dealers as a where a.name=:c");
			query.setParameter("c", name);
			List<Dealers> list = query.list();
			if(list!=null)
			{
				for(Dealers dealers:list)
				{
					t.commit();
					return dealers;
				}
			}
			t.commit();
			return null; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	public List<Dealers> readAllDealers(Session s)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from dealers");
			List<Dealers> list = query.list();
			t.commit();
			return list; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Dealers> readAllDealersByPincode(Session s, int pincode)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from dealers as a where a.address.pincode=:c");
			query.setParameter("c", pincode);
			List<Dealers> list = query.list();
			t.commit();
			return list; 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
//	public List<Dealers> readAllVendorsByCategory(Session s, Categories cat)
//	{
//		try
//		{
//			Transaction t = s.beginTransaction();
//			Query query=s.createQuery("Select a from vendors as a join a.categories as b where b.category=:c");
//			query.setParameter("c", cat.getCategory());
//			List<Vendors> list = query.list();
//			t.commit();
//			return list; 
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return null;
//	}
}
