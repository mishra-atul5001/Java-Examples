package collections_excercises;

import java.util.ArrayList;

public class Exer_5_Employee {
	int EmpId;
	double EmpSalary;
	String Empaddress;
	String Empname;
	 ArrayList al = new ArrayList();
	
	 Exer_5_Employee() {
			
		}
	public Exer_5_Employee(int id,String name,String address,double salary) {
		this.EmpId=id;
		this.EmpSalary=salary;
		this.Empname=name;
		this.Empaddress=address;
		
	}
	
	public Exer_5_Employee getDetails(ArrayList<Exer_5_Employee> myList) {
		// TODO Auto-generated method stub
		
		Exer_5_Employee es = (Exer_5_Employee)al.get(EmpId);
		return es;
	}
	public ArrayList getDetailsforlist(ArrayList<Exer_5_Employee> myList) {
		// TODO Auto-generated method stub
		return(myList);
	}

}
