package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="slots")
@Table(name="slots")
public class Slots 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false)
	private int no_of_slots;
	
	@ManyToOne
	private Dealers dealers;
	
	@OneToMany(mappedBy="slot")
	private List<Packages> packages;
	
	@OneToMany(mappedBy="slot")
	private List<Bookings> bookings;

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

	public Dealers getDealers() {
		return dealers;
	}

	public void setDealers(Dealers dealers) {
		this.dealers = dealers;
	}

	public List<Packages> getPackages() {
		return packages;
	}

	public List<Bookings> getBookings() {
		return bookings;
	}

	public int getId() {
		return id;
	}

	public SlotsP toPOJO()
	{
		SlotsP s = new SlotsP();
		List<BookingsP> bp = new ArrayList();
		for(Bookings booking:bookings)
		{
			bp.add(booking.toPOJO());
		}
		s.setBookings(bp);
		s.setId(id);
		s.setNo_of_slots(no_of_slots);
		List<PackagesP> pp = new ArrayList();
		for(Packages pack:packages)
		{
			pp.add(pack.toPOJO());
		}
		s.setPackages(pp);
		s.setType(type);
		return s;
	}
}