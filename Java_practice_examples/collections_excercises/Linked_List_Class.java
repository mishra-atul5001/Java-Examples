package collections_excercises;

import java.util.LinkedList;

public class Linked_List_Class {
LinkedList<Integer> myList1 = new LinkedList<Integer>();
LinkedList<Integer> myList2 = new LinkedList<Integer>();
int number=0;
	public LinkedList<Integer> saveEvenNumbers(int n) {
		int limit = n;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				myList1.add(i);
			}else {
				continue;
			}
		}
		return(myList1);
	}
	public LinkedList<Integer> printEvenNumbers() {
		int num=2;
		for(int i =0;i<myList1.size();i++) {
			myList2.add(myList1.get(i)*2);
		}
		return(myList2);
	}
	public int printEvenNumber(int n) {
		int found=n;
		for(int i=0;i<myList1.size();i++) {
			if(myList1.contains(found)) {
				number=found;
			}else {
				number=0;
			}
		}
		return(number);
	}

}
