package sets;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreesSet_Example {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> string = new TreeSet<String>();
		Set<String> setString = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..!!");
		String str = sc.nextLine();
		string.add(str);
		setString.add(str);
		Iterator<String> itr = string.iterator();		
		while(itr.hasNext()) {
			System.out.println("Printing while Iteration..!!");
			System.out.println(itr.next());			
		}
		System.out.println("Enter the Character to find..!!");
		String find = sc.nextLine();
		if(setString.contains(find)) {
			System.out.println ("Yes it is Present..!!");
		}
		else {
			System.out.println("Sorry not found..!!");	
		}	
	}

}