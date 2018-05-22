package flow_control_stmnts;

import java.util.Scanner;

public class Check_number_status {
	
	private static Scanner s;

	public static void main(String[] args) {
		int n;
		s = new Scanner(System.in);
		System.out.println("Enter the number please: ");
		n=s.nextInt();
		if(n<0) {
			System.out.println("It's a NEGATIVE number");
		}
		else if(n==0) {
			System.out.println("It's a ZERO..!!");
		}
		else
		{
			System.out.println("A POSITIVE number..!! COOL..!!");
		}
	}

}
