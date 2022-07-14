package failfast;

import java.util.*;

public class Todo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers =  new  ArrayList<>();
		numbers.add(20);
		numbers.add(30);
        // getting iterator from list
		Iterator <Integer> iterator = numbers.iterator();
	
		while(iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			numbers.add(40);
			/*Any changes in the collection, such as adding, removing and updating collection during
			 *  a thread are iterating collection
			then Fail fast throw concurrent modification exception.*/ 
		 
		// array list and hashmap collection are the examples of fail fast 
		// Exception in thread "main" java.util.ConcurrentModificationException
		
		}

	}

}
