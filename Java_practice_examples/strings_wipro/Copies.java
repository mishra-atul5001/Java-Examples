package strings_wipro;

public class Copies {
	static String result="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun_copies("Wipro");
		System.out.println(result);
		
	}
	public static String fun_copies(String str) {
		
		if(str.length()<=2) result=str+str+str;
		else{
		String k=str.substring(0,2);
		for(int i=0;i<str.length();i++) {
			result=result+k;
		}
		}
		return result;
		}
}
