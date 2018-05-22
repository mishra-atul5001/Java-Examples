package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hash_1 {
	static String country;
	static Set<String> Country = new HashSet<String>();
	
	public static Set<String> saveCountryName(String countryname) {
		Country.add(countryname);
		System.out.println("Succesfully Added..!!");
		return(Country);
	}
	public static String getName(String countryName) {
	
		if(Country.contains(countryName)) {
			country = countryName;
		}else {
			country = null;
		}
		return(country);
	}
	
	public static void main(String[] args)
	{
		Country.add(new String("Nepal"));
		Country.add(new String("India"));
		Country.add(new String("South Africa"));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Country name to Add to the set..!!: ");
		String enterCountryName = input.nextLine();
		saveCountryName(enterCountryName);
		System.out.println(Country);
		System.out.println();
		System.out.println("Enter Country to Search: ");
		String searchName = input.nextLine();
		getName(searchName);
		System.out.println(country+ " is Present..!!");
	}
}
