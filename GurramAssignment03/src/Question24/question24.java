package Question24;

public class question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Create some objects
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Set references to null to make them eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Explicitly call the garbage collector
        System.gc();
    }


	}


