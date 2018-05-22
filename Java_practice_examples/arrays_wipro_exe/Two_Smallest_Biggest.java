package arrays_wipro_exe;

import java.util.Scanner;

public class Two_Smallest_Biggest {
	static Scanner s;
	private static int l2;
	private static int l1;
	private static int temp; 
	static void print2Smallest(int arr[])
    {
        int first, second, arr_size = arr.length;
 
        /* There should be atleast two elements */
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
 
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* If current element is smaller than first
              then update both first and second */
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and second
               then update second  */
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                               "smallest element");
        else
            System.out.println("The smallest element is " +
                               first + " and second Smallest" +
                               " element is " + second);
    }
	static void print2Biggest(int arr1[]) {
		int n = arr1.length ,temp;
            for(int i = 0; i < n; i++)
            {
                for(int j = i + 1; j < n; j++)
                {
                    if(arr1[i] < arr1[j])
                    {
                        temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            System.out.println("Largest two numbers are:"+arr1[0]+" and "+arr1[1]);
        
        
	}

	public static void main(String[] args) {
		int n;
		s=new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        if(n > 1)
        {
           
            System.out.println("Enter all the elements:");
            for(int i = 0; i < n ; i++)
            {
                a[i] = s.nextInt();
            }
	}
        else
        {
            System.out.println("Enter number greater than 1");
        }
        
        print2Smallest(a);
        print2Biggest(a);

}
}