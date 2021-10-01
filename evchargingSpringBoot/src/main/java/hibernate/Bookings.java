package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity(name="bookings")
@Table(name="bookings")
public class Bookings 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false)
	private Date date;
	
	@Column(nullable=false)
	private Time start_time;
	
	@Column(nullable=false)
	private Time end_time;
	
	private Time in_time;
	
	private Time out_time;
	
	private double charge_time;
	
	
	@ManyToOne
	private Slots slot;
	
	@ManyToOne
	private Packages package_;
	
	@ManyToOne
	private Users user;
	
	@ManyToOne
	private Vehicles vehicle;

	public Vehicles getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicles vehicle) {
		this.vehicle = vehicle;
	}

	public Users getUser() 
	{
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public Date getDate() 
	{
		return date;
	}

	public void setDate(Date date) 
	{
		this.date = date;
	}

	public Time getStart_time() 
	{
		return start_time;
	}

	public void setStart_time(Time start_time) 
	{
		this.start_time = start_time;
	}

	public Time getEnd_time() 
	{
		return end_time;
	}

	public void setEnd_time(Time end_time) 
	{
		this.end_time = end_time;
	}

	public Time getIn_time() 
	{
		return in_time;
	}

	public void setIn_time(Time in_time) 
	{
		this.in_time = in_time;
	}

	public Time getOut_time() 
	{
		return out_time;
	}

	public void setOut_time(Time out_time) 
	{
		this.out_time = out_time;
	}

	public Slots getSlot() 
	{
		return slot;
	}

	public void setSlot(Slots slot) 
	{
		this.slot = slot;
	}

	public Packages getPackage_() 
	{
		return package_;
	}

	public void setPackage_(Packages package_) 
	{
		this.package_ = package_;
	}

	public int getId() 
	{
		return id;
	}

	public double getCharge_time() {
		return charge_time;
	}

	public void setCharge_time(double charge_time) {
		this.charge_time = charge_time;
	}
	
	public BookingsP toPOJO()
	{
		BookingsP b = new BookingsP();
		b.setCharge_time(charge_time);
		b.setDate(date);
		b.setEnd_time(end_time);
		b.setId(id);
		b.setIn_time(in_time);
		b.setOut_time(out_time);
		b.setStart_time(start_time);
		b.setType(type);
		b.setVehicle_registration_no(vehicle.getRegistration_no());
		b.setPackage_(package_.toPOJO());
		return b;
	}
}