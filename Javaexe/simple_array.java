import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class simple_array{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	in.nextLine();
	String[] str = in.nextLine().split(" ");
		
	int sum = 0;
	for (String s: str){
		sum += Integer.parseInt(s);
	}
	
	System.out.println(sum);
	System.out.println("Success");
}
}