package com.dailyExpense.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//@Entity
public class DailyExpense {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
//	@OneToOne
	private User user;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER, mappedBy= "expense")
	private List<Expense> expense;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER, mappedBy= "expense")
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
