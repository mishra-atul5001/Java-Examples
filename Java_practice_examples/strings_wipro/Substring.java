package strings_wipro;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Wipro";
		String sub_string="";
		int length = s.length();
		for(int i=0;i<length;i++) {
			sub_string = s.substring(1, length-1);
		}
		System.out.println(sub_string);
		
	}

}
