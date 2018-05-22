package strings_wipro;

import java.util.Scanner;

public class Short_long_short_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String short_string = s.nextLine();
		String long_string = s.nextLine();
		if(short_string.length()>long_string.length()) {
			long_string = short_string;
		}
		else {
			System.out.println('"'+short_string+long_string+short_string+'"');
		}

	}

}
