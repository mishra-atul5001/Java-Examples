package axsaxas;

public class add_two_numbers {
	 public static void main(String[] args)
     {
           int x,y,s;

           x=Integer.parseInt(args[0]); //For user input values
           y=Integer.parseInt(args[1]); //For user input values

           s=x+y;
           System.out.println("Sum of " + x + " and " + y +" is " +s +".");
     }
}

/* In Eclipse Arguments are given under :
 *  add_two_numbers.java (Right Click) -> Run As -> Run Configuration
 *  Under parameters sections give 10 30
 *  Output : Sum of 10 and 30 is 40. 
 * */
 