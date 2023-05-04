package Question14;

import java.util.ArrayList;
import java.util.List;

public class question14 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    private List<String> list = new ArrayList<>();

	    // Method to add an element to the list
	    public void add(String element) {
	        synchronized(list) {
	            list.add(element);
	        }
	    }

	    // Method to remove an element from the list
	    public void remove(String element) {
	        synchronized(list) {
	            list.remove(element);
	        }
	    }

	    // Method to get the size of the list
	    public int size() {
	        synchronized(list) {
	            return list.size();
	        }
	    }

	    // Method to get an element from the list by index
	    public String get(int index) {
	        synchronized(list) {
	            return list.get(index);
	        }
	    

	

	}

}
