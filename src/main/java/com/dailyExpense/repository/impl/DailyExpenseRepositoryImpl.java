package com.dailyExpense.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dailyExpense.model.DailyExpense;
import com.dailyExpense.model.Expense;
import com.dailyExpense.model.User;
import com.dailyExpense.repository.DailyExpenseRepository;

@Repository
public class DailyExpenseRepositoryImpl implements DailyExpenseRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	@Override
	public void addExpense(DailyExpense dailyExpense) {
		Session session = sessionFactory.getCurrentSession();
		session.save(dailyExpense);				
	}
	
	@Override
	public List<Expense> getExpenseOption() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Expense", Expense.class).getResultList();
	}

}
