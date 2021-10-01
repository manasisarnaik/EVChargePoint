package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class VehiclesP 
{
	private int id;
	
	private String type;
	
	private String registration_no;
	
	private String filepath;
	
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

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public List<BookingsP> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingsP> bookings) {
		this.bookings = bookings;
	}
	
	
}
