package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Users;
import model.LoginCredentials;
import services.CreateSession;
import services.DBUser;
 
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController 
{
	@GetMapping("/v")
	public String funct()
	{
		return "hello world";
	}
	
	@PostMapping("/verify")
	public String getUserId(@RequestBody LoginCredentials cred)
	{
		System.out.println(cred);
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user_res = ru.readUser(cs.getSession(), cred.getEmail());
		if(user_res!=null)
			if(user_res.getPassword().equals(cred.getPassword()))
				return new Gson().toJson(user_res.toPOJO());
			else
				return "0";
		else
			return "-1";
	}
}