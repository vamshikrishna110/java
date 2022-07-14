package com.cf.oca;
gpackage com.cf.pdf;

class Alpha {

//	public static void main(String[] args) {
//		System.out.println("hello"  + args[0]); // javac Doc.java complie
	//======											// java Doc Duke runtime
		int ns;
		static int s; 
		
		Alpha (int ns) {
			//System.out.println(s);// 0 50 125
		if(s < ns) {
			s = ns; 
				this.ns = ns;
				System.out.println(ns);
			
			}
	}
		void doprint() {
			//System.out.println(ns);
			System.out.println("ns =" + ns + "s =" + s);
	}

}
public class Doc {
	public static void main(String[] args) {
		Alpha ref1 = new Alpha(50);
		Alpha ref2= new Alpha(125);
		Alpha ref3 =new Alpha(100);
	ref1.doprint();
		ref2.doprint();
	ref3.doprint();
		
	}

}
