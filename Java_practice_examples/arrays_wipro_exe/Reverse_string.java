package arrays_wipro_exe;

import java.util.Scanner;

public class Reverse_string {
	private static Scanner s;

	public static void main(String[] args) {
	int[][] arr=new int[2][2];
	s = new Scanner(System.in);
	System.out.println("Enter the elements of the matrix: ");
	for(int j=0;j<arr.length;j++) {
		for(int z=0;z<arr.length;z++) {
			arr[j][z]=s.nextInt();
		}
	}
	// Reversing the elements..!!
	int rows = arr.length;
    int cols = arr[0].length;
    int[][] reverse = new int[rows][cols];
    for(int i = rows-1; i >= 0; i--) {
        for(int j = cols-1; j >= 0; j--) {
            reverse[rows-1-i][cols-1-j] = arr[i][j];
        }
    }
    for(int i = 0; i < rows; i++) {
        for(int j = 0; j < cols; j++) {
            System.out.print(reverse[i][j]);
            if(j < cols-1)
                System.out.print(", ");
        }
        System.out.println();
    }
		
	}
	
	
}
