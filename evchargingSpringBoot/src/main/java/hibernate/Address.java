package hibernate;

import javax.persistence.*;

public class Address 
{
	@Column(nullable=true)
	private String country;
	
	@Column(nullable=true)
	private String state;
	
	@Column(nullable=true)
	private String city;
	
	@Column(nullable=true)
	private int pincode;
	
	@Column(nullable=true)
	private String landmark;
	
	@Column(nullable=true)
	private String street;
	
	@Column(nullable=true)
	private String address1;
	
	@Column(nullable=true)
	private String address2;
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public int getPincode() 
	{
		return pincode;
	}
	
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	
	public String getLandmark() 
	{
		return landmark;
	}
	
	public void setLandmark(String landmark) 
	{
		this.landmark = landmark;
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getAddress1() 
	{
		return address1;
	}
	
	public void setAddress1(String address1)
	{
		this.address1 = address1;
	}
}