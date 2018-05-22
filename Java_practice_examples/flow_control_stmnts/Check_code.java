package flow_control_stmnts;

public class Check_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] color_code = new char[6];
		color_code[0] = 'R';
		color_code[1] = 'B';
		color_code[2] = 'Y';
		color_code[3] = 'O';
		color_code[4] = 'W';
		color_code[5] = 'G';
		
		char get_code = args[0].charAt(0);
		switch(get_code) {
		case 'R' : 
			System.out.println("Red");
			break;
		case 'B' : 
			System.out.println("Blue");
			break;
		case 'Y' : 
			System.out.println("Yellow");
			break;
		case 'G' : 
			System.out.println("Green");
			break;
		case 'W' : 
			System.out.println("White");
			break;
		case 'O' : 
			System.out.println("Orange");
			break;
			default:
				System.out.println("Invalid Code");
			
		}
		
	}

}
