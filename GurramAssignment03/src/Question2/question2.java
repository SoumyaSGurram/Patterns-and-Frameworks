package Question2;

public class question2 {
	protected void method() {
        System.out.println("Superclass method");
    }
}

class Subclass extends question2 {
    public void method() {
        System.out.println("Subclass method");
    }
}

public class Main {
    public static void main(String[] args) {
        Superclass su = new Subclass();
        su.method();  
}
}


}
