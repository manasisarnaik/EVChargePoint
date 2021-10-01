package hibernate;

import java.util.List;

public class UsersP 
{
	private int id;
	
	private Name name;
	
	private Address address;
	
	private String email_id;
	
	private long mobile_no;
	
	private String password;
	
	private List<UserPincodesP> user_pincode;
	
	private List<DocumentsP> documents;
	
	private List<VehiclesP> vehicles;
	
	private List<BookingsP> bookings;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserPincodesP> getUser_pincode() {
		return user_pincode;
	}

	public void setUser_pincode(List<UserPincodesP> user_pincode) {
		this.user_pincode = user_pincode;
	}

	public List<DocumentsP> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentsP> documents) {
		this.documents = documents;
	}

	public List<VehiclesP> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<VehiclesP> vehicles) {
		this.vehicles = vehicles;
	}

	public List<BookingsP> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingsP> bookings) {
		this.bookings = bookings;
	}
	
	
}
