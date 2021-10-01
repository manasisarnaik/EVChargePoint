package hibernate;

import javax.persistence.*;

@Entity(name="packages")
@Table(name="packages")
public class Packages 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//100 rs / 1 kW or 1 hr
	@Column(nullable=false)
	private double price;//10

	@Column(nullable=false)
	private String price_unit;//RS

	@Column(nullable=false)
	private double charge_unit_count;//1

	@Column(nullable=false)
	private String charge_unit_unit;//kW

	@Column(nullable=false)
	private double time_unit_time;//1

	@Column(nullable=false)
	private String time_unit_unit;//HR
	
	@ManyToOne
	private Slots slot;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPrice_unit() {
		return price_unit;
	}

	public void setPrice_unit(String price_unit) {
		this.price_unit = price_unit;
	}

	public double getCharge_unit_count() {
		return charge_unit_count;
	}

	public void setCharge_unit_count(double charge_unit_count) {
		this.charge_unit_count = charge_unit_count;
	}

	public String getCharge_unit_unit() {
		return charge_unit_unit;
	}

	public void setCharge_unit_unit(String charge_unit_unit) {
		this.charge_unit_unit = charge_unit_unit;
	}

	public double getTime_unit_time() {
		return time_unit_time;
	}

	public void setTime_unit_time(double time_unit_time) {
		this.time_unit_time = time_unit_time;
	}

	public String getTime_unit_unit() {
		return time_unit_unit;
	}

	public void setTime_unit_unit(String time_unit_unit) {
		this.time_unit_unit = time_unit_unit;
	}

	public Slots getSlot() {
		return slot;
	}

	public void setSlot(Slots slot) {
		this.slot = slot;
	}

	public int getId() {
		return id;
	}
	
	public PackagesP toPOJO()
	{
		PackagesP p = new PackagesP();
		p.setCharge_unit_count(charge_unit_count);
		p.setCharge_unit_unit(charge_unit_unit);
		p.setId(id);
		p.setPrice(price);
		p.setPrice_unit(price_unit);
		p.setTime_unit_time(time_unit_time);
		p.setTime_unit_unit(time_unit_unit);
		return p;
	}
}
