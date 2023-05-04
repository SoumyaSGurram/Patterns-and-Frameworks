package Question15;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Hashtable does not allow null keys or values
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", null); // Throws a NullPointerException
        hashtable.put(null, "value3"); // Throws a NullPointerException

        // HashMap allows null keys and values
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", null); // OK
        hashMap.put(null, "value3"); // OK

        // Hashtable is synchronized
        Map<String, String> synchronizedHashtable = Collections.synchronizedMap(hashtable);

        // HashMap can be made synchronized
        Map<String, String> synchronizedHashMap = Collections.synchronizedMap(hashMap);
    }



	}


