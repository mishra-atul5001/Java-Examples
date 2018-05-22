package maps_exer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Map_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<String,Integer> contactList = new HashMap<String,Integer>();
	contactList.put("Atul", (int) 8939445650L);
	contactList.put("Maa", (int)7275346663L);
	System.out.println("To check wether a Key exists or not..!!");
	//System.out.println("");
	if(contactList.containsKey("Maa")) {
		System.out.println("Maa as a Key Exists..!!");	
	}else {
		System.out.println("Sorry Maa as a Key does not exists..!!");
	}
	System.out.println("");
	System.out.println("To check wether a Value Exists or not..!!");
	//System.out.println("");
	if(contactList.containsValue((int)8939445650L)) {
		System.out.println("The Checked Value also exists..!!");
	}else {
		System.out.println("Sorry..!!");
	}
	System.out.println("");
	Set states;
	String str;
	 states = contactList.keySet();   
     Iterator itr = states.iterator();
     System.out.println("Printing Keys via Iteration..!!");
    // System.out.println("");
     while(itr.hasNext()) {
        str = (String) itr.next();
        System.out.println(str);
     }     
	
	}
}
