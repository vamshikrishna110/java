package com.assign;

class AB1{
	
}

public class AB extends AB1{
	
	private int f=30;
	
	public void display(int g){
		f=g;
		System.out.println(f);
	}

	public static void main(String[] args) {
		AB ab =new AB();
		ab.display(10);
	}
}


class B{}
class C extends B
{
	private int f=30;
	public void display(int g){
		f=g; /*can i rename f to other name or is there any other solution to assign
g value to f, can also try renaming if u want to*/
	}
}

