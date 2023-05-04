package Question9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question9 {
	
	try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
		   String line;
while ((line = br.readLine()) != null) {
			 System.out.println(line);
		 }
} catch (IOException e) {
	   System.err.println("Error reading file: " + e.getMessage());
}
}
}



