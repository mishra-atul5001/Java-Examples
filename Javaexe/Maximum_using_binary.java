
import java.io.*;
import java.util.Random;

public class Maximum_using_binary {
	static int n=20;
	static int[] sequence = new int[n];
	public static void sort(){
		int i,j,temp;
		for (i=1;i<n ;i++ ) {
			j=i;
			temp = sequence[i];
			while(j > 0 && temp <sequence[j-1]){
				sequence[j]=sequence[j-1];
				j=j-1;
			}
			sequence[j]=temp;
		}
	}
	public static void main(String[] args) {
	 Random random = new Random();
for (int k = 0 ; k < n ; k++){
	 sequence[k]=Math.abs(random.nextInt(100));
	}
	 System.out.println("Sequence is:");
	
	 for (int k = 0 ; k < n ; k++){
	 	System.out.println(sequence[k] + " ");
	 	sort();
	 }
	 	System.out.println("Mximum number is :" + sequence[n-1]);
	 
	}
	
}