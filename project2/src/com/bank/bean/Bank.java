package com.bank.bean;

public class Bank {

	private String accno;
	private String acc_type;
	private String name;
	private long balance;
	
	
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", acc_type=" + acc_type + ", name=" + name + ", balance=" + balance + "]";
	}


	public String getAccno() {
		return accno;
	}


	public void setAccno(String accno) {
		this.accno = accno;
	}


	public String getAcc_type() {
		return acc_type;
	}


	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bank(String accno, String acc_type, String name, long balance) {
		super();
		this.accno = accno;
		this.acc_type = acc_type;
		this.name = name;
		this.balance = balance;
	}
	
	

}
