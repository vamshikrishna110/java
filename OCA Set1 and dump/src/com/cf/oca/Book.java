

package com.cf.oca;
class Bo {
	String ISBN ;
	Bo(String val) {
		ISBN = val;
	}
	
}
 class Book {

	public static void main(String[] args) {
			Bo b1 = new Bo("1234-4657");
			Bo b2 = new Bo("1234-4657");
			System.out.println(b1.equals(b2) );
			System.out.println(b1== b2);
			
			
	}

}
