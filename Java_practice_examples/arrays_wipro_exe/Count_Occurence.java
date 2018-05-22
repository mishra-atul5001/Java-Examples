package arrays_wipro_exe;

import java.util.Arrays;
import java.util.Scanner;
public class Count_Occurence {
	public static void main(String[] args) 
    {
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int[] numbers = new int[n];
		
		// Take input
		for(int j=0;j<n;j++) {
			numbers[j]=s.nextInt();
		}
		//Sorting
		Arrays.sort(numbers);

		// To check Duplicates
		for(int i = 1; i < numbers.length; i++) {
		    if(numbers[i] == numbers[i - 1]) {
		        System.out.println(numbers[i]);
		    }
		}
    }
}


