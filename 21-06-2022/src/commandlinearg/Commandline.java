package commandlinearg;
import java.util.*;
public class Commandline {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		//System.out.println(num);
		if(num> 0) {
			System.out.println("Positive Number");
		}else if (num < 0) {
			System.out.println("Negative Number");
		}else if(num==0) {
			System.out.println("Neither Positive Nor Negative");
			
		}

	}

}
