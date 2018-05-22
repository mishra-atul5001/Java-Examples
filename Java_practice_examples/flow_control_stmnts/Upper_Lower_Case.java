package flow_control_stmnts;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Upper_Lower_Case {
	static String n;
	static int l;
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{ 
			 n = args[0];
			 l = n.length();
			 changeCase();
			 }
	 public static void changeCase()
	 {
	 char c;
	 String b = "";
	 for(int i=0;i<l;i++)
	 {
	  c = n.charAt(i);
	  if(c>=65 && c<=90)
	  b+=(char)(c+32);
	  else
	  if(c>=97 && c<=122)
	  b+=(char)(c-32);
	  else
	  b+=c;
	 }
	 System.out.println(n+"->"+b);
	 
	 }

	}
			


