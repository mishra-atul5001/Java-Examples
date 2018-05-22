package flow_control_stmnts;

import java.util.Scanner;

public class Args_or_No_Args {
	
	private static Scanner s;
	
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int z=n+1;
		String[] arr1 = new String[z];
		for(int i=0;i<z;i++) {		 
			 arr1[i]=s.nextLine();
			
		}
		for(int j=0;j<z;j++) {
			System.out.print(arr1[0]+" ");
			
			if(arr1.length>1) {
				System.out.print(arr1[j]);
			}
			else {
				System.out.println("No Value");
			}
			
			
		}
		
	}
}
