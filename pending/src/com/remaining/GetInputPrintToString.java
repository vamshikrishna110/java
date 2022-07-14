package com.remaining;
import java.util.*;



		class MainString {
		Scanner scan = new Scanner(System.in);
		String personName = scan.nextLine();

		@Override
			public String toString() {
				if (personName.contains("kvk")){
					return personName;
				}
				else {
					return "You should mention the kvk";
				}
			}
		}


		public class GetInputPrintToString {

		public static void main(String[] args) {
		System.out.println("Enter something: ");
		MainString main = new MainString();
		System.out.println(main);


		}

	}


