/**
 * 
 */
package arrays_wipro_exe;

import java.util.Scanner;

/**
 * @author mishr
 *
 */
public class ignore_number {

	private static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p,sum=0;
		input = new Scanner(System.in);
		n=input.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==6) {
				p=j;
			for(;p<arr.length;p++) {
				if(arr[p]==7) 
					break;}
				j=p;}		
			else 
				sum=sum+arr[j];
			
		
			
		}
		System.out.println(sum);
		
		
	}

}
