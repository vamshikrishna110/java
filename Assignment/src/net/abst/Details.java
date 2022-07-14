package net.abst;

abstract class CustDetails {  // CusDetails parent
	int id;
	int age;
	String name;
	long mobileNo;
	
	public CustDetails(int id, int age, String name, long mobileNo) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.mobileNo = mobileNo;
		
	}
}

public class Details extends CustDetails{  //Details child

	public Details() {
		super(15, 45, "raj", 1234567989);
		
	}
	

	public static void main(String[] args) {
		Details d = new Details();
		System.out.println(d.id + " " + d.age + " " + d.name + " " + d.mobileNo);

	}

}

