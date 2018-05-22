package arrays_wipro_exe;

import java.util.Arrays;
import java.util.Scanner;

public class Array_max_min {
	private static Scanner s;
	public static void main(String[] args) 
    {
        int n;
        s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
        	 a[i] = s.nextInt();
        }
       Arrays.sort(a);
       System.out.println("Max value is : " +a[a.length-1]); //Max value
       System.out.println("Min value is : " +a[0]); //Min Value
    }

}
