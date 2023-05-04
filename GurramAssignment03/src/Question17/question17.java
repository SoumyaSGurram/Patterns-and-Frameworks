package Question17;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Get an iterator for the list
        Iterator<Integer> iterator = list.iterator();

        // Fail-fast iterator
        try {
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                System.out.println(number);
                list.remove(1); // Throws ConcurrentModificationException
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: Collection was modified while iterating");
        }

        // Fail-safe iterator
        List<Integer> copyOnWriteList = new CopyOnWriteArrayList<>(list);
        iterator = copyOnWriteList.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
            copyOnWriteList.remove(1); // Does not throw exception
        }
    }



	}


