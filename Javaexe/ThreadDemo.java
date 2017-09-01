class NewThread implements Runnable{
	Thread t;
	NewThread(){
		//Create a New Thread
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread: " + t);
		t.start();//starting the thread
	}
	//This is the entry point for out thread
	public void run(){
		try{
			for (int i=5;i>0 ;i-- ) {
				System.out.println("Child Thread: "+t);
				Thread.sleep(500);
			}
			}catch(InterruptedException e){
				System.out.println("Child Interrupted");
			}
			System.out.println("Exiting Child Thread");
		}
	}
	class ThreadDemo {
		public static void main(String[] args) {
			new NewThread();
			try{
				for (int i = 5;i>0 ;i-- ) {
					System.out.println("Main Thread: "+i);
					Thread.sleep(1000);
				}
			}catch (InterruptedException e) {
				System.out.println("Main Thread Interrupted");
			}
			System.out.println("Main Thread Exiting");
		}
	}





