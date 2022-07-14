package com.cf.d;
import java.sql.*;
import java.text.*;
import java.util.*;
public class Date {

	public static void main(String[] args) {
		
//			    java.util.Date utilDate = new java.util.Date();
//			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//			    System.out.println("utilDate: " + utilDate);
//			    System.out.println("sqlDate: " + sqlDate);
		// converted to util date to sql date by using getTime() method
		//=====================================================================================
		
		long milisec = System.currentTimeMillis(); // sql date objects can take time in milliseconds
		java.sql.Date sqldate = new java.sql.Date(milisec); //creating sql date object
		java.util.Date utilDate = new java.util.Date(sqldate.getTime()); //creating util date object bypassing gettime() method
		
		
		System.out.println("sqldate: " + sqldate); //output 2022-07-14
		System.out.println("utildatebefore " + utilDate);// output thu jul 14 10:40:09 IST 2022
		
		DateFormat date = new SimpleDateFormat("yyyy-mm-dd"); //date format
		String date1 = date.format(utilDate);//converting util date to date format
		System.out.println("utilDateafter: " + date1);
		

			  }

			}

