package collections_excercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Even {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	int number = 0;
	public ArrayList saveEvenNumber(int N) {
		int limit = N;
		for(int i =0;i<=limit;i++) {
			if(i%2==0) {
				a1.add(i);
			}else {
				continue;
			}
		}
		return(a1);
	}
	public ArrayList printEventNumber() {
		int num=2;
		for(int i =0;i<a1.size();i++) {			
			a2.add(a1.get(i)*2);
		}
		return(a2);
	}
	public int printEvenNumber(int N) {
		int found = N;
		
		for(int i=0;i<=a1.size();i++) {
			if(a1.contains(found)) {
				number=found;
			}else {
				number=0;
			}
		}
		return number;
	}

}
