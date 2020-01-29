package com.dailyExpense.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public Response Register(@RequestBody User user) {
		expenseService.addUser(user);		
		return Response.ok().build();		
	}
	
	@PostMapping("/Login")
	public Response Login(@RequestBody User user) {
		DailyExpense dailyExpense = expenseService.loginUser(user);
		return Response.status(Response.Status.OK).entity(dailyExpense).type(MediaType.APPLICATION_JSON).build();
	}
	
	@PostMapping("/addNewExpense")
	public String addNewExpense(@RequestBody Expense expense) {
		expenseService.addNewExpense(expense);
		return "true";
	}
	
	@PostMapping("/addExpense")
	public String addExpense(@RequestBody DailyExpense dailyExpense) {
		expenseService.addExpense(dailyExpense);
		return "true";
	}
	
	@GetMapping("/getExpenseOption")
	public List<Expense> getExpenseOption(@RequestBody User user) {
		return expenseService.getExpenseOptionByUserId(user);
	}
}
