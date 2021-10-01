package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Brands;
import hibernate.BrandsP;
import hibernate.Dealers;
import hibernate.DealersP;
import hibernate.Packages;
import hibernate.PackagesP;
import hibernate.Slots;
import hibernate.SlotsP;
import hibernate.UserPincodes;
import hibernate.UserPincodesP;
import hibernate.Vehicles;
import hibernate.VehiclesP;
import services.CreateSession;
import services.DBBrands;
import services.DBDealer;
import services.DBPackages;
import services.DBSlots;
import services.DBUserPincodes;
import services.DBVehicles;

@CrossOrigin
@RestController
@RequestMapping
public class GetData {
	
	@GetMapping("/brands")
	public String getAllCategories1()
	{
		CreateSession cs = new CreateSession();
		DBBrands ru = new DBBrands();
		cs.getSession();
		String json_string = "";
		List<Brands> bnds = ru.readAllBrands(cs.getSession());
		List<BrandsP> bndsp = new ArrayList();
		for(Brands brand:bnds)
		{
			bndsp.add(brand.toPOJO());
		}
//		for(Brands bnd: bnds)
//		{
//			List<Dealers> dels = bnd.getDealers();
//			for(Dealers del: dels)
//			{
//				json_string += del.getName()+" || ";
//			}
//		}
		json_string=new Gson().toJson(bndsp);
		cs.closeSession();
		return json_string;	
	}
	
	@PostMapping("/brands")
	public String getAllCategories11()
	{
		CreateSession cs = new CreateSession();
		DBBrands ru = new DBBrands();
		cs.getSession();
		String json_string = "";
		List<Brands> bnds = ru.readAllBrands(cs.getSession());
		List<BrandsP> bndsp = new ArrayList();
		for(Brands brand:bnds)
		{
			bndsp.add(brand.toPOJO());
		}
//		for(Brands bnd: bnds)
//		{
//			List<Dealers> dels = bnd.getDealers();
//			for(Dealers del: dels)
//			{
//				json_string += del.getName()+" || ";
//			}
//		}
		json_string=new Gson().toJson(bndsp);
		cs.closeSession();
		return json_string;	
	}
	
	@GetMapping("/dealers")
	public String getAllDealers()
	{
		CreateSession cs = new CreateSession();
		DBDealer dbd = new DBDealer();
		cs.getSession();
		String json_string = "";
		List<Dealers> dealers = dbd.readAllDealers(cs.getSession());
		List<DealersP> dealersp = new ArrayList();
		for(Dealers dealer:dealers)
		{
			dealersp.add(dealer.toPOJO());
		}
		json_string = new Gson().toJson(dealersp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/dealers")
	public String getAllDealers1()
	{
		CreateSession cs = new CreateSession();
		DBDealer dbd = new DBDealer();
		cs.getSession();
		String json_string = "";
		List<Dealers> dealers = dbd.readAllDealers(cs.getSession());
		List<DealersP> dealersp = new ArrayList();
		for(Dealers dealer:dealers)
		{
			dealersp.add(dealer.toPOJO());
		}
		json_string = new Gson().toJson(dealersp);
		cs.closeSession();
		return json_string;
	}
	

	
	@GetMapping("/slots")
	public String getAllSlots()
	{
		CreateSession cs = new CreateSession();
		DBSlots dbs = new DBSlots();
		cs.getSession();
		String json_string = "";
		List<Slots> slots = dbs.readAllSlots(cs.getSession());
		List<SlotsP> slotsp = new ArrayList();
		for(Slots slot:slots)
		{
			slotsp.add(slot.toPOJO());
		}
		json_string = new Gson().toJson(slotsp);
		cs.closeSession();
		return json_string;
	}
	
}
