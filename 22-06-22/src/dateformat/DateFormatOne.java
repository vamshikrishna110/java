package dateformat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateFormatOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		String month = sc.next();
		String year = sc.next();
		String date = year + "-" + month + "-" + day;
		
		LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
		System.out.println(date1);


	}

}

