package flow_control_stmnts;

public class Sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, sum = 0,cache;
        m = Integer.parseInt(args[0]);
        cache = m;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println(cache+"->"+sum);
	}

}
