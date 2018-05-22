package strings_wipro;

public class ABC_XYZ_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc_xyz("abc","xyz");

	}
	static public String abc_xyz(String a, String b) {
		StringBuilder sb = new StringBuilder("");
		int longer = 0;
		if (a.length()>b.length()) longer = a.length();
		else longer = b.length();
		for (int i = 0; i <longer;i++){
		if (i<a.length()) sb.append(a.substring(i,i+1));
		if (i<b.length()) sb.append(b.substring(i,i+1));
		}
		System.out.println(sb);
		return sb.toString();
		
		}

}


