import java.util.*;


class ArrayDemo{
	public static void main(String[] args) {
		
		//Allocate and Initialize Array
		int array[] = new int[10];
		for (int i =0;i<10 ;i++ ) {
			array[i]=-3*i;
		}
		//Display,sort and Dsiplay the array
		System.out.println("Original Contents : " );
		display(array);
		Arrays.sort(array);
		System.out.println("Sorted : ");
		display(array);

		//Sort and Display
		Arrays.fill(array,2,6,-1);
		System.out.println("After filling : ");
		display(array);

		//Again Sorting
		Arrays.sort(array);
		System.out.println("Again Soring Gives : ");
		display(array);
		
		//Binary Search for -12
		System.out.println("-12 is at Location : ");
		int indexx = Arrays.binarySearch(array,-12);
		System.out.println(indexx);
	}
	static void display(int array[]){
			for (int i: array ) {
				System.out.println(i+"  ");
			}
			System.out.println();
		}

	
}