package com.increment;
import java.util.*;  
 
public class skip {
	public static void main(String[] args) {

		      String s = "and HTML and Css";

		      // create a new scanner with the specified String Object
		      Scanner scanner = new Scanner(s);

		      // skip the word that matches the pattern ..llo
		      scanner.skip("and");
		      System.out.println("" + scanner.nextLine());

		      // close the scanner
		      scanner.close();
		   }
		}
		


