package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class SlotsP 
{
	private int id;
	
	private String type;
	
	private int no_of_slots;
	
	private List<PackagesP> packages;
	
	private List<BookingsP> bookings;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNo_of_slots() {
		return no_of_slots;
	}

	public void setNo_of_slots(int no_of_slots) {
		this.no_of_slots = no_of_slots;
	}

	public List<PackagesP> getPackages() {
		return packages;
	}

	public void setPackages(List<PackagesP> packages) {
		this.packages = packages;
	}

	public List<BookingsP> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingsP> bookings) {
		this.bookings = bookings;
	}
	
	
}
