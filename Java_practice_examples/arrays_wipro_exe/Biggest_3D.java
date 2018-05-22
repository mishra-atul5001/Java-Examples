package arrays_wipro_exe;

import java.util.Scanner;

public class Biggest_3D {
	 public static void main(String args[])
	   {
		 Scanner s = new Scanner(System.in);
	      int arr[][][] = new int[3][3][3];
	      int i, j, k, num=1;
		  
	      for(i=0; i<3; i++)
	      {
	          for(j=0; j<3; j++)
	          {
	              for(k=0; k<3; k++)
	              {
	                  arr[i][j][k] = s.nextInt();
	                  arr[i][j][k] = num;
	                  num++;
	              }
	          }
	      }
		  
	       for(i=0; i<3; i++)
	      {
	          for(j=0; j<3; j++)
	          {
	              for(k=0; k<3; k++)
	              {
	                  System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = " +arr[i][j][k]+ "\t");
	              }
	              System.out.println();
	          }
	          System.out.println();
	      }
	   }

}

// This program has to be solved
