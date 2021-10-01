package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Bookings;
import hibernate.BookingsP;
import hibernate.Users;
import hibernate.Vehicles;
import hibernate.VehiclesP;
import model.UserId;
import model.VehicleId;
import services.CreateSession;
import services.DBBookings;
import services.DBUser;
import services.DBVehicles;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/getProfile")
	public String getProfile(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id.getId());
		String json_string = new Gson().toJson(user.toPOJO());
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getProfile/{u_id}")
	public String getProfile(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id);
		String json_string = new Gson().toJson(user.toPOJO());
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getVehicles")
	public String getVehicles(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBVehicles dbv = new DBVehicles();
		List<Vehicles> vehicles = dbv.readVehicleByUserId(cs.getSession(), u_id.getId());
		List<VehiclesP> vehiclesp = new ArrayList();
		for(Vehicles vehicle:vehicles)
		{
			vehiclesp.add(vehicle.toPOJO());
		}
		String json_string = new Gson().toJson(vehiclesp);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getVehicles/{u_id}")
	public String getVehicles(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		DBVehicles dbv = new DBVehicles();
		List<Vehicles> vehicles = dbv.readVehicleByUserId(cs.getSession(), u_id);
		List<VehiclesP> vehiclesp = new ArrayList();
		for(Vehicles vehicle:vehicles)
		{
			vehiclesp.add(vehicle.toPOJO());
		}
		String json_string = new Gson().toJson(vehiclesp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getAllBookings")
	public String getAllBookings(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id.getId());
		List<BookingsP> bookingsp = new ArrayList();
		for(Bookings booking:bookings)
		{
			bookingsp.add(booking.toPOJO());
		}
		String json_string = new Gson().toJson(bookingsp);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getAllBookings/{v_id}")
	public String getAllBookings(@PathVariable int v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id);
		List<BookingsP> bookingsp = new ArrayList();
		for(Bookings booking:bookings)
		{
			bookingsp.add(booking.toPOJO());
		}
		String json_string = new Gson().toJson(bookingsp);
		cs.closeSession();
		return json_string;
	}

	
	@PostMapping("/getHistory")
	public String getHistory(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id.getId());
		List<BookingsP> history = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("past"))
			{
				history.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(history);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getHistory/{v_id}")
	public String getHistory(@PathVariable int v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id);
		List<BookingsP> history = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("past"))
			{
				history.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(history);
		cs.closeSession();
		return json_string;
	}

	
	@PostMapping("/getBookings")
	public String getBookings(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id.getId());
		List<BookingsP> bookings1 = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("upcoming"))
			{
				bookings1.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(bookings1);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getBookings/{v_id}")
	public String getBookings(@PathVariable int v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id);
		List<BookingsP> bookings1 = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("upcoming"))
			{
				bookings1.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(bookings1);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/deleteVehicle")
	public boolean deleteVehicle(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBVehicles dbv = new DBVehicles();
//		boolean ret = dbv.
		cs.closeSession();
		return false;
	}
}
