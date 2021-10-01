package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="users")
@Table(name="users")
public class Users 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Embedded
	private Name name;
	
	@Embedded
	private Address address;
	
	@Column(nullable=false, unique=true)
	private String email_id;
	
	@Column(nullable=false, unique=true)
	private long mobile_no;
	
	@Column(nullable=false)
	private String password;
	
	@OneToMany(mappedBy="user")
	private List<UserPincodes> user_pincode;
	
	@OneToMany(mappedBy="user")
	private List<Documents> documents;
	
	@OneToMany(mappedBy="user")
	private List<Vehicles> vehicles;
	
	@OneToMany(mappedBy="user")
	private List<Bookings> bookings;

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

	public List<UserPincodes> getUser_pincode() {
		return user_pincode;
	}

	public List<Documents> getDocuments() {
		return documents;
	}

	public List<Vehicles> getVehicles() {
		return vehicles;
	}


	public List<Bookings> getBookings() {
		return bookings;
	}


	public int getId() {
		return id;
	}
	
	public UsersP toPOJO()
	{
		UsersP u = new UsersP();
		u.setAddress(address);
		List<BookingsP> bp = new ArrayList();
		for(Bookings booking: bookings)
		{
			bp.add(booking.toPOJO());
		}
		u.setBookings(bp);
		List<DocumentsP> dp = new ArrayList();
		for(Documents document: documents)
		{
			dp.add(document.toPOJO());
		}
		u.setDocuments(dp);
		u.setEmail_id(email_id);
		u.setId(id);
		u.setMobile_no(mobile_no);
		u.setName(name);
		u.setPassword(password);
		List<UserPincodesP> up = new ArrayList();
		for(UserPincodes userp: user_pincode)
		{
			up.add(userp.toPOJO());
		}
		u.setUser_pincode(up);
		List<VehiclesP> vp = new ArrayList();
		for(Vehicles vehicle: vehicles)
		{
			vp.add(vehicle.toPOJO());
		}
		u.setVehicles(vp);
		return u;
	}
}
