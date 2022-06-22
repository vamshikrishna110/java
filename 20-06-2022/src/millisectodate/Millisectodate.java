package millisectodate;
import java.util.*;
//import java.util.Date;
import java.text.DateFormat;   
import java.text.SimpleDateFormat;   

public class Millisectodate {

	public static void main(String[] args) {
		
		long milisec;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Milliseconds:"); //1086073200000    1508484583267
		milisec = scan.nextLong();
		scan.close();
		
		//creating date obj format
		SimpleDateFormat SimpleDateFormatobj = new SimpleDateFormat("dd MMM yyy HH:mm:ss:SSS");
		Date res = new Date(milisec);
		System.out.println(SimpleDateFormatobj.format(res));
		
	}

}
