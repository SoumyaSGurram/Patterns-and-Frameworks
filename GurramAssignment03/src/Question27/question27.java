package Question27;

public class question27 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	public class SynchronizedSingleton {
		    private static question27 instance;
		    
		    private question27() {
		        // private constructor
		    }
		    
		    public static synchronized question27 getInstance() {
		        if (instance == null) {
		            instance = new question27();
		        }
		        return instance;
		    }
		


	}
