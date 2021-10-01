package controller;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hibernate.Dealers;
import hibernate.Users;
import model.DealerRegistrationDetails;
import model.UserRegistrationDetails;
import services.CreateSession;
import services.DBDealer;
import services.DBUser;

@CrossOrigin
@RestController
@RequestMapping("/registration")
public class RegistrationController 
{
	@PostMapping("/userregistration")
	public boolean registerUser(@RequestBody UserRegistrationDetails det)
	{
		DBUser cu = new DBUser();
		CreateSession cs = new CreateSession();
		boolean res = cu.createUser(cs.getSession(), det.toUser());
		return res;
	}
	
	@PostMapping("/dealerregistration")
	public boolean registerDealer(@RequestBody DealerRegistrationDetails det)
	{
		System.out.println(det);
		Dealers d = det.toDealers();
		d.setRegister_date(new Date(Calendar.getInstance().getTimeInMillis()));
		DBDealer du = new DBDealer();
		CreateSession cs = new CreateSession();
		boolean res = du.createDealer(cs.getSession(), d, null);
		cs.closeSession();
		return res;
	}
}
