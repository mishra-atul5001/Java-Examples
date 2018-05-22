package collections_excercises;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Print_Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating array list here..!!
ArrayList<String> array_str = new ArrayList<String>();
array_str.add("Suyash");
array_str.add("Mokho");
array_str.add("Roy");
array_str.add("Pira");
array_str.add("Uday");
// Using Iterator here..!!
java.util.Iterator<String> itr = array_str.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
