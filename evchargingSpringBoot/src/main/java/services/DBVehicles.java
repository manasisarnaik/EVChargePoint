package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Users;
import hibernate.Vehicles;

public class DBVehicles {
	public boolean createVehicle(Session s, Vehicles vehicle, Users user)
	{
		try
		{
			Transaction t = s.beginTransaction();
			vehicle.setUser(user);
			s.save(vehicle);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Vehicles> readAllVehicles(Session s)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from vehicles");
			List<Vehicles> list = query.list();
			t.commit();
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Vehicles readVehicleById(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from vehicles as a where a.id=:c");
			query.setParameter("c", id);
			List<Vehicles> list = query.list();
			t.commit();
			for(Vehicles p:list)
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
	
	
	
	public List<Vehicles> readVehicleByUserId(Session s, int user_id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from vehicles as a where a.user.id=:c");
			query.setParameter("c", user_id);
			List<Vehicles> list = query.list();
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
