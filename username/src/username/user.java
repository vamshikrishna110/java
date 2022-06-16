package username;
import java.util.Scanner;
public class user {
	
	public static void main(String[] args) {
		  	String password = "Test";
		  	String username = "Test";
		  	
	        String inputPass;
	        Scanner  input = new Scanner(System.in);
	        
	        String inputpass1;
	        Scanner input1 = new Scanner(System.in);
	        
	        System.out.println("Enter Your username:"); 
	        System.out.println("Enter Your Password:");
	        
	        inputPass = input.nextLine();
	        inputpass1 = input1.nextLine();
	
	        for (int i = 0; i < 3; i++) {
	            if(!(inputPass.equals(password)) || !(inputpass1.equals(username))){
	        	    System.out.println("Wrong crediantials");
	                System.out.println("Enter Your username:"); 
	                System.out.println("Enter Your Password:");
	                inputPass = input.nextLine();
	                inputpass1 = input1.nextLine();
	                if((i == 2) && (!(inputPass.equals(password))) && (!(inputpass1.equals(username)))) {
	    	        	System.out.println("please contact administrator");
	    	        	break;
	    	        }
	                
	             }
	            else if (inputPass.equals(password) && inputpass1.equals(username)) {
	                  System.out.println("Welcome User!"); 
	                  break;
	             }
	             
	        }   

	}

}
