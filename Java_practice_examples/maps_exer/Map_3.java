package maps_exer;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Properties capitals = new Properties();
	      Set states;
	      String str;
	      capitals.put("India", "Delhi");
	      capitals.put("France", "Paris");
	      capitals.put("Sri Lanka", "Colombo");
	      states = capitals.keySet();   
	      Iterator itr = states.iterator();
	      while(itr.hasNext()) {
	         str = (String) itr.next();
	         System.out.println("The capital of " + str + " is " + 
	            capitals.getProperty(str) + ".");
	      }     
	      System.out.println();
	      str = capitals.getProperty("Indonesia", "Not Found");
	      System.out.println("The capital of Indonesia is " + str + ".");
	}

}
