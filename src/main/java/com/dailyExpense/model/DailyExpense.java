package com.dailyExpense.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "dailyexpense")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DailyExpense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dailyexpenseid")
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="dailyexpense", fetch= FetchType.EAGER)
	private List<Expense> expense;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="dailyincome")
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
