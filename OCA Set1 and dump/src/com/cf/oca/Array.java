package com.cf.oca;

public class Array {

	public static void main(String[] args) {
		//String arr [][] =new String[][] {{null}, new String[] {"A", "b", "c"}, {new String()}};
		String arr1 [][] = new String[][2]; /*Cannot specify an array dimension after
										an empty dimension*/ // error
	    String arr2 [][] = new String[][] {"S", "b"};// Cannot specify an array dimension after an empty dimension

	    String arr3 [][] = new String [] {{"A"}, {"b"}}; //Type mismatch: cannot convert from String[] to 
		
	}

}
