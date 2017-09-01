public class hello{
	 public static void main(String[] args) {
		System.out.println("Hello People");
		hello s = new hello();
		s.sum(5,6);
	}

	public void sum(int a,int b){
		for (int i = 0;i<=a;i++){
			int c = i+b;
			System.out.println(c);
		}
	}
	

}

