package com.bike.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bike.bean.Bike;
import com.bike.service.BikeServiceImpl;
import com.bike.service.IBikeService;

public class BikeUi {
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {//throws ClassNotFoundException, IOException {
				
		while(true) {
			System.out.println("choose what u want to do....");
			System.out.println(" 1.add Bike \n 2.get by regdId \n 3.get by bikeName \n 4.deletion by regdId \n 5.update the record \n 6.get all bikes \n 7.exit");
			System.out.println("Enter OPTIONS between 1 to 5 only");
					
			int opt=scan.nextInt();//expecting input mismatch exception
			switch(opt){
				
			case 1:
				addBike();
				System.out.println("Bike details has been added successfully!!!");
				break;
			case 2:
				getByRegdId();
				break;
			case 3:
				getByBikeName();	
				break;
			case 4:
				deleteByRegdId();	
				break;
			case 5:
				updateByRegdId();	
				break;
			case 6:
				getAllBikes();	
				break;
			case 7:
				System.exit(0);
					break;	
				default:
					break;
			}		
		}
	}

	private static void getAllBikes() throws SQLException {
		IBikeService iBikeService = null;
		iBikeService = new BikeServiceImpl();
		List <Bike> listOfBikes = iBikeService.getAllBikes();
		System.out.println(listOfBikes);
	}

	private static void updateByRegdId() throws SQLException {
		System.out.println("Enter regdId of the bike in this format: (ex: AB12CD3456)");
		String regdId=scan.next();
		//Bike b = new Bike();
		//String id = "^[A-Za-z]{2}\\d{2}[A-Za-z]{2}\\d{4}$";
		String id = "^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$";
		Pattern p = Pattern.compile(id);
		Matcher m = p.matcher(regdId);
		if (!m.find()) {
			String str = "Invalid regId of bike";
			throw new RuntimeException(str);
		}
		
		IBikeService iBikeService = null;
		iBikeService = new BikeServiceImpl();
		Bike b = iBikeService.getByRegdId(regdId);
		String fetchRegdId = b.getRegdId();
		
		Bike b2 = getInputForBike();
	    iBikeService.updateByRegdId(b2,fetchRegdId);
//	    if (b == null) {
//	    	System.out.println("Data not Found in Database with this regdId!!");
//	    }else {
//	        System.out.println("Bike Deleted Successfully");
//	    }
		
	}

	private static void deleteByRegdId() throws SQLException {
		System.out.println("Enter regdId of the bike in this format: (ex: AB12CD3456)");
		String regdId=scan.next();
		//Bike b = new Bike();
		//String id = "^[A-Za-z]{2}\\d{2}[A-Za-z]{2}\\d{4}$";
		String id = "^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$";
		Pattern p = Pattern.compile(id);
		Matcher m = p.matcher(regdId);
		if (!m.find()) {
			String str = "Invalid regId of bike";
			throw new RuntimeException(str);
		}
		
		IBikeService iBikeService = null;
		iBikeService = new BikeServiceImpl();
	    Bike b = iBikeService.deleteByRegdId(regdId);
	    if (b == null) {
	    	System.out.println("Data not Found in Database with this regdId!!");
	    }else {
	        System.out.println("Bike Deleted Successfully");
	    }
		
	}

	private static void getByBikeName() throws SQLException {
		System.out.println("Enter name of the bike");
		String bikeName=scan.next();
		//String b = bikeName.equalsIgnoreCase(bikeName);
		String bName = "^[A-Za-z]{3,8}$";
		Pattern p1 = Pattern.compile(bName);
		Matcher m1 = p1.matcher(bikeName);
		
		if (!m1.find()) {
			throw new RuntimeException("Invalid name format: It should not be null or min 3 chars, max 8 chars is required ");
		}
		
		IBikeService iBikeService = null;
		iBikeService = new BikeServiceImpl();
	    Bike b =  iBikeService.getByBikeName(bikeName);
	    if (b == null) {
	    	System.out.println("Data not Found in Database with this bikeName!!");
	    }else {
	        System.out.println(b);
	    }
	}

	private static void getByRegdId() throws SQLException {
		System.out.println("Enter regdId of the bike in this format: (ex: AB12CD3456)");
		String regdId=scan.next();
		//Bike b = new Bike();
		//String id = "^[A-Za-z]{2}\\d{2}[A-Za-z]{2}\\d{4}$";
		String id = "^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$";
		Pattern p = Pattern.compile(id);
		Matcher m = p.matcher(regdId);
		if (!m.find()) {
			String str = "Invalid regId of bike";
			throw new RuntimeException(str);
		}
		
		IBikeService iBikeService = null;
		iBikeService = new BikeServiceImpl();
	    Bike b =  iBikeService.getByRegdId(regdId);
	    if (b == null) {
	    	System.out.println("Data not Found in Database with this regdId!!");
	    }else {
	        System.out.println(b);
	    }
	    //return b;
	}

	static Bike getInputForBike(){
		System.out.println("Enter regdId of the bike in this format: (ex: AB12CD3456)");
		String regdId=scan.next();
		Bike b = new Bike();
		//String id = "^[A-Za-z]{2}\\d{2}[A-Za-z]{2}\\d{4}$";
		String id = "^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$";
		Pattern p = Pattern.compile(id);
		Matcher m = p.matcher(regdId);
		if (m.find()) {
			b.setRegdId(regdId);
			//String id = regdId;
		}else {
			String str = "Invalid regId of bike";
			throw new RuntimeException(str);
		}
		
		System.out.println("Enter name of the bike");
		String bikeName=scan.next();
		String bName = "^[A-Za-z]{3,8}$";
		Pattern p1 = Pattern.compile(bName);
		Matcher m1 = p1.matcher(bikeName);
		
		if (m1.find()) {
			b.setBikeName(bikeName);
		}else {
			throw new RuntimeException("Invalid name format: It should not be null or min 3 chars, max 8 chars is required ");
		}
		
		System.out.println("Enter color of the bike");
		String color=scan.next();
		
		System.out.println("Enter price of the bike");
		float price=scan.nextFloat();
		
		Bike bike=new Bike(regdId, bikeName, color, price);
		return bike;
	}
	
    private static void addBike() throws SQLException {// throws ClassNotFoundException, IOException{
		
		//int id=0;
        String continueStatus=null;
		do{
			Bike bike =getInputForBike();//obj still needs id
			IBikeService iBikeService=null;
			iBikeService=new BikeServiceImpl();
            iBikeService.addBike(bike);
					
		    System.out.println("do u want to continue?? enter yes");
			continueStatus= scan.next();
					
		}while(continueStatus.equalsIgnoreCase("yes"));
		
     }

}
