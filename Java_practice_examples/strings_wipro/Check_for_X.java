package strings_wipro;

import java.util.Scanner;

public class Check_for_X {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		withoutX(str1);
		
		

}
static	public String withoutX(String str) { 
		
		  if (str.length() == 0)
		
		    return str;
		
		  if (str.length() == 1){
		
		    if (str.charAt(0) == 'x')
		
		      return "";
		
		    else
		
		      return str;
		
		  }

		  if (str.charAt(0) == 'x')
		
		    str = str.substring(1,str.length());

		  if (str.charAt(str.length()-1) == 'x')
		
		    str = str.substring(0,str.length()-1);
		  	System.out.println(str);
		
		  return str;
		  
		  
		}


}
