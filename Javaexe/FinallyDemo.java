class FinallyDemo{
	//Through an Exception out of Method
	static void procA(){
		try{
			System.out.println("Inside procA");
			throw new RuntimeException("demo");
		}
		finally{
			System.out.println("procA's Finally block");
		}
	}
	//Return from within a Try Block
	static void procB(){
	try{
		System.out.println("Inside procB");
		return;
	}
	finally{
		System.out.println("procB's Finally Block");
	}
}
//Executing try-block normally
	static void procC(){
		try{
			System.out.println("Inside procC");
		}
		finally{
			System.out.println("procC's Finally Block");
		}
	}
	public static void main(String[] args) {
		try{
			procA();
		}
		catch (Exception e) {
		System.out.println("Exception Caught");	
		}
		procB();
		procC();
	}
}