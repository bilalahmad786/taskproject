package com.glaucus.taskproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.taskproject.service.NumberService;



@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/numbercontroller")
public class NumberController {

	@Autowired
	NumberService  numberService;
	
	private int requestCount=0;
	
	@GetMapping("/thread")
	public String threadEntry()  {
		
		try {	
			
			numberService.executeThread();
			System.out.println("Request Count ---  " + requestCount++);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Hii This is Test !!";
	}
	
}
