package hibernate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="dealers")
@Table(name="dealers")
public class Dealers 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Embedded
	private Address address;
	
	private long mobile_no;
	
	@Column(nullable=false)
	private Date register_date;
	
	private Date start_date;
	
	@ManyToMany
	private List<Brands> brands; 
	
	@OneToMany(mappedBy="dealers")
	private List<Slots> slots;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Date getRegister_date() {
		return register_date;
	}
	
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public List<Brands> getBrands() {
		return brands;
	}
	
	public void setBrands(List<Brands> brands) {
		this.brands = brands;
	}
	public void addBrands(Brands brand) {
		if(this.brands==null)
		{
			this.brands= new ArrayList();
		}
		this.brands.add(brand);
	}
	public List<Slots> getSlots() {
		return slots;
	}

	public int getId() {
		return id;
	}

	public DealersP toPOJO()
	{
		DealersP d = new DealersP();
		d.setAddress(address);
		d.setId(id);
		d.setMobile_no(mobile_no);
		d.setName(name);
		d.setRegister_date(register_date);
		List<SlotsP> sp = new ArrayList();
		for(Slots slot: slots)
		{
			sp.add(slot.toPOJO());
		}
		d.setSlots(sp);
		d.setStart_date(start_date);
		return d;
	}
	
}