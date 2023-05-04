package Question19;

public class question19 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    public void run() {
	        // code to be executed in the new thread
	    }
	

	// To create and start the thread:
	question19 thread = new question19();
	thread.start();

	//2.Implementing the Runnable interface:

	public class MyRunnable implements Runnable {
	    public void run() {
	        // code to be executed in the new thread
	    }
	}

	// To create and start the thread:
	MyRunnable runnable = new MyRunnable();
	Thread thread = new Thread(runnable);
	thread.start();

	}

}
