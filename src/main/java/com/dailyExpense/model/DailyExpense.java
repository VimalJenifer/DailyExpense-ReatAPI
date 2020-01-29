package com.dailyExpense.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="transactionType")
	private String transactionType;
	
	@Column(name="description")
	private String description;
	
	@Column(name="amount")
	private Double amount;
	
	@OneToOne
	@JoinColumn(name="expense_id")
	private Expense expense;
	
	@OneToOne
	@JoinColumn(name="income_id")
	private Income income;
	
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Expense getExpense() {
		return expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}


}
