package oops_inheitance_employee;

public class Teacher {
private String name;
int salary;
String[] subject = new String[]{"Computer_Science", "Chemistry",  "English", "Other"};
	
	public Teacher(String y,int s,String[] subs)
	{
	  name = y;
	  salary=s;
	  subject=subs;
	}

	public String toString()
	{
	  return (name + " " + salary + " " + subject );
	}
}
