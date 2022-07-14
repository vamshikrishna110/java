package net.morecons;
class Cons {
	Cons() {
		System.out.println("im parent constructor");
	}
}

public class MoreCons extends Cons {
	MoreCons() {
		System.out.println("im child constructor");
	}

	public static void main(String[] args) {
		MoreCons out = new MoreCons(); //calling the child method
		//Cons val = new Cons(); // it will print only parent method
	}

}
