package com.dailyExpense.service;

import java.util.List;

import com.dailyExpense.model.DailyExpense;
import com.dailyExpense.model.Expense;
import com.dailyExpense.model.User;

public interface DailyExpenseService {
	
	public void addUser(User user);
	
	public void addExpense(DailyExpense dailyExpense);
	
	public List<Expense> getExpenseOption();
	

}
