package com.bank.service;

import java.sql.SQLException;
import java.util.List;

import com.bank.bean.Bank;

public interface IBankService {


	public void openAcc(Bank bank) throws SQLException;

	public Bank getByAccNo(String accno) throws SQLException;

	

	public List<Bank> getAllAccDetails() throws SQLException;

}
