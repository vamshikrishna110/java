package net.difference;

public class DifferenceStatic {
	//int a = 90;
	//int b = 80;
	int a;
	int b;
	
	public DifferenceStatic(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		DifferenceStatic ans = new DifferenceStatic(90, 89);
		System.out.println(ans.a);
		System.out.println(ans.b);
	

	}

}

