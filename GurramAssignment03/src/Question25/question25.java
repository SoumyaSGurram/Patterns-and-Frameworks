package Question25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// Filter the names that start with 'A' and convert them to uppercase
		List<String> filteredNames = names.stream()
		                                  .filter(s -> s.startsWith("A"))
		                                  .map(String::toUpperCase)
		                                  .collect(Collectors.toList());

		// Print the filtered names
		filteredNames.forEach(System.out::println);


	}

}
