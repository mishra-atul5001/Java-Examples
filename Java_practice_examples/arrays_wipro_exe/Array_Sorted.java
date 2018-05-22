package arrays_wipro_exe;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorted {
	
	private static Scanner s;

	public static void main(String args[]) {
		s = new Scanner(System.in);
		int n;
		System.out.println("Enter the lenght of the array: ");
		n=s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		 for (int i = 0; i < n - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[n - 1]);
	    }
		
	}


