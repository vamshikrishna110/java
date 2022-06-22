package firstletterofword;
import java.util.Scanner;
public class FirstletterofWord {

		public static void main(String[] args) {
		 		System.out.println("Enter name: ");
		 		Scanner scan = new Scanner(System.in);
		 		String name = scan.nextLine();
		 		String check = scan.nextLine();
		 		
		 		char[] arr = new char[10];
		 		int k=0;
		 		arr[k] = name.charAt(0);
		 		
		 		while(check.equals("yes")) {
		 			k = k+1;
		 			System.out.println("Enter name: ");
		 			name = scan.nextLine();
		     check = scan.nextLine();
		     arr[k] = name.charAt(0);
		     
		     if(check.equals("no")) {
		     break;
		     }
		 		}
		 		int[] freq = new int[k+1];
		 		int skip = -1;
		 		
		 		for (int i=0; i<k+1; i++) {
		 			int count = 1;
		 			for (int j =i+1; j<k+1; j++) {
		 				if (arr[i] == arr[j]) {
		 					freq[i] = count++;
		 					freq[j] = skip;
		 				}
		 			}
		 			if(freq[i] != skip) {
		 				freq[i] = count;
		 			}
		 		}
		 		
		 		for (int m=0; m<freq.length;m++) {
		 			if(freq[m] != skip) 
		 			System.out.println(arr[m] + "-"+ freq[m]);
		 		}
		 	}

		 
		
	}


