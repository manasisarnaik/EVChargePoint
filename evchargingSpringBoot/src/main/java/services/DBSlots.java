package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Bookings;
import hibernate.Dealers;
import hibernate.Slots;

public class DBSlots {
	public boolean createSlots(Session s, Slots slot, Dealers dealers)
	{
		try
		{
			Transaction t = s.beginTransaction();
			slot.setDealers(dealers);
			s.save(slot);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Slots readSlotById(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from slots as a where a.id=:c");
			query.setParameter("c", id);
			List<Slots> list = query.list();
			t.commit();
			for(Slots p:list)
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
	
	public List<Slots> readAllSlots(Session s)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from slots");
//			query.setParameter("c", id);
			List<Slots> list = query.list();
			t.commit();
			
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Slots> readSlotsByDealerId(Session s, int dealer_id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from bookings as a where a.dealer.id=:c");
			query.setParameter("c", dealer_id);
			List<Slots> list = query.list();
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
