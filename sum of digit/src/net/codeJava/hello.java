package net.codeJava;

public class hello {

	public static void main(String[] args) {
		
		int a = 12345, sum = 0;
		
		while (a > 0) {
			sum = sum + a % 10;
			a = a/10;
		}
		String s = String.valueOf(sum);
		int length = s.length();
		if(length <= 1) {
			if(sum<10) {
			System.out.println(sum);
			}
		}else if(sum > 10 && length > 1){
		
			int sum1 = sum % 10;
			int sum2 = sum / 10;
			System.out.println(sum1 + sum2);
		}
	}
}