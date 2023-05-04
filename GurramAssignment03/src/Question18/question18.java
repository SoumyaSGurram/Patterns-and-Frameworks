package Question18;

public class question18 extends Thread{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    public void run() {
		        System.out.println("Thread is running.");
		    }

		    public static void main(String[] args) {
		        Thread thread = new question18();
		        thread.start();
		        thread.start(); // Attempt to start the thread again

		        System.out.println("Main thread is running.");
		    }
		


	}


