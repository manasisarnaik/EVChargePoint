package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;

public class BookingsP 
{
	private int id;
	
	private String vehicle_registration_no;
	
	private String type;
	
	private Date date;
	
	private Time start_time;
	
	private Time end_time;
	
	private Time in_time;
	
	private Time out_time;
	
	private double charge_time;
	
	private PackagesP package_;

	
	
	public PackagesP getPackage_() {
		return package_;
	}

	public void setPackage_(PackagesP package_) {
		this.package_ = package_;
	}

	public String getVehicle_registration_no() {
		return vehicle_registration_no;
	}

	public void setVehicle_registration_no(String vehicle_registration_no) {
		this.vehicle_registration_no = vehicle_registration_no;
	}

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public Time getIn_time() {
		return in_time;
	}

	public void setIn_time(Time in_time) {
		this.in_time = in_time;
	}

	public Time getOut_time() {
		return out_time;
	}

	public void setOut_time(Time out_time) {
		this.out_time = out_time;
	}

	public double getCharge_time() {
		return charge_time;
	}

	public void setCharge_time(double charge_time) {
		this.charge_time = charge_time;
	}
	
	
}
