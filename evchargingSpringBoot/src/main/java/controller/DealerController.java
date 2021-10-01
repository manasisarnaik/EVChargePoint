package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Bookings;
import hibernate.BookingsP;
import hibernate.Brands;
import hibernate.Dealers;
import hibernate.Slots;
import model.AddBrand;
import model.DealerId;
import model.DealerLogin;
import services.CreateSession;
import services.DBBrands;
import services.DBDealer;

@CrossOrigin
@RestController
@RequestMapping("/dealercont")
public class DealerController 
{
	@PostMapping("/verifyDealer")
	public boolean verifyDealer(@RequestBody DealerId d)
	{
		CreateSession cs = new CreateSession();
		DBDealer du = new DBDealer();
		Dealers dealer = du.readDealerById(cs.getSession(), d.getId());
		dealer.setStart_date(new Date(Calendar.getInstance().getTimeInMillis()));
		boolean ret = du.updateDealers(cs.getSession(), dealer);
		cs.closeSession();
		return ret;
	}
	
	@PostMapping("/signInDealer")
	public int signInDealer(@RequestBody DealerLogin d)
	{
		
		CreateSession cs = new CreateSession();
		DBDealer du = new DBDealer();
		List<Dealers> list = du.readAllDealers(cs.getSession());
		Dealers dealer = null;
		for(Dealers dd : list)
		{
			String temp = dd.getName()+"@gmail.com";
			if(temp.equals(d.getEmail()))
			{
				dealer = dd;
			}
		}
		cs.closeSession();
		if(dealer==null)
		{
			return 0;
		}
		return dealer.getId();
	}
	
	@PostMapping("/deleteDealer")
	public boolean deleteDealer(@RequestBody DealerId d_id)
	{
		CreateSession cs = new CreateSession();
		DBDealer du = new DBDealer();
		Dealers dealer = du.readDealerById(cs.getSession(), d_id.getId());
		dealer.setStart_date(new Date(Calendar.getInstance().getTimeInMillis()));
//		boolean ret = du.
		cs.closeSession();
		return false;
	}
	
	@PostMapping("/updateDealerBrand")
	public boolean deleteDealer(@RequestBody AddBrand bd)
	{
		CreateSession cs = new CreateSession();
		DBDealer du = new DBDealer();
		DBBrands bu = new DBBrands();
		Dealers dealer = du.readDealerById(cs.getSession(), bd.getD_id());
		Brands brand = bu.readBrandsById(cs.getSession(), bd.getB_id());
		dealer.addBrands(brand); 
		boolean ret = du.updateDealers(cs.getSession(), dealer);
//		boolean ret = du.
		cs.closeSession();
		return ret;
	}
	
	@PostMapping("/getDealer")
	public String getDealer(@RequestBody DealerId d_id)
	{
		CreateSession cs = new CreateSession();
		DBDealer du = new DBDealer();
		DBBrands bu = new DBBrands();
		Dealers dealer = du.readDealerById(cs.getSession(), d_id.getId());
//		boolean ret = du.
		String json_string = new Gson().toJson(dealer.toPOJO());
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getDealerBookings")
	public String getDealerBookings(@RequestBody DealerId d_id)
	{
		CreateSession cs = new CreateSession();
		DBDealer du = new DBDealer();
		Dealers dealer = du.readDealerById(cs.getSession(), d_id.getId());
		List<BookingsP> bookings = new ArrayList();
		for(Slots s: dealer.getSlots())
		{
			for(Bookings b: s.getBookings())
			{
				bookings.add(b.toPOJO());
			}
		}
		String json_string = new Gson().toJson(bookings);
		cs.closeSession();
		return json_string;
	}
	
}
