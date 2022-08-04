package com.bank.ui;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bank.bean.Bank;
import com.bank.service.BankServiceImpl;
import com.bank.service.IBankService;




public class Bankui {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {//throws ClassNotFoundException, IOException {
				
		while(true) {
			 System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. open account \n 2.  Search by Account number  \n 3. get all account details \n 4. Withdraw the amount \n 5.Deposit amount \n 6. Exit ");
					
			int opt=scan.nextInt();//expecting input mismatch exception
			switch(opt){
				
			case 1:
				openAcc();
				System.out.println("Bank account has created successfully!!!");
				break;
			case 2:
				getByAccNo();
				break;
			case 3:
				getAllAccDetails();
				break;
			case 4:
					
				break;
			case 5:
					
				break;
			case 6:
				
				
				break;
			case 7:
				System.exit(0);
					break;	
				default:
					break;
			}		
		}
	}
	private static void getAllAccDetails() throws SQLException {
		IBankService iBankService = null;
		iBankService = new BankServiceImpl();
		List <Bank> listOfBankdetails = iBankService.getAllAccDetails();
		System.out.println(listOfBankdetails);
		
	}
	private static void getByAccNo() throws SQLException {
	System.out.println("Enter the account number: ");
	String accno = scan.next();
	IBankService iBankService = null;
	iBankService = new BankServiceImpl();
    Bank b =  iBankService.getByAccNo(accno);
    if (b == null) {
    	System.out.println("Data not Found in Database with this account number");
    }else {
        System.out.println(b);
    }
    
  
	}
	
	static Bank getInputForBank() {
			System.out.print("Enter Account No: ");  
		     String  accno = scan.next();  
		    System.out.print("Enter Account type: ");  
		     String acc_type = scan.next();  
		    System.out.print("Enter Name: ");  
		    String name = scan.next();  
		    System.out.print("Enter Balance: ");  
		     long balance = scan.nextLong();  
		     Bank bank=new Bank(accno, acc_type, name, balance);
				return bank;
	}
	private static void openAcc() throws SQLException {
		 String continueStatus=null;
		 do{
				Bank bank =getInputForBank();//obj still needs id
				IBankService iBankService = null;
				iBankService = new BankServiceImpl();
				iBankService.openAcc(bank);
				
			    System.out.println("do u want to continue?? enter yes");
				continueStatus= scan.next();
						
			}while(continueStatus.equalsIgnoreCase("yes"));
				
		
	}
	 
	
	
}
	


