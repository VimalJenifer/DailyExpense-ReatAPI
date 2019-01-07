package com.dailyExpense.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Expense {
	
	private String category;
	
	private String description;
	
	private String amount;

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
}
