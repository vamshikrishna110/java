package net.fourclass;
class D8{
	void display(){
		System.out.println("Hello World");
	}
}

class C8 extends D8{
    
}

class B8 extends C8{
   
}

public class One extends B8{
	

	public static void main(String[] args) {
		One a8 = new One();
		a8.display();

	}

}
