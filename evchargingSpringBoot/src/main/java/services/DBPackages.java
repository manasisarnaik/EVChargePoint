package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Packages;
import hibernate.Slots;

public class DBPackages {
	public boolean createPackage(Session s, Packages package_, Slots slot) {
		try
		{
			Transaction t = s.beginTransaction();
			package_.setSlot(slot);
			s.save(package_);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Packages readPackageById(Session s, int id) {
		try {
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from packages as a where a.id=:c");
			query.setParameter("c", id);
			List<Packages> list = query.list();
			t.commit();
			for(Packages p: list)
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
	
	public Packages readAllPackages(Session s) {
		try {
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from packages");
			List<Packages> list = query.list();
			t.commit();
			for(Packages p: list)
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
	
	public List<Packages> readPackageByVehicleId(Session s,int vehicle_id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from packages as a where a.vehicle.id=:c");
			query.setParameter("c", vehicle_id);
			List<Packages> list = query.list();
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
