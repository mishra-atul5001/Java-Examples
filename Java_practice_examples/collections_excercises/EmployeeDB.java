package collections_excercises;

import java.util.ArrayList;

public class EmployeeDB {
/*
 * i) boolean addEmployee(Employee e) 
ii) boolean deleteEmployee(int empId) 
iii) String showPaySlip(int empId) 
iv) Employee[] listAll() 
 */
	
	public boolean addEmployee(Employee e) {
		System.out.println("Array List is being used.");
		ArrayList<Employee> arr = new ArrayList<Employee>();
		return arr.add(e);
	}
	
}
