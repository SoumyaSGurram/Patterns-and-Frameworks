package Question4;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    private void privateMethod() {
	        System.out.println("Superclass private method");
	    }

	    public static void staticMethod() {
	        System.out.println("Superclass static method");
	    }
	}

	class Subclass extends question4 {
	    // This is not an overridden method, but a new method with the same name
	    private void privateMethod() {
	        System.out.println("Subclass private method");
	    }

	    // This is not an overridden method, but a new method that hides the superclass's static method
	    public static void staticMethod() {
	        System.out.println("Subclass static method");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	    	question4 obj1 = new Subclass();
	        obj1.privateMethod(); // Output: Superclass private method
	        obj1.staticMethod(); // Output: Superclass static method

	        Subclass obj2 = new Subclass();
	        obj2.privateMethod(); // Output: Subclass private method
	        obj2.staticMethod(); // Output: Subclass static method
	    }
	}


	}

}
