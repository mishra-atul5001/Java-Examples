package flow_control_stmnts;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int cache=n;
		int rev=0;
		 while(n != 0)
	      {
			 rev = rev * 10;
			 rev = rev + n%10;
	          n = n/10;
	      }
		 System.out.println(rev);

	}

}
