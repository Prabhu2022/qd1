package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CallControll {

	@RequestMapping("/index")
	public static String index()
	{
		return "index.html";
	}
	
	
	@RequestMapping("/onlinecall")
	public static ExotelResponse onlinecall()
	{
		ExotelCall calls = new ExotelCall();
		
		ExotelResponse res = calls.connectCustomerToFlow();
		
		return res;
	} 
	
}
