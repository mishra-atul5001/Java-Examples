package maps_exer;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_5 {
	static TreeMap<String,String> CountryMap = new TreeMap<String,String>();
	Set set = CountryMap.entrySet();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap.put("India","Delhi");
		CountryMap.put("Sri Lanka","Colombo");
		CountryMap.put("France","Paris");
		SaveCountryCapital("","");
		getCapital("India");
		getCountry("Colombo");
		reversedTreeMap();
		ArrayListCreationfromTreeMap();
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
	static void reversedTreeMap() {
		TreeMap<String, String> M2 = new TreeMap<String, String>();
		System.out.println("---------------------------------------------------");
		for (String i : CountryMap.keySet()) {
		    M2.put(CountryMap.get(i), i);
		}
		System.out.println("The Reversed Tree Map ");
		System.out.println("");
		for(Map.Entry m:M2.entrySet()){  
			   System.out.println(("Key- Country :"+m.getKey()+" ||  Value- Capital :"+m.getValue()));  
			  } 
		System.out.println("---------------------------------------------------");
		
	}
	
	static void ArrayListCreationfromTreeMap() {
		Set<String> set = CountryMap.keySet();
		ArrayList<String> listOfKeys = new ArrayList<String>(set);
		System.out.println("ArrayList Of Keys from Country Map Tree Map:");
        
        for (String key : listOfKeys) 
        {
            System.out.println(key);
        }
         
        System.out.println("--------------------------");
	}

}
