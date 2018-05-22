package flow_control_stmnts;

import java.util.Scanner;

public class Odd_or_Even {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check..!! : ");
		n=s.nextInt();
		if(n%2==0) {
			System.out.println("An EVEN Number.!!");
		}
		else {
			System.out.println("ODD Number..!!");
		}
	}

}
