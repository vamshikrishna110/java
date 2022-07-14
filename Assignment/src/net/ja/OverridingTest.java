package net.ja;


		final class Dog{
		    public void bark(){
		        System.out.println("woof ");
		    }
		}
		class Hound extends Dog{ 			//The type Hound cannot subclass the final class Dog
		    public void sniff(){
		        System.out.println("sniff ");
		    }
		 
		    public void bark(){
		        System.out.println("bowl");
		    }
		}
		 
		public class OverridingTest{
		    public static void main(String [] args){
		        Dog dog = new Hound();  //Type mismatch: cannot convert from Hound to Dog
		        dog.bark();
		    }
		}


