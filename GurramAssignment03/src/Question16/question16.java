package Question16;

import java.util.HashMap;
import java.util.Map;

public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Node<K,V> implements Map.Entry<K,V> {
		    final int hash;
		    final K key;
		    V value;
		    Node<K,V> next;

		    Node(int hash, K key, V value, Node<K,V> next) {
		        this.hash = hash;
		        this.key = key;
		        this.value = value;
		        this.next = next;
		    }

			@Override
			public K getKey() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public V getValue() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public V setValue(V value) {
				// TODO Auto-generated method stub
				return null;
			}

		    // Implementation of Map.Entry methods
		    
		}


	}


}

//Create a new HashMap with an initial capacity of 16 and a load factor of 0.75
Map<String, Integer> map = new HashMap<>(16, 0.75f);

//Add some key-value pairs to the map
map.put("one", 1);
map.put("two", 2);
map.put("three", 3);

//Get a value from the map
int value = map.get("two");

//Iterate over the entries in the map
for (Map.Entry<String, Integer> entry : map.entrySet()) {
 String key = entry.getKey();
 Integer value = entry.getValue();
 System.out.println(key + ": " + value);
}
}
}


