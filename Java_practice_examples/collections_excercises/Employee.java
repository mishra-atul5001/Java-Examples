package collections_excercises;

public class Employee {
	 /*i)EmpId Int
	 ii) EmpName String
	 iii) EmpEmail String
	 iv) EmpGender char
	 v) EmpSalary float
	 vi) GetEmployeeDetails() -> prints employee details*/
	
	int EmpId;
	String EmpName;
	String EmpEmail;
	char EmpGender;
	float EmpSalary;
	
	public Employee(int EmpId,String EmpName,String EmpEmail,char EmpGender,float EmpSalary) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.EmpEmail=EmpEmail;
		this.EmpGender=EmpGender;
		this.EmpSalary=EmpSalary;
	}
	 
	public void GetEmployeeDetails() {
		System.out.println("Id of Employee : "+EmpId);
		System.out.println("Name of Employee : "+EmpName);
		System.out.println("Email of Employee : "+EmpEmail);
		System.out.println("Gender of Employee : "+EmpGender);
		System.out.println("Salary of Employee : "+EmpSalary);
	}
	
	
}
