package com.dayafter;
import java.util.*;
public class Dayafter {

	public static void main(String[] args) {
	
	Date dt1 = new Date(2017, 5, 30);
	Date dt2 = new Date(2017, 3, 25);
	
	boolean result1 = dt1.after(dt2);
	System.out.println(result1);
	
	boolean result2 = dt2.after(dt1);
	System.out.println(result2);
	
	
	}
}
