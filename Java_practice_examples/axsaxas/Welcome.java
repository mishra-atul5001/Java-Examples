package axsaxas;

import java.util.Scanner;

public class Welcome {
	
	private static Scanner input;
	private static String name;
	private static String welcome;

	public static void main(String[] args) {
		welcome = "Welcome ";
		input = new Scanner(System.in);
		name = input.nextLine();
		System.out.println(welcome + name);
		
		
	}
	
	

}
