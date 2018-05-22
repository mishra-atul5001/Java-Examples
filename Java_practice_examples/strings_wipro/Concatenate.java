package strings_wipro;

import java.util.Scanner;

public class Concatenate {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter the 2 Strings");
		String str1 = input.nextLine(); //First string
		String str2 = input.nextLine(); //Second string
		if( str1.substring( str1.length()-1).equalsIgnoreCase( str2.substring(0,1)) )
		                    System.out.println(  str1.concat( str2.substring(1, str2.length())).toLowerCase() );
		                else
		                    System.out.println(  str1.concat( str2) );
	}

}
