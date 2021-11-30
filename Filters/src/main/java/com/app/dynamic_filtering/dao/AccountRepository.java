package com.app.dynamic_filtering.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.dynamic_filtering.model.Account;

@Component
public class AccountRepository {
	private static List<Account> accountList = new ArrayList<>();

	static {
		accountList.add(new Account("1", "101", "Liam", 23000));
		accountList.add(new Account("2", "102", "Zayn", 29000));
		accountList.add(new Account("3", "103", "Harry", 923000));
	}

	public List<Account> findAccounts() {
		return accountList;
	}
}
