package flow_control_stmnts;

public class InterestDisplay {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		char male = 'M';
		char female ='F';
		char get_gender = args[0].charAt(0);
		int age = Integer.parseInt(args[1]);
		
		if(get_gender==male && age<=60) {
			System.out.println("9.2%");
		}
		else if(get_gender==female && age<=60) {
			System.out.println("8.2%");
		}
		else if(get_gender==male && (age>60 && age<=120)) {
			System.out.println("8.3%");
		}
		else if(get_gender == female && (age>60 && age<=120)) {
			System.out.println("7.6%");
		}
		else
		{
			System.out.println("Wrong informartion sorry");
		}
		
		

	}

}
