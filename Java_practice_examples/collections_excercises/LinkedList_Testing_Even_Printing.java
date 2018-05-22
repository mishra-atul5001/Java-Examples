package collections_excercises;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Testing_Even_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_Class llc = new Linked_List_Class();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit please..!!");
		int limit = input.nextInt();
		llc.saveEvenNumbers(limit);
		System.out.println("My Linked List 1: ");
		System.out.println(llc.myList1);
		llc.printEvenNumbers();
		System.out.println("My Linked List 2: ");
		
		System.out.println(llc.myList2);
		System.out.println("Enter Number to Check in Above Lists..!!");
		int num = input.nextInt();
		llc.printEvenNumber(num);
		System.out.println(llc.number);
	}

}
