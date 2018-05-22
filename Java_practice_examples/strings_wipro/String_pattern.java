package strings_wipro;

import java.util.Scanner;

public class String_pattern {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		int count1 = sc.nextInt();
		repeatSeparator(word1,word2,count1);
		
	}
static	public String repeatSeparator(String word, String sep, int count) {    
	    StringBuffer buffer = new StringBuffer();

	    while (count > 0) {
	        buffer.append(word);
	        count--;
	        if (count > 0) {
	            buffer.append(sep);
	        }
	    }
	    System.out.println(buffer);
	    return buffer.toString(); 
	    
	}
	
}
