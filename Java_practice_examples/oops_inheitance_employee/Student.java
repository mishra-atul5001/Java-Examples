package oops_inheitance_employee;

public class Student extends Person {
	String name;
	public Student(String y) {
		super(y);
		// TODO Auto-generated constructor stub
		name = y;
	}

	public String display() {
		return name;
	}
	
}
