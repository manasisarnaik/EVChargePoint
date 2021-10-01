package hibernate;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class DealersP 
{
private int id;
	
	private String name;
	
	private Address address;
	
	private long mobile_no;
	
	private Date register_date;
	
	private Date start_date;
	
	private List<SlotsP> slots;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<SlotsP> getSlots() {
		return slots;
	}

	public void setSlots(List<SlotsP> slots) {
		this.slots = slots;
	}
	
	
}
