package hibernate;

import javax.persistence.Column;

public class PackagesP 
{
	private int id;
	//100 rs / 1 kW or 1 hr
	private double price;//10

	private String price_unit;//RS

	private double charge_unit_count;//1

	private String charge_unit_unit;//kW

	private double time_unit_time;//1

	private String time_unit_unit;//HR

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	
}
