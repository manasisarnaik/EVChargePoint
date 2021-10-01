package model;

import hibernate.Name;
import hibernate.Users;

public class UserRegistrationDetails 
{
	private String firstname;
	
	private String middlename;
	
	private String lastname;
	
	private String email;
	
	private String mobile;
	
	private String password;

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public String getMiddlename() 
	{
		return middlename;
	}

	public void setMiddlename(String middlename) 
	{
		this.middlename = middlename;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getMobile() 
	{
		return mobile;
	}

	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public Users toUser()
	{
		Name name = new Name();
		name.setFirst_name(firstname);
		name.setLast_name(lastname);
		Users user = new Users();
		user.setEmail_id(email);
		user.setMobile_no(Long.parseLong(mobile));
		user.setName(name);
		user.setPassword(password);
		return user;
	}
}
