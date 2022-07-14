package failsafe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Safe {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("Dell", 1);
		map.put("IBM", 2);
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + ": " + map.get(key));
			map.put("Google", 3);
  	    }
		
	}

}

