package com.app.dynamic_filtering.model;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("AccountFilter")
public class Account {

	private String accountId;
	private String accountNumber;
	private String accountHolder;
	private double amount;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountId, String accountNumber, String accountHolder, double amount) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.amount = amount;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accontNumber) {
		this.accountNumber = accontNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
