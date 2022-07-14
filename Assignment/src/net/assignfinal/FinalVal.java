package net.assignfinal;

public class FinalVal {
	final int finalvar; //The blank final field finalvar may not have been initialized

	public static void main(String[] args) {
		FinalVal v = new FinalVal();
		System.out.println(v.finalvar);
		
	}

}
