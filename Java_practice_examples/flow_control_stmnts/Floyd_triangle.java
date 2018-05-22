package flow_control_stmnts;

public class Floyd_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int Rows = Integer.parseInt(args[0]);
        if(args.length==0) {
        	System.out.println("Please Enter an Integer");
        }
        for (int i = 1; i <= Rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
