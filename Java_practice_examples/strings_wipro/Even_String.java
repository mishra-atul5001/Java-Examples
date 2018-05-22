package strings_wipro;

import java.util.Scanner;

public class Even_String {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String input;

		System.out.println("Enter the string: ");
		input = sc.nextLine();
		if((input.length())%2==0) {
			String k = input.substring(0, input.length()/2);
			System.out.println(k);
		}
		else {
			System.out.println("null");
		}
		
	}

}
