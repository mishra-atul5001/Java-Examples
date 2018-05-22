package arrays_wipro_exe;
import java.util.Scanner;

public class Search_Number {
	public static Scanner s;
	private static int store;
	
	
	public static void main(String[] args) {
		
		int n,number;
		s= new Scanner(System.in);
		System.out.println("Enter the Lenght of Array you want..!!");
		n=s.nextInt();
		System.out.println("Enter the elements:");
		int a[]  = new int[n];
		for(int i= 0;i<n;i++) {
			a[i] = s.nextInt();;
		}
		System.out.println("Ok..Now enter the number you want to search..!!");
		number = s.nextInt();
		//This block is to fine that number
		
		for(int j=0;j<a.length;j++) {
			if(number == a[j]) {
				store = j;
			}
			else
				continue;
			}
		// This block is to check whether a confirmation is there or not in store variable
		
		if(store!=0) {
			System.out.println(store+1);
		}
		else {
			System.out.println(-1);
		}
				}			
	}
	
	
	
