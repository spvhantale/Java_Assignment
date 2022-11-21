package com.account.dao;

import com.account.bean.Account;

public interface AccountDao {

	Account findById(int id);
	String save(Account account);
	String deleteAccountById(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);
	
}
