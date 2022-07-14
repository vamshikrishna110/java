package com.cf.d;

import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		Pattern p =  Pattern.compile("..p");//represent single character
		Matcher m = p.matcher("sap");//Creates a matcher that will match the given input against this pattern.
										//Parameters
		System.out.println(m.matches());//true if, and only if, the entire region sequencematches this matcher's pattern
		
		
		
	}

}
