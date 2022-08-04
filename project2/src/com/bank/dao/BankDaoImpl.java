package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bank.bean.Bank;



public class BankDaoImpl implements IBankdao {
	
	public void openAcc(Bank bank) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "INSERT INTO BANKS VALUES(?,?,?,?)";
		PreparedStatement st = con.prepareStatement(str);
		st.setString(1, bank.getAccno());
		st.setString(2,  bank.getAcc_type());
		st.setString(3, bank.getName());
		st.setLong(4, bank.getBalance());
		int update = st.executeUpdate();//returns int value for method executeupdate
		System.out.println(update + "row inserted");
		
		
	}

	@Override
	public Bank getByAccNo(String accno) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "SELECT * FROM BANKS WHERE ACCNO = ?";
		PreparedStatement st = con.prepareStatement(str);
		st.setString(1, accno);
		ResultSet rs = st.executeQuery();
		Bank b = null;
		while(rs.next()) {
			String accno1 = rs.getString(1);
			String acc_type = rs.getString(2);
			String name = rs.getString(3);
			Long balance = rs.getLong(4);
			b = new Bank(accno1,acc_type,name,balance);
		}
		return b;
	}

	@Override
	public List<Bank> getAllAccDetails() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "SELECT * FROM banks";
		PreparedStatement st = con.prepareStatement(str);
		ResultSet rs = st.executeQuery();
		
		List <Bank> listOfBankdetails = new ArrayList<Bank>();
		Bank b = null;
		while(rs.next()) {
			String accno = rs.getString(1);
			String acc_type = rs.getString(2);
			String name = rs.getString(3);
			Long balance = rs.getLong(4);
			b = new Bank(accno, acc_type, name, balance);
			listOfBankdetails.add(b);
		}
		return listOfBankdetails;
		
	}

		

}
