package period;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PeriodOne {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start date:");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		
		System.out.println("end date:");
		int day1 = sc.nextInt();
		int month1 = sc.nextInt();
		int year1 = sc.nextInt();
		
		
		LocalDate Start = LocalDate.of(year, month, day);
		LocalDate End = LocalDate.of(year1, month1, day1);
		
		Period period = Period.between(Start, End);
		System.out.println(period);
		
		
		
		
		
		
		
		
	}

	

}
