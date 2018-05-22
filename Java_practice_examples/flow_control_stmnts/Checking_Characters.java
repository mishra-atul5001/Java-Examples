package flow_control_stmnts;

import java.util.Scanner;

public class Checking_Characters {
	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input_char;
		s = new Scanner(System.in);
		input_char = s.next().charAt(0);
		if(input_char >=65 && input_char <=122) {
			System.out.println("Alphabet");
		}
		else if(input_char >=48 && input_char <=57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}		
	}
}
/*
 * ASCII value ranges-

	For capital alphabets 65 – 90
	For small alphabets 97 – 122
	For digits 48 – 57
 
 * */
