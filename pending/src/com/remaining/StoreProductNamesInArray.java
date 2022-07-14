package com.remaining;
import java.util.*;

public class StoreProductNamesInArray {

	public static void main(String[] args) {
		
		
		String[] sorted= {"one", "two", "three","four","five"};

		//System.out.println(sorted);

		for (int i = 0; i < sorted.length; i++) {
		           System.out.println(sorted[i]);
		       }
		 Arrays.sort(sorted);

		Arrays.sort(sorted, (a,b)-> Integer.compare(a.length(), b.length()));

		 //System.out.println(sorted);


		for (int i = 0; i < sorted.length; i++) {
		           System.out.println(sorted[i]);
		       }
		}

		}

