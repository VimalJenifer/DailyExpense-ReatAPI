package com.dailyExpense.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dailyExpense.model.DailyExpense;
import com.dailyExpense.model.User;

@RestController
@RequestMapping(value= {"/DailyExpense"})
public class DailyExpenseController {
	
	@GetMapping("/Register")
	public String Register(@ModelAttribute("user") User user) {
		return "hello";		
	}
	
//	@CrossOrigin(origins="http://localhost:9000")
	@GetMapping("/Register1")
	public String Register(@RequestParam(value="name", defaultValue="world") String name) {
		System.out.println("vimal");
//		return Response.ok("hello").header("Access-Control-Allow-Origin", "*").build();
		return "hello";		
	}
	
	@PostMapping("/addExpense")
	public String addExpense(@RequestBody DailyExpense dailyExpense) {
		System.out.println(dailyExpense.getExpense().get(0).getCategory());
		System.out.println(dailyExpense.getUser().getUserId());
		return "true";
	}
}
