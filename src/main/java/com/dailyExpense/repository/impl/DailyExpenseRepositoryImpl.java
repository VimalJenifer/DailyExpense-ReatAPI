package com.dailyExpense.repository.impl;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
	
	private Session session;
	
	private Session getSession() {
		if(session == null) {
			session = sessionFactory.getCurrentSession();
		}
		return session;		
	}
	
	@Override
	public void addUser(User user) {
		Session session = getSession();
		session.save(user);
	}
	
	@Override
	public DailyExpense loginUser(User user) {
		Session session = getSession();
		return new DailyExpense();
	}
	
	@Override
	public boolean addNewExpense(Expense expense) {
		Session session = sessionFactory.getCurrentSession();
		session.save(expense);
		return true;
	}

	@Override
	public void addExpense(DailyExpense dailyExpense) {
		Session session = sessionFactory.getCurrentSession();
		session.save(dailyExpense);		
//		session.persist(dailyExpense);
	}
	
	@Override
	public List<Expense> getExpenseOptionByUserId(User user) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println(user.getId());
	
//		List<Expense> expense = session.createCriteria(Expense.class).createCriteria("user").add(Restrictions.eq("id", user.getId())).list();
		List<Expense> expense = session.createCriteria(Expense.class).list();
		System.out.println(expense.toString());
		return expense;
	}

}
