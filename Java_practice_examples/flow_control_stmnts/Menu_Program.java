package flow_control_stmnts;

import java.util.Scanner;

public class Menu_Program {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu_Add_Sub();
		int get_code = input.nextInt();
		switch(get_code) {
		case 1:
				add();
				re_again();
			break;
		case 2:
				sub();
				re_again();
			break;
		}		
	}
	
	 static void Menu_Add_Sub() {
		System.out.println("Welcome to the Short Menu..!!");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		
	}
	 static void add() {
		System.out.println("Enter 2 Numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int final_result1 = num1+num2;
		System.out.println(final_result1);
	}
	 static void sub() {
		System.out.println("Enter 2 Numbers : ");
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int final_result = num3-num4;
		System.out.println(final_result);
	}
	 static void re_again() {
		System.out.println("Do you wish to continue..!!?");
		char get_wish = input.next().charAt(0);
		if(get_wish=='n' || get_wish=='N') {
			System.exit(0);
		}
		else {
			main(null);
		}
	}
}
			
		
	
	

