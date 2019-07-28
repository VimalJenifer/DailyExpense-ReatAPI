package com.dailyExpense.service.impl;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dailyExpense.model.DailyExpense;
import com.dailyExpense.model.Expense;
import com.dailyExpense.model.User;
import com.dailyExpense.repository.DailyExpenseRepository;
import com.dailyExpense.service.DailyExpenseService;

@Service
@Transactional
public class DailyExpenseServiceImpl implements DailyExpenseService {
	
	@Autowired
	DailyExpenseRepository dailyExpenseRepository;
	
	@Override
	public void addUser(User user) {
		dailyExpenseRepository.addUser(user);		
	}

	@Override
	public void addExpense(DailyExpense dailyExpense) {
		dailyExpenseRepository.addExpense(dailyExpense);		
	}
	
	@Override
	public List<Expense> getExpenseOption() {
		return dailyExpenseRepository.getExpenseOption();
	}

	
}
