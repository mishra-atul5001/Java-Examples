package oops_inheitance;



public class Patient {
	public static void main(String args[])
	{
			Patients p = new Patients(48,5.8);
			p.Calculate_BMI();
	}
		
	}
	
	

class Patients{
	
	String name = "Anuj";
	double height_inches,weight_pound;
	
	public Patients(double w,double h) {
		height_inches=h/0.254;
		weight_pound=w*0.453592;
	}
 	void Calculate_BMI() {
		double final_heigth = height_inches * height_inches  ;
		double BMI1=( weight_pound*703 / final_heigth ); 
		
		System.out.println(BMI1);
 	}
}
		

