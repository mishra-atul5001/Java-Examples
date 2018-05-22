package strings_wipro;

import java.util.Scanner;

public class Ending_Words {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str_word = sc.nextLine();
		wordEnding(str1,str_word);

	}
static	public String wordEnding(String str, String word) {

		  int slen = str.length();
		  int wlen = word.length();
		  String fin = "";
		  for (int i = 0; i < slen-wlen+1; i++) {
		    String tmp = str.substring(i,i+wlen);
		    if (i > 0 && tmp.equals(word))
		      fin += str.substring(i-1,i);
		    if (i < slen-wlen && tmp.equals(word))
		      fin += str.substring(i+wlen,i+wlen+1);
		  }
		  System.out.println(fin);
		  return fin;
		}

}
