package strings_wipro;

import java.util.Scanner;

public class Last3_repetition {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String string = sc.nextLine();
		int number = sc.nextInt();
		repeatingEnds(string,number);
		
	}
	static public String repeatingEnds(String str, int n) {

		  int len = str.length();
		  String newWord = "";
		  for (int i = 0; i < n; i++) {
		    newWord += str.substring(len - n, len);
		  }
		  System.out.println(newWord);
		  return newWord;

		}

}

