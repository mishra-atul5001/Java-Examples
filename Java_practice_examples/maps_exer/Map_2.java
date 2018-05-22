package maps_exer;

import java.util.HashMap;
import java.util.Map;

public class Map_2 {
	static Map<String,String> M1 = new HashMap<String,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        M1.put("HDFC", "Housing Development Finance Corporation");
        M1.put("ICICI", " Industrial Credit and Investment Corporation of India Limited");
        M1.put("IDBI", "Industrial Development Bank of India");
        M1.put("SBI", "State Bank of India");
        
        boolean blnkeyexists = M1.containsKey("AXIS");
        boolean blnkeyexists1 = M1.containsKey("SBI");
        boolean blnvalueexists = M1.containsValue("State Bank of India");
        System.out.println("State Bank of India as Value exists..!!?? : "+blnvalueexists);
        System.out.println("SBI there as a Key..!!?? : "+ blnkeyexists1);
        System.out.println("AXIS present there..!!?? : "+ blnkeyexists);
        System.out.println("Iteration Printing..!!");
        for (Map.Entry<String,String> entry : M1.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	}

}
