package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Brands;
import hibernate.Dealers;

public class DBBrands {
	public boolean createBrands(Session s, Brands brand)
	{
		try
		{
			Transaction t = s.beginTransaction();
			s.save(brand);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Brands readBrandsById(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from brands as a where a.id=:c");
			query.setParameter("c", id);
			List<Brands> list = query.list();
			t.commit();
			for(Brands p:list)
			{
				return p;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Brands> readAllBrands(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from brands");
			List<Brands> list = query.list();
			t.commit();
			return list; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Brands readBrandsByDealerId(Session s, int dealer_id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from brands as a where a.dealers.id=:c");
			query.setParameter("c", dealer_id);
			List<Brands> list = query.list();
			t.commit();
			return (Brands) list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
