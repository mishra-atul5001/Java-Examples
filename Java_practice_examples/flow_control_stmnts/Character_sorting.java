package flow_control_stmnts;

import java.util.Scanner;

public class Character_sorting {

	private static Scanner input;

	public static void main(String[] args) {
		char ch1;
		// TODO Auto-generated method stub
		char ch2;
		input = new Scanner(System.in);
		ch1=input.next().charAt(0);
		ch2 = input.next().charAt(0);
		
		if(Character.toLowerCase(ch1)<Character.toLowerCase(ch2)) {
			System.out.println(ch1+","+ch2);
			
		}
		else {
			System.out.println(ch2+","+ch1);
		}
		
		
		

	}

}
