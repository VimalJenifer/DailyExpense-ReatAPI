package com.dailyExpense.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="expense")
@JsonIgnoreType
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String category;
	
	private String description;
	
	private String amount;
	
	@ManyToOne(optional= false)
	@JoinColumn(name= "dailyexpenseid")
	private DailyExpense dailyexpense;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public DailyExpense getDailyexpense() {
		return dailyexpense;
	}

	public void setDailyexpense(DailyExpense dailyexpense) {
		this.dailyexpense = dailyexpense;
	}

	
}
