package oops_inheitance_employee;

public class Employee extends Person {
	double salary;
	 int year;
	 String insurance_number;

	 public Employee(double s,int y,String n) {
		super(n);
		// TODO Auto-generated constructor stub
	salary=s;
	year=y;
	insurance_number=n;
	 }	 

	  public String toString()
	  {
	    return "Employee: " + "Salary = Rs" + salary + ",Year = " + year + ",Insurance Number = " + insurance_number;
	  }
}
