package com.dailyExpense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dailyExpense.model.DailyExpense;
import com.dailyExpense.model.Expense;
import com.dailyExpense.model.User;
import com.dailyExpense.service.DailyExpenseService;

@RestController
@RequestMapping(value= {"/DailyExpense"})
public class DailyExpenseController {
	
	@Autowired
	DailyExpenseService expenseService;
	
	@PostMapping("/Register")
	public String Register(@RequestBody User user) {
		System.out.println(user.toString());
		expenseService.addUser(user);
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
		expenseService.addExpense(dailyExpense);
		return "true";
	}
	
	@GetMapping("/getExpenseOption")
	public List<Expense> getExpenseOption() {
		return expenseService.getExpenseOption();
	}
}
