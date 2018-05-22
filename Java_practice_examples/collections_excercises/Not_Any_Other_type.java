package collections_excercises;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Not_Any_Other_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Comparable> list = new ArrayList<Comparable>();
list.add("String here..!!");
list.add(1);
list.add(2.5f);
list.add(20.0);
Iterator itr = list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
