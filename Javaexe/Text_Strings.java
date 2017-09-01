class Text_Strings{
	public static void main(String[] args) {
		EQUALS eq = new EQUALS();
		eq.stringmanipulation();
		eq.indexingstringds();
		eq.bufferoperations();
	}
	
}
class EQUALS{
	public void stringmanipulation(){
	System.out.println("\n<--- This is String Manipulations Method --->" + "\n");
	String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Good-Bye";
		String s4 = "HELLO";
		System.out.println(s1+" equals " + s2+" --> " + s1.equals(s2));
		System.out.println(s1+" equals " + s3+" --> " + s1.equals(s3));
		System.out.println(s1+" equals " + s4+" --> " + s1.equals(s4));
		System.out.println(s1+" equalsIgnoreCase " + s2+" --> " + s1.equalsIgnoreCase(s2));
		}
	public void indexingstringds(){
	    System.out.println("\n<--- This is String Indexing Method --->" + "\n");
		String s = "Now is the time for All Good Men "+"to come to the aid of their Country.";
		System.out.println(s);
		System.out.println("indexOf(t) = "+s.indexOf('t'));
		System.out.println("lastIndexOf(t) = "+s.lastIndexOf('t'));
		System.out.println("indexOf(the) = "+s.indexOf("the"));
		System.out.println("lastIndexOf(t) = "+s.lastIndexOf("the"));
		System.out.println("indexOf(t,10) = "+s.indexOf('t',10));
		System.out.println("lastIndexOf(t,60) = "+s.lastIndexOf('t',60));
		System.out.println("indexOf(the,10) = "+s.indexOf("the",10));
		System.out.println("lastIndexOf(the,60) = "+s.lastIndexOf("the",60));
	}	
	public void bufferoperations(){
		System.out.println("\n<--- This is String Buffer Operations Method --->"+"\n");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Buffer = " + sb);
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = =" + sb.capacity());
		//String Buffers can be reversed....so to reverse a String..Store it in String Buffer and apply reverse
		sb.reverse();
		System.out.println(sb);
	}
}