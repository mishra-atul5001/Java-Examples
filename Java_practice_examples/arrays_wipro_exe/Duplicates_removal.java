package arrays_wipro_exe;

import java.util.Scanner;

public class Duplicates_removal {
	
	 private static Scanner s;
	static int removeDuplicates(int arr[], int n)
	    {
	        if (n==0 || n==1)
	            return n;	      
	        int[] temp = new int[n];
	        int j = 0;
	        for (int i=0; i<n-1; i++)
	        	if (arr[i] != arr[i+1])
	                temp[j++] = arr[i];
	        
	        temp[j++] = arr[n-1];   
	         
	        
	        for (int i=0; i<j; i++)
	            arr[i] = temp[i];
	      
	        return j;
	    }
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int n;
		System.out.println("Enter the array's lenght:");
		n=s.nextInt();
		int array1[] = new int[n];
		System.out.println("Give me the elements: ");
		for(int i=0;i<n;i++) {
			array1[i]=s.nextInt();
		}
		
		 n = removeDuplicates(array1, n);
		  
	        // Print updated array
	        for (int i=0; i<n; i++)
	           System.out.print(array1[i]+" ");
		
	}
	

}
