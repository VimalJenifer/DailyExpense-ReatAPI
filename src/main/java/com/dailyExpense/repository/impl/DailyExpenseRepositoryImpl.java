package com.dailyExpense.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dailyExpense.model.DailyExpense;
import com.dailyExpense.repository.DailyExpenseRepository;

@Repository
public class DailyExpenseRepositoryImpl implements DailyExpenseRepository{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addExpense(DailyExpense dailyExpense) {
		Session session = sessionFactory.getCurrentSession();
		session.save(dailyExpense);				
	}

}
