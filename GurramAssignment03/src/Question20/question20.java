package Question20;

public class question20 {

	    public static void main(String[] args) throws InterruptedException {
	        Thread thread = new Thread(() -> {
	            System.out.println("Thread is running.");
	            try {
	                Thread.sleep(5000); // Simulate some work
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        System.out.println("Thread state: " + thread.getState()); // NEW
	        thread.start();
	        System.out.println("Thread state: " + thread.getState()); // RUNNABLE

	        Thread.sleep(1000);
	        System.out.println("Thread state: " + thread.getState()); // TIMED_WAITING

	        Thread.sleep(4000);
	        System.out.println("Thread state: " + thread.getState()); // TERMINATED
	    }
	

		
		
	}


