package collections_excercises;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(3,2);
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Float(9.4));
		System.out.println("Vector Demo to Store Objects and Display them using Enumeration and Iteration..!!");
		System.out.println();
		System.out.println("Displaying Items using Enumeration..!!");
		Enumeration eNum = v.elements();
		while(eNum.hasMoreElements()) {
			System.out.println(eNum.nextElement()+" ");
		}
		System.out.println("Displaying via Iteration..!!");
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}

}
