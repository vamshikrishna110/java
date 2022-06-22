package com.javacode;
import java.util.Scanner;
public class Demilifier {

	public static void main(String[] args) {
		String s = "";
		Scanner scan = new Scanner(s);
		scan.useDelimiter("and");
		while (scan.hasNext()) {
			String temp = scan.next();
			System.out.println(temp);
		}
		
	}

}
