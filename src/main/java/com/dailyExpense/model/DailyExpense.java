package com.dailyExpense.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyExpense {
	
	@Id
	private Long id;
	
	private User user;
	
	private List<Expense> expense;
	
	private List<Income> income;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Expense> getExpense() {
		return expense;
	}

	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}

	public List<Income> getIncome() {
		return income;
	}

	public void setIncome(List<Income> income) {
		this.income = income;
	}
	
	

}
