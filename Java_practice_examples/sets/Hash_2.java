package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Hash_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> EmployeeNameString = new HashSet<String>();
		 EmployeeNameString.add("Abhinav");
		 EmployeeNameString.add("Suyash");
		 EmployeeNameString.add("Mokho");
		 EmployeeNameString.add("Chayan");
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter Name to add to the Set..!!: ");
		 String first_name = input.nextLine();
		 EmployeeNameString.add(first_name);
		 Iterator itr = EmployeeNameString.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next()+" ");
		 }
	
	}

}
