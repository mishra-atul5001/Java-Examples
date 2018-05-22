package oops_inheitance_employee;
class Test {
	public static void main(String[] args) {
		CollegeStudent student = new CollegeStudent("CSE","JAVA","Last Sem");
		student.display();
		
		
	}
}
class CollegeStudent extends Student {
	String branch;
	String major;
	String current_level;

	public CollegeStudent(String b,String m,String y) {
		super(y);
		// TODO Auto-generated constructor stub
		branch=b;
		major=m;
		current_level=y;
	}
	 public String display() {
		 System.out.println('"'+branch+'"'+","+'"'+major+'"'+","+'"'+current_level+'"');
		 return branch+major+current_level;
		 
		
	}

}