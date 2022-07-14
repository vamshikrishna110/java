package com.codejava;

		class  Dog{
		    public void bark(){
		        System.out.println("woof ");
		    }
		}
	    class  Hound extends Dog{
		    public  abstract void sniff(){
		        System.out.println("sniff ");
		    }
		 
		    public abstract void bark(){
		        System.out.println("bowl");
		    }
		}
		 
		public abstract class  OverridingTest{
		    public static void main(String [] args){
		        Dog dog = new Hound();
		        dog.bark();
		    }
		}

