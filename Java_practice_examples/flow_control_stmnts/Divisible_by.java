package flow_control_stmnts;

public class Divisible_by {
static int j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		while(j!=160) {
			for (int i=1; i<160; i++) {
				if (i%3==0 && i%5==0 && i%2==0) 
					System.out.print(i +", ");
					j=j++;
				
			}
			System.out.println("\n");
			break;
		}
	}

}
