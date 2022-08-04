package com.bank.service;

import java.sql.SQLException;
import java.util.List;

import com.bank.bean.Bank;
import com.bank.dao.BankDaoImpl;
import com.bank.dao.IBankdao;




public class BankServiceImpl implements  IBankService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void openAcc(Bank bank) throws SQLException {
		IBankdao iBankDao = null;
		iBankDao = new BankDaoImpl();
		iBankDao.openAcc(bank);
		
	}

	@Override
	public Bank getByAccNo(String accno) throws SQLException {
		IBankdao iBankDao = null;
		iBankDao = new BankDaoImpl();
		Bank b = iBankDao.getByAccNo(accno);
		return b;
	}

	@Override
	public List<Bank> getAllAccDetails() throws SQLException {
		IBankdao iBankDao = null;
		iBankDao = new BankDaoImpl();
		List <Bank>listOfBankDetails = iBankDao.getAllAccDetails();
		return listOfBankDetails;
	}

}
