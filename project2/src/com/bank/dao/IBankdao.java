package com.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.bank.bean.Bank;

 public interface IBankdao {

	

	 default void openAcc(Bank bank) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Bank getByAccNo(String accno) throws SQLException;

	

	public List<Bank> getAllAccDetails() throws SQLException;

}
