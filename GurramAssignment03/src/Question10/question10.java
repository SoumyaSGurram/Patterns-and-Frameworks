package Question10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class question10 {
		public static void main(String[] args) throws IOException {
			SuperClass sp = new SuperClass();
			sp.foo();
		}
	}
	class SuperClass {
	    public void foo() throws IOException {
	    	System.out.println("Super");
	    }
	}
	class SubClass extends SuperClass {
	    public void foo() throws FileNotFoundException {
	    	System.out.println("Sub");
	    }
	}



