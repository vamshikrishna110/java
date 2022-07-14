package com.cf.oca;
class Phone {
	String keyboard = "in-built";
	
}
class Tablet extends Phone {
	boolean playmovie = false;
}
 class College2 {

	public static void main(String[] args) {
		Phone phone = new Tablet(); 
		System.out.println(phone.keyboard + " " + phone.playmovie);
		
		

	}

}
