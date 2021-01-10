package com.glaucus.taskproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.taskproject.service.NumberService;

/**
 * 
 * @author Bilal_Ahmad
 *
 */

@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/numbercontroller")
public class NumberController {

	@Autowired
	NumberService  numberService;
	
	@GetMapping("/thread")
	public void threadEntry()  {
		
		try {				
			numberService.executeThread();		
		} catch (Exception e) {
			System.out.println("Request failed ... !!");
		}
	}
	
}
