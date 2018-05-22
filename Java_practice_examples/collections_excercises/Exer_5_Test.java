package collections_excercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer_5_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Exer_5_Employee> myList = new ArrayList<Exer_5_Employee>();
		Exer_5_Employee exer = new Exer_5_Employee();
		Exer_5_Employee ex1 = new Exer_5_Employee(181,"Pranjal","Lko",25000.0);
		myList.add(ex1);
		Exer_5_Employee ex2 = new Exer_5_Employee(182,"Satya","Chennai",22000.0);
		myList.add(ex2);
		Exer_5_Employee ex3 = new Exer_5_Employee(183,"Pankaj","Vizag",27000.0);
		myList.add(ex3);
		Exer_5_Employee ex4 = new Exer_5_Employee(184,"Satvik","Hyderabad",15000.0);
		myList.add(ex4);
		Exer_5_Employee ex5 = new Exer_5_Employee(185,"Uday","Delhi",18000.0);
		myList.add(ex5);
		exer.getDetailsforlist(myList);
		//System.out.println(ex1.display());
		System.out.println("Enter Id Number b/w 181 to 185: ");
		int number = input.nextInt();
		while(true) {
		boolean flag = false;
		for(int i=0; i<=myList.size();i++)	{
			Exer_5_Employee es = exer.getDetails(myList);
		if(number == es.EmpId)
		{
		System.out.println("The details of the employee with id " +number +" is: ");
		System.out.print(es.EmpId +" " +es.Empname+" " +es.Empaddress+" "+es.EmpSalary);
		flag = true;
		break;
		}
		}
		System.out.println(" ");
		if(!flag)
		{
		System.out.println("Sorry, no data exists with the id " +number);
		}
		System.out.println(" ");
	}
	}
}
