package Question3;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question3 getAnimal() {
	        System.out.println("Animal class method");
	        return new question3();
	    
	}
	}

	class Dog extends question3 {
	    @Override
	    public Dog getAnimal() {
	        System.out.println("Dog class method");
	        return new Dog();
	    

}
}
}

