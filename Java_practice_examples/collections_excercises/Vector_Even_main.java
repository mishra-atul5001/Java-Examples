package collections_excercises;

import java.util.Scanner;

public class Vector_Even_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector_Even_Exer_1 llc = new Vector_Even_Exer_1();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit please..!!");
		int limit = input.nextInt();
		llc.saveEvenNumbers(limit);
		System.out.println("My Vector List 1: ");
		System.out.println(llc.myList1);
		llc.printEvenNumbers();
		System.out.println("My Vector List 2: ");
		System.out.println(llc.myList2);
		System.out.println("Enter Number to Check in Above Lists..!!");
		int num = input.nextInt();
		llc.printEvenNumber(num);
		System.out.println(llc.number);
	}

}
