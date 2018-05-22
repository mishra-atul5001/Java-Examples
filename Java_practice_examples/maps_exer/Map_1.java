package maps_exer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_1 {

	static HashMap<String,String> CountryMap = new HashMap<String,String>();
	Set set = CountryMap.entrySet();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap.put("India","Delhi");
		CountryMap.put("Sri Lanka","Colombo");
		CountryMap.put("France","Paris");
		SaveCountryCapital("","");
		getCapital("India");
		getCountry("Colombo");
		reversedHashMap();
		ArrayListCreationfromHashMap();
	}
	
	
	static void SaveCountryCapital(String countryName,String Capital) {
		for(Map.Entry m:CountryMap.entrySet()){  
			   System.out.println(("Key- Country :"+m.getKey()+" ||  Value- Capital :"+m.getValue()));  
			  } 
		System.out.println("---------------------------------------------------");
	}
	static void getCountry(String capitalName) {
		if( CountryMap.containsValue(capitalName)) {
			System.out.println(CountryMap.get(capitalName));
		}else {
			System.out.println("Sorry");
		}
	}
	static void getCapital(String countryName) {
	  
		if( CountryMap.containsKey(countryName)) {
			System.out.println(CountryMap.get(countryName));
		}else {
			System.out.println("Sorry");
		}
	}
	static void reversedHashMap() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		System.out.println("---------------------------------------------------");
		for (String i : CountryMap.keySet()) {
		    M2.put(CountryMap.get(i), i);
		}
		System.out.println("The Reversed Hash Map ");
		System.out.println("");
		for(Map.Entry m:M2.entrySet()){  
			   System.out.println(("Key- Country :"+m.getKey()+" ||  Value- Capital :"+m.getValue()));  
			  } 
		System.out.println("---------------------------------------------------");
		
	}
	
	static void ArrayListCreationfromHashMap() {
		Set<String> set = CountryMap.keySet();
		ArrayList<String> listOfKeys = new ArrayList<String>(set);
		System.out.println("ArrayList Of Keys from Country Map Hash Map:");
        
        for (String key : listOfKeys) 
        {
            System.out.println(key);
        }
         
        System.out.println("--------------------------");
	}

}
