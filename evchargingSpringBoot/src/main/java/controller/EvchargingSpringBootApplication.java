package controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernate.*;
import services.*;

@SpringBootApplication
public class EvchargingSpringBootApplication 
{
	public static void main(String[] args) 
	{
		CreateSession cs = new CreateSession();
		cs.getSession();
		cs.closeSession();
		
//		brandEntry();
//		dealerEntry();
//		userEntry();
//		vehicleEntry();
//		slotEntry();
//		packageEntry();		
//		bookingEntry();
		
		SpringApplication.run(EvchargingSpringBootApplication.class, args);
	}
	
	private static void brandEntry() 
	{
		CreateSession cs = new CreateSession();
		DBBrands dbr = new DBBrands();
		
		Brands b1 = new Brands();
		b1.setName("Tata");
		dbr.createBrands(cs.getSession(), b1);
		
		Brands b2 = new Brands();
		b2.setName("Tesla");
		dbr.createBrands(cs.getSession(), b2);
		
		Brands b3 = new Brands();
		b3.setName("Kia");
		dbr.createBrands(cs.getSession(), b3);
		
		Brands b4 = new Brands();
		b4.setName("MG");
		dbr.createBrands(cs.getSession(), b4);
		
		Brands b5 = new Brands();
		b5.setName("Hyundai");
		dbr.createBrands(cs.getSession(), b5);
		
		Brands b6 = new Brands();
		b6.setName("Bajaj");
		dbr.createBrands(cs.getSession(), b6);
		
		Brands b7 = new Brands();
		b7.setName("Hero");
		dbr.createBrands(cs.getSession(), b7);
		
		Brands b8 = new Brands();
		b8.setName("Mahindra");
		dbr.createBrands(cs.getSession(), b8);
		
		Brands b9 = new Brands();
		b9.setName("Suzuki");
		dbr.createBrands(cs.getSession(), b9);
		
		Brands b10 = new Brands();
		b10.setName("Jaguar");
		dbr.createBrands(cs.getSession(), b10);
		
		Brands b11 = new Brands();
		b11.setName("Audi");
		dbr.createBrands(cs.getSession(), b11);
		
		Brands b12 = new Brands();
		b12.setName("Mercedes Benz");
		dbr.createBrands(cs.getSession(), b12);
		
		Brands b13 = new Brands();
		b13.setName("Ford");
		dbr.createBrands(cs.getSession(), b13);
		
		Brands b14 = new Brands();
		b14.setName("Honda");
		dbr.createBrands(cs.getSession(), b14);
		
		Brands b15 = new Brands();
		b15.setName("Tata Power");
		dbr.createBrands(cs.getSession(), b15);
		
		Brands b16= new Brands();
		b16.setName("Revolt");
		dbr.createBrands(cs.getSession(), b16);
		
		Brands b17 = new Brands();
		b17.setName("Ather");
		dbr.createBrands(cs.getSession(), b17);
		
		Brands b18 = new Brands();
		b18.setName("TVS Iqube");
		dbr.createBrands(cs.getSession(), b18);
		
		Brands b19 = new Brands();
		b19.setName("Yo bikes");
		dbr.createBrands(cs.getSession(), b19);
		
		Brands b20 = new Brands();
		b20.setName("Volvo");
		dbr.createBrands(cs.getSession(), b20);
		
		Brands b21 = new Brands();
		b21.setName("BYD Olectra");
		dbr.createBrands(cs.getSession(), b21);
		
		Brands b22 = new Brands();
		b22.setName("Renolt");
		dbr.createBrands(cs.getSession(), b22);
		
		
		cs.closeSession();
		
		
	}
	
	private static void dealerEntry() 
	{
		CreateSession cs = new CreateSession();
		DBBrands dbr = new DBBrands();
		DBDealer dbd = new DBDealer();
		
		Brands b1 = dbr.readBrandsById(cs.getSession(), 1);
		Brands b2 = dbr.readBrandsById(cs.getSession(), 2);
		Brands b3 = dbr.readBrandsById(cs.getSession(), 3);
		Brands b4 = dbr.readBrandsById(cs.getSession(), 4);
		Brands b5 = dbr.readBrandsById(cs.getSession(), 5);
		Brands b6 = dbr.readBrandsById(cs.getSession(), 6);
		Brands b7 = dbr.readBrandsById(cs.getSession(), 7);
		Brands b8 = dbr.readBrandsById(cs.getSession(), 8);
		Brands b9 = dbr.readBrandsById(cs.getSession(), 9);
		Brands b10 = dbr.readBrandsById(cs.getSession(), 10);
		Brands b11 = dbr.readBrandsById(cs.getSession(), 11);
		Brands b12 = dbr.readBrandsById(cs.getSession(), 12);
		Brands b13 = dbr.readBrandsById(cs.getSession(), 13);
		Brands b14 = dbr.readBrandsById(cs.getSession(), 14);
		Brands b15= dbr.readBrandsById(cs.getSession(), 15);
		Brands b16= dbr.readBrandsById(cs.getSession(), 16);
		Brands b17= dbr.readBrandsById(cs.getSession(), 17);
		Brands b18 = dbr.readBrandsById(cs.getSession(), 18);
		Brands b19 = dbr.readBrandsById(cs.getSession(), 19);
		Brands b20 = dbr.readBrandsById(cs.getSession(), 20);
				
		List<Brands> brands = new ArrayList();
		brands.add(b1);
		brands.add(b3);
		brands.add(b5);
		brands.add(b7);
		brands.add(b9);
		
		Dealers d1 = new Dealers();
		d1.setName("Kia");
		d1.setBrands(brands);
		Address ad = new Address();
		ad.setAddress1("Near solatier building ,Baner");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Solatier");
		ad.setState("Maharshtra");
		ad.setPincode(411045);
		ad.setStreet("balewadi road");
		d1.setAddress(ad);
		d1.setMobile_no(122345679);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);
		
		brands = new ArrayList();
		brands.add(b1);
		brands.add(b3);
		brands.add(b5);
		brands.add(b7);
		brands.add(b9);
		
		d1 = new Dealers();
		d1.setName("Hyundai");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Kia showroom,baner");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Solatier");
		ad.setState("Maharshtra");
		ad.setPincode(411045);
		ad.setStreet("balewadi road");
		d1.setAddress(ad);
		d1.setMobile_no(122345779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);
		
		brands = new ArrayList();
		brands.add(b1);
		brands.add(b3);
		brands.add(b5);
		brands.add(b7);
		brands.add(b9);
		
		d1 = new Dealers();
		d1.setName("Tata");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Shivaji Nagar,ShivajiNagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Bus stand");
		ad.setState("Maharshtra");
		ad.setPincode(411014);
		ad.setStreet("Shivajinagar");
		d1.setAddress(ad);
		d1.setMobile_no(122355779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);		
		
		brands = new ArrayList();
		brands.add(b2);
		brands.add(b3);
		brands.add(b6);
		brands.add(b8);
		brands.add(b9);
		
		d1 = new Dealers();
		d1.setName("Tesla");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Hp Showroom ,Hinjewadi");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Shivaji Statue");
		ad.setState("Maharshtra");
		ad.setPincode(411033);
		ad.setStreet("Hinjewadi");
		d1.setAddress(ad);
		d1.setMobile_no(822355779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);		
		
		brands = new ArrayList();
		brands.add(b1);
		brands.add(b2);
		brands.add(b4);
		brands.add(b5);
		brands.add(b20);
		
		d1 = new Dealers();
		d1.setName("MG");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near  Hitech City ,Hinjewadi");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Hitech City");
		ad.setState("Maharshtra");
		ad.setPincode(411033);
		ad.setStreet("Hinjewadi");
		d1.setAddress(ad);
		d1.setMobile_no(892355779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);		
		
		brands = new ArrayList();
		brands.add(b5);
		brands.add(b2);
		brands.add(b15);
		brands.add(b12);
		brands.add(b19);
		
		d1 = new Dealers();
		d1.setName("BAJAJ");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Karve Bridge ,Karve Nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Hitech Bridge");
		ad.setState("Maharshtra");
		ad.setPincode(411052);
		ad.setStreet("Karve Nagar");
		d1.setAddress(ad);
		d1.setMobile_no(890355779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);		
		
		brands = new ArrayList();
		brands.add(b11);
		brands.add(b12);
		brands.add(b15);
		brands.add(b17);
		brands.add(b20);
		
		d1 = new Dealers();
		d1.setName("Hero");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Cummins College ,Karve Nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Cummins College");
		ad.setState("Maharshtra");
		ad.setPincode(411052);
		ad.setStreet("Karve Nagar");
		d1.setAddress(ad);
		d1.setMobile_no(895755779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);		
		
		brands = new ArrayList();
		brands.add(b1);
		brands.add(b14);
		brands.add(b18);
		brands.add(b19);
		brands.add(b20);
		
		d1 = new Dealers();
		d1.setName("Audi");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near ACTS ,Pashan");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("ACTS institute");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("Pashan");
		d1.setAddress(ad);
		d1.setMobile_no(894955779);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		
		brands = new ArrayList();
		brands.add(b3);
		brands.add(b8);
		brands.add(b12);
		brands.add(b14);
		brands.add(b20);
		
		d1 = new Dealers();
		d1.setName("Ford");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Jagdamb ,Baner");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Jagdamb Hotel");
		ad.setState("Maharshtra");
		ad.setPincode(411045);
		ad.setStreet("Baner");
		d1.setAddress(ad);
		d1.setMobile_no(894955469L);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		
		brands = new ArrayList();
		brands.add(b2);
		brands.add(b4);
		brands.add(b5);
		brands.add(b7);
		brands.add(b17);
		
		d1 = new Dealers();
		d1.setName("Honda");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Phoneix Market City ,Viman Nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Phoneix Market City");
		ad.setState("Maharshtra");
		ad.setPincode(411014);
		ad.setStreet("Viman Nagar");
		d1.setAddress(ad);
		d1.setMobile_no(894955469L);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		
		brands = new ArrayList();
		brands.add(b4);
		brands.add(b8);
		brands.add(b11);
		brands.add(b16);
		brands.add(b18);
		
		d1 = new Dealers();
		d1.setName("Revolt");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Sherton 4.0 ,Viman Nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Sherton hotel");
		ad.setState("Maharshtra");
		ad.setPincode(411014);
		ad.setStreet("Viman Nagar");
		d1.setAddress(ad);
		d1.setMobile_no(894955469L);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		
		brands = new ArrayList();
		brands.add(b4);
		brands.add(b8);
		brands.add(b11);
		brands.add(b16);
		brands.add(b18);
		
		d1 = new Dealers();
		d1.setName("Revolt");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near  ,Viman Nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Sherton hotel");
		ad.setState("Maharshtra");
		ad.setPincode(411014);
		ad.setStreet("Viman Nagar");
		d1.setAddress(ad);
		d1.setMobile_no(894955469L);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		
		brands = new ArrayList();
		brands.add(b4);
		brands.add(b9);
		brands.add(b13);
		brands.add(b17);
		brands.add(b20);
		
		d1 = new Dealers();
		d1.setName("Yo Bikes");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near Central mall,Shivaji Nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Central mall");
		ad.setState("Maharshtra");
		ad.setPincode(411003);
		ad.setStreet("Shivaji Nagar");
		d1.setAddress(ad);
		d1.setMobile_no(894912466L);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		

		brands = new ArrayList();
		brands.add(b4);
		brands.add(b8);
		brands.add(b11);
		brands.add(b16);
		brands.add(b18);
		
		d1 = new Dealers();
		d1.setName("Volvo");
		d1.setBrands(brands);
		ad = new Address();
		ad.setAddress1("Near PCMC,Pimpri-Chinchwad");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("PCMC");
		ad.setState("Maharshtra");
		ad.setPincode(410506);
		ad.setStreet("Pimpri-Chinchwad");
		d1.setAddress(ad);
		d1.setMobile_no(894912466L);
		d1.setRegister_date(new Date(119,8,1));
		d1.setStart_date(new Date(119,8,2));
		dbd.createDealer(cs.getSession(), d1,brands);	
		
		cs.closeSession();
	}

	private static void userEntry()
	{
		CreateSession cs = new CreateSession();
		
		DBUser dbu=new DBUser();
	
		Name n1=new Name();
		n1.setFirst_name("himanshu");
		n1.setLast_name("deshpande");
		Users u1=new Users();
		u1.setMobile_no(8855929001L);
		u1.setEmail_id("himanshu.deshpande@gmail.com");
		u1.setName(n1);
		u1.setPassword("deshpande");
		Address ad=new Address();
		ad.setAddress1("Near Shivaji Nagar,ShivajiNagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Bus stand");
		ad.setState("Maharshtra");
		ad.setPincode(411045);
		ad.setStreet("Shivajinagar");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Rushikesh");
		n1.setLast_name("Vaijapurkar");
		u1=new Users();
		u1.setMobile_no(9975252214L);
		u1.setEmail_id("rushi@gmail.com");
		u1.setName(n1);
		u1.setPassword("vaijapurkar");
		ad=new Address();
		ad.setAddress1("VishalNagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Copacabana Hotel");
		ad.setState("Maharshtra");
		ad.setPincode(411027);
		ad.setStreet("Apple hospital");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Manasi");
		n1.setLast_name("Sarnaik");
		u1=new Users();
		u1.setMobile_no(9975252211L);
		u1.setEmail_id("manasi@gmail.com");
		u1.setName(n1);
		u1.setPassword("Sarnaik");
		ad=new Address();
		ad.setAddress1("Washim");
		ad.setCity("Washim");
		ad.setCountry("India");
		ad.setLandmark("Near KarvePutala");
		ad.setState("Maharshtra");
		ad.setPincode(411027);
		ad.setStreet("Karve Road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Shantanu");
		n1.setLast_name("Dedhe");
		u1=new Users();
		u1.setMobile_no(9975252212L);
		u1.setEmail_id("shantanu@gmail.com");
		u1.setName(n1);
		u1.setPassword("dedhe");
		ad=new Address();
		ad.setAddress1("Baner,flat no1 Aracus");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Jagdamba");
		ad.setState("Maharshtra");
		ad.setPincode(411045);
		ad.setStreet("Baner Road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Vaihsnavi");
		n1.setLast_name("Raut");
		u1=new Users();
		u1.setMobile_no(9975252213L);
		u1.setEmail_id("vaishnavi@gmail.com");
		u1.setName(n1);
		u1.setPassword("raut");
		ad=new Address();
		ad.setAddress1("Sutar roar");
		ad.setCity("Nagpur");
		ad.setCountry("India");
		ad.setLandmark("Khambir chowk");
		ad.setState("Maharshtra");
		ad.setPincode(411027);
		ad.setStreet("Gagdge maharaj road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Amit");
		n1.setLast_name("Khandage");
		u1=new Users();
		u1.setMobile_no(9975252215L);
		u1.setEmail_id("amit@gmail.com");
		u1.setName(n1);
		u1.setPassword("khendage");
		ad=new Address();
		ad.setAddress1("Pashan");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Lakshmi Sweets");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("DRDO road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Sahil");
		n1.setLast_name("Kshirsagar");
		u1=new Users();
		u1.setMobile_no(9975252216L);
		u1.setEmail_id("sahil@gmail.com");
		u1.setName(n1);
		u1.setPassword("kshirsagar");
		ad=new Address();
		ad.setAddress1("Yewale apartment,flatno 3,Armament circle,Pashan,");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Armament circle");
		ad.setState("Maharshtra");
		ad.setPincode(411027);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Sharaddha");
		n1.setLast_name("Sabane");
		u1=new Users();
		u1.setMobile_no(9975252217L);
		u1.setEmail_id("shraddha@gmail.com");
		u1.setName(n1);
		u1.setPassword("sabane");
		ad=new Address();
		ad.setAddress1("Yewale1 apartment,flatno 3,Jai Bhavani Nagar,Pashan,");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Armament circle");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		cs.closeSession();
		
		n1=new Name();
		n1.setFirst_name("Reena");
		n1.setLast_name("Borchate");
		u1=new Users();
		u1.setMobile_no(9975252218L);
		u1.setEmail_id("reena@gmail.com");
		u1.setName(n1);
		u1.setPassword("borchate");
		ad=new Address();
		ad.setAddress1("Yewale apartment3,flatno 3,Armament circle,Pashan,");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Armament circle");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Aditya");
		n1.setLast_name("Kulkarni");
		u1=new Users();
		u1.setMobile_no(9975252219L);
		u1.setEmail_id("aditya@gmail.com");
		u1.setName(n1);
		u1.setPassword("kulkarni");
		ad=new Address();
		ad.setAddress1("Yewale apartment4,flatno 3,Armament circle,Pashan,");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Armament circle");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Vaishnavi");
		n1.setLast_name("Thorat");
		u1=new Users();
		u1.setMobile_no(9975252221L);
		u1.setEmail_id("vaishnavi1@gmail.com");
		u1.setName(n1);
		u1.setPassword("thorat");
		ad=new Address();
		ad.setAddress1("Yewale apartment5,flatno 3,Armament circle,Pashan,");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Armament circle");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Sayali");
		n1.setLast_name("Chavhan");
		u1=new Users();
		u1.setMobile_no(9975252222L);
		u1.setEmail_id("sayali@gmail.com");
		u1.setName(n1);
		u1.setPassword("chavhan");
		ad=new Address();
		ad.setAddress1("Yewale apartment3,flatno 3,Mansarovar ,Pashan,");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Armament circle");
		ad.setState("Maharshtra");
		ad.setPincode(411021);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Radhika");
		n1.setLast_name("Vaijapurkar");
		u1=new Users();
		u1.setMobile_no(9975252223L);
		u1.setEmail_id("radhika@gmail.com");
		u1.setName(n1);
		u1.setPassword("vaijapurkar");
		ad=new Address();
		ad.setAddress1("Rohit park,flatno 3,Nr Sharaddha terace,vishal nagar");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("copacabana hotel");
		ad.setState("Maharshtra");
		ad.setPincode(411027);
		ad.setStreet("Neclace garden road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Rutuja");
		n1.setLast_name("Vaijapurkar");
		u1=new Users();
		u1.setMobile_no(9975252224L);
		u1.setEmail_id("rutuja@gmail.com");
		u1.setName(n1);
		u1.setPassword("vaijapurkar");
		ad=new Address();
		ad.setAddress1("Rahul Arcus, c1501, Baner Road, Baner");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Bitwise");
		ad.setState("Maharshtra");
		ad.setPincode(411045);
		ad.setStreet("Baner Road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Akshay");
		n1.setLast_name("Bhute");
		u1=new Users();
		u1.setMobile_no(9975253224L);
		u1.setEmail_id("akshay@gmail.com");
		u1.setName(n1);
		u1.setPassword("bhute");
		ad=new Address();
		ad.setAddress1("Sant Tukaram Nagar, Pimpri");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Hockers Ground");
		ad.setState("Maharshtra");
		ad.setPincode(410506);
		ad.setStreet("JM Road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Tushar");
		n1.setLast_name("Khedekar");
		u1=new Users();
		u1.setMobile_no(9955252224L);
		u1.setEmail_id("tushar@gmail.com");
		u1.setName(n1);
		u1.setPassword("khedekar");
		ad=new Address();
		ad.setAddress1("Sant Tukaram Nagar, Pimpri");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Bitwise");
		ad.setState("Maharshtra");
		ad.setPincode(410506);
		ad.setStreet("Sant gadgebaba road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Sanjay");
		n1.setLast_name("Vaijapurkar");
		u1=new Users();
		u1.setMobile_no(9955224224L);
		u1.setEmail_id("sanjay@gmail.com");
		u1.setName(n1);
		u1.setPassword("vaijapurkar");
		ad=new Address();
		ad.setAddress1("Hinjewadi");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Bata Shoe palace");
		ad.setState("Maharshtra");
		ad.setPincode(411033);
		ad.setStreet("Sant tukaram road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		n1=new Name();
		n1.setFirst_name("Rimpi");
		n1.setLast_name("Borchate");
		u1=new Users();
		u1.setMobile_no(9125252224L);
		u1.setEmail_id("rimpi@gmail.com");
		u1.setName(n1);
		u1.setPassword("borchate");
		ad=new Address();
		ad.setAddress1("Sant ramdas Nagar, Pimpri");
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setLandmark("Deep Shop");
		ad.setState("Maharshtra");
		ad.setPincode(410506);
		ad.setStreet("Sant gadgebaba road");
		u1.setAddress(ad);
		dbu.createUser(cs.getSession(), u1);
		
		cs.closeSession();
	}
	
	private static void vehicleEntry()
	{
		CreateSession cs = new CreateSession();
		DBUser u = new DBUser();
		List<Users> users = u.getAllUsers(cs.getSession());
		DBVehicles dbv = new DBVehicles();
		
		
		
		int i=1000;
		
		for(Users user:users)
		{
			for(int j=0;j<20;j++)
			{
				Vehicles v = new Vehicles();
				v.setRegistration_no("MH 12 AA "+ i++);
				if(j%3==0)
				{
					v.setType("four wheeler");
				}
				else if(j%3==1)
				{
					v.setType("E-rickshaw");
				}
				else
				{
					v.setType("two wheeler");
				}
				v.setUser(user);
				dbv.createVehicle(cs.getSession(), v, user);
			}
		}
		cs.closeSession();
	}
	
	private static void slotEntry()
	{

		CreateSession cs = new CreateSession();
		DBSlots dbs=new DBSlots();
		DBDealer dbd=new DBDealer();

		List<Dealers> dealers=dbd.readAllDealers(cs.getSession());

		for(Dealers dealer:dealers)
		{
			Slots s1=new Slots();
			s1.setDealers(dealer);
			s1.setNo_of_slots(10);
			s1.setType("four wheeler");

			dbs.createSlots(cs.getSession(), s1, dealer);

			s1=new Slots();
			s1.setDealers(dealer);
			s1.setNo_of_slots(20);
			s1.setType("two wheeler");

			dbs.createSlots(cs.getSession(), s1, dealer);
			
			s1=new Slots();
			s1.setDealers(dealer);
			s1.setNo_of_slots(10);
			s1.setType("E-rickshaw");

			dbs.createSlots(cs.getSession(), s1, dealer);

		}	
		cs.closeSession();
	}
	
	private static void packageEntry()
	{

		CreateSession cs = new CreateSession();
		DBSlots dbs=new DBSlots();
		DBPackages dbd=new DBPackages();

		List<Slots> slots=dbs.readAllSlots(cs.getSession());

		for(Slots slot:slots)
		{
			Packages p1=new Packages();
			p1.setCharge_unit_count(1);
			p1.setCharge_unit_unit("KW");
			p1.setTime_unit_time(1);
			p1.setTime_unit_unit("hr.");
			p1.setPrice(20);
			p1.setPrice_unit("Rs.");
			dbd.createPackage(cs.getSession(), p1, slot);
			
			p1=new Packages();
			p1.setCharge_unit_count(2);
			p1.setCharge_unit_unit("KW");
			p1.setTime_unit_time(2);
			p1.setTime_unit_unit("hr.");
			p1.setPrice(40);
			p1.setPrice_unit("Rs.");
			dbd.createPackage(cs.getSession(), p1, slot);
			
			p1=new Packages();
			p1.setCharge_unit_count(3);
			p1.setCharge_unit_unit("KW");
			p1.setTime_unit_time(3);
			p1.setTime_unit_unit("hr.");
			p1.setPrice(60);
			p1.setPrice_unit("Rs.");
			dbd.createPackage(cs.getSession(), p1, slot);
			
			p1=new Packages();
			p1.setCharge_unit_count(1.5);
			p1.setCharge_unit_unit("KW");
			p1.setTime_unit_time(1.5);
			p1.setTime_unit_unit("hr.");
			p1.setPrice(35);
			p1.setPrice_unit("Rs.");
			dbd.createPackage(cs.getSession(), p1, slot);
			
			p1=new Packages();
			p1.setCharge_unit_count(2.5);
			p1.setCharge_unit_unit("KW");
			p1.setTime_unit_time(2.5);
			p1.setTime_unit_unit("hr.");
			p1.setPrice(35);
			p1.setPrice_unit("Rs.");
			dbd.createPackage(cs.getSession(), p1, slot);
		}	
		cs.closeSession(); 
	}
	
	private static void bookingEntry()
	{
		CreateSession cs = new CreateSession();
		DBSlots dbs = new DBSlots();
		List<Slots> slots = dbs.readAllSlots(cs.getSession());
		DBVehicles dbv = new DBVehicles();
		List<Vehicles> vehicles = dbv.readAllVehicles(cs.getSession());
		
		DBBookings dbb = new DBBookings();
		
		Calendar cal = Calendar.getInstance();
		java.util.Date date = new java.util.Date();
		date.setMonth(0);
		date.setDate(120);
		date.setHours(6);
		date.setMinutes(0);
		date.setSeconds(0);
		System.out.println(date);
		cal.setTime(date);
		System.out.println(cal.getTime());
		cal.setTime(new Date((long) (cal.getTimeInMillis() + (1.5*60*60*1000))));
		System.out.println(cal.getTime());
		
		
		int j=0;
		for(int k=1;k<=250;k++)
		{
			date.setDate(k);
			date.setHours(6);
			date.setMinutes(0);
			date.setSeconds(0);
			cal.setTime(date);
			
			loop:
			for(Slots slot: slots)
			{
				for(Packages package_: slot.getPackages())
				{
					for(int i=0;i<slot.getNo_of_slots();i++)
					{
						
						Bookings booking = new Bookings();
						booking.setDate(new Date(cal.getTimeInMillis()));
						
						booking.setStart_time(new Time(cal.getTimeInMillis()));//booking
						booking.setEnd_time(new Time((long) (cal.getTimeInMillis() + (package_.getTime_unit_time()*60*60*1000))));//booking
						
						booking.setIn_time(new Time(cal.getTimeInMillis()));
						booking.setOut_time(new Time((long) (cal.getTimeInMillis() + (package_.getTime_unit_time()*60*60*1000))));
						
						booking.setPackage_(package_);
						booking.setSlot(slot);
						
						booking.setType("past");
						booking.setUser(vehicles.get(j).getUser());
						booking.setVehicle(vehicles.get(j));
						dbb.createBooking(cs.getSession(), booking, vehicles.get(j).getUser(), vehicles.get(j), package_, slot);
						j++;
						if(j>=vehicles.size())
						{
							j=0;
						}
						
					}
					cal.setTime(new Date((long) (cal.getTimeInMillis() + (package_.getTime_unit_time()*60*60*1000))));
					
					if((new java.util.Date(cal.getTimeInMillis())).getHours() > 22)
					{
						break loop;
					}
					
				}
				
			}
		}
		
		

	}
	
}
