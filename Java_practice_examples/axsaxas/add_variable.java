package axsaxas;

import java.util.Scanner;

public class add_variable {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		
		input = new Scanner(System.in);
		String v1 = input.nextLine();
		String v3 = input.nextLine();
		
		String v2 = " Technologies ";
	   String final_string = v1 + v2 + v3;
	  
	   System.out.println(final_string);
		
	}

}
