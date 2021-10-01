package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="vehicles")
@Table(name="vehicles")
public class Vehicles 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false, unique=true)
	private String registration_no;
	
	@Column(unique=true)
	private String filepath;
	
	@ManyToOne
	private Users user;
	
	@OneToMany(mappedBy="vehicle")
	private List<Bookings> bookings;

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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<Bookings> getBookings() {
		return bookings;
	}

	public int getId() {
		return id;
	}
	
	public VehiclesP toPOJO()
	{
		VehiclesP v = new VehiclesP();
		List<BookingsP> bp = new ArrayList();
		for(Bookings booking: bookings)
		{
			bp.add(booking.toPOJO());
		}
		v.setBookings(bp);
		v.setFilepath(filepath);
		v.setId(id);
		v.setRegistration_no(registration_no);
		v.setType(type);
		return v;
	}
}
