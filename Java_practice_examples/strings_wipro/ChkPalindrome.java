package strings_wipro;

import java.util.Scanner;

public class ChkPalindrome {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev = "";
	     
	 sc = new Scanner(System.in);
	 System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 

	}

}
