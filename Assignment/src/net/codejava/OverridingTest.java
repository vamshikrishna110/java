package net.codejava;

class Dog{
    public final void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){  //Cannot override the final method 
        System.out.println("bowl");
    }
}
 
public class OverridingTest{
    public static void main(String [] args){
        Dog dog = new Hound();
        dog.bark();;
    }
}

int a;
int a=10;