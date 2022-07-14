package com.cf;

import java.util.ArrayList;
import java.util.List;

class Practice {
//
	public static void main(String[] args) {
//		byte arr[] = {1, 2, 3, 4, 5};
//		
//		byte arr1[] = new byte[5];
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		arr1[3] = 40;
//		arr1[4] = 50;
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		//===================================================================================================================
		
			//creating a method which receives an array as a parameter  
//			static void min(int arr[]){  
//			int min=arr[0];  
//			for(int i=1;i<arr.length;i++)  
//			 if(min>arr[i])  
//			  min=arr[i];  
//			  
//			System.out.println(min);  
//			}  
//			  
//			public static void main(String args[]){  
//			int a[]={33,3,4,5};//declaring and initializing an array  
//			min(a);//passing array to method  
		
	
		//create an array of product object   
//		Product[] obj = new Product[5] ;  
//		//create & initialize actual product objects using constructor  
//		obj[0] = new Product(23907,"Dell Laptop");  
//		obj[1] = new Product(91240,"HP 630");  
//		obj[2] = new Product(29823,"LG OLED TV");  
//		obj[3] = new Product(11908,"MI Note Pro Max 9");  
//		obj[4] = new Product(43590,"Kingston USB");  
//		//display the product object data  
//		System.out.println("Product Object 1:");  
//		obj[0].display();  
//		System.out.println("Product Object 2:");  
//		obj[1].display();  
//		System.out.println("Product Object 3:");  
//		obj[2].display();  
//		System.out.println("Product Object 4:");  
//		obj[3].display();  
//		System.out.println("Product Object 5:");  
//		obj[4].display();  
//		}  
//		}  
//		//Product class with product Id and product name as attributes  
//		class Product  
//		{  
//		int pro_Id;  
//		String pro_name;  
//		//Product class constructor  
//		Product(int pid, String n)  
//		{  
//		pro_Id = pid;  
//		pro_name = n;  
//		}  
//		public void display()  
//		{  
//		System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name);  
//		System.out.println();  
		//============================================================================================
		
//		class Dog2{  
//			 public static void main(String args[]){  
			
//				B s = null;  // null is not a object
//				System.out.println(s instanceof Practice);  // false
//				
//				B s1 = new B();
//				System.out.println(s1 instanceof Practice); // true
//				
//				B s2 = new B();
//				System.out.println(s1 instanceof B);   // true
//		
		//}  
//}  
//	
//class B implements Practice { 
//
//}
		
		//===============================================================================================
		
//		 b n = new Practice(); // complilation error
//		 System.out.println(n);
//		 b n1 = (b)new Practice();
//		 System.out.println(n1);   // classcastexception
		
		 ArrayList<String> l = new ArrayList<>();
		 l.add("peter");
		 l.add("teja");
		 l.add("surya");
		 l.add("teja");
		 
		 if(l.remove("teja")) {
			 l.remove("jon");
		 }
		 System.out.println(l);
		 
		}
}




	

