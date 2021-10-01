package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import hibernate.Bookings;
import hibernate.Packages;
import hibernate.Slots;
import hibernate.Users;
import hibernate.Vehicles;

public class DBBookings {
	
	public boolean createBooking(Session s, Bookings booking, Users user, Vehicles vehicle, Packages package_, Slots slot)
	{
		try
		{
			Transaction t = s.beginTransaction();
			booking.setSlot(slot);
			booking.setPackage_(package_);
			booking.setVehicle(vehicle);
			s.save(booking);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Bookings readBookingById(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from bookings as a where a.id=:c");
			query.setParameter("c", id);
			List<Bookings> list = query.list();
			t.commit();
			for(Bookings p:list)
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
	
	public List<Bookings> readBookingsByVehicleId(Session s, int vehicle_id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from bookings as a where a.vehicle.id=:c");
			query.setParameter("c", vehicle_id);
			List<Bookings> list = query.list();
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
