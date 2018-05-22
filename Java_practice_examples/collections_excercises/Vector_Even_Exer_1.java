package collections_excercises;

import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Vector_Even_Exer_1 {
	Vector<Integer> myList1 = new Vector<Integer>();
	Vector<Integer> myList2 = new Vector<Integer>();
	int number=0;
		public Vector<Integer> saveEvenNumbers(int n) {
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
		public Vector<Integer> printEvenNumbers() {
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
