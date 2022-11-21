package com.account.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.account.bean.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		Account account=null;
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
	EntityManager	em=emf.createEntityManager();
	
	account=em.find(Account.class, id);
	
		return account;
	}

	@Override
	public String save(Account account) {
		
		String s="Account details added";
		
		
	EntityManagerFactory	emf=Persistence.createEntityManagerFactory("accountUnit");
		
	EntityManager	em=emf.createEntityManager();
		
	EntityTransaction	et=em.getTransaction();

		et.begin();
		em.persist(account);
		et.commit();
		em.close();	
		return s;
	}

	@Override
	public String deleteAccountById(int id) {
		// TODO Auto-generated method stub
		String s="Account details deleted";
		
		
		EntityManagerFactory	emf=Persistence.createEntityManagerFactory("accountUnit");
			
		EntityManager	em=emf.createEntityManager();
			
		EntityTransaction	et=em.getTransaction();
		Account a=em.find(Account.class, id);
			et.begin();
			em.remove(a);
			et.commit();
			em.close();	
			return s;
		
	}

	@Override
	public String withdraw(double amount, int accountId) {
	
		EntityManagerFactory	emf=Persistence.createEntityManagerFactory("accountUnit");
			
		EntityManager	em=emf.createEntityManager();
			
		EntityTransaction	et=em.getTransaction();
		Account a=em.find(Account.class, accountId);
			et.begin();
			a.setBalance(a.getBalance()-amount);
			et.commit();
			em.close();	
			
			String s="Amount is withdraw Rs. "+amount+" and total amount remaining is Rs. "+a.getBalance();
		return s;
	}

	@Override
	public String deposit(double amount, int accountId) {
		EntityManagerFactory	emf=Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager	em=emf.createEntityManager();
			
		EntityTransaction	et=em.getTransaction();
		Account a=em.find(Account.class, accountId);
			et.begin();
			a.setBalance(a.getBalance()+amount);
			et.commit();
			em.close();	
			
			String s="Amount is deposit Rs. "+amount+"  and total amount is Rs. "+a.getBalance();
		return s;
	}

}
