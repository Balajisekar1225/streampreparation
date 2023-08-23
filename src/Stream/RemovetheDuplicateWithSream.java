package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovetheDuplicateWithSream {
	 public static void main(String[] args) {
	        // Create an ArrayList with duplicate elements
	        List<Integer> arrayList = new ArrayList<>();
	        arrayList.add(4);
	        arrayList.add(7);
	        arrayList.add(4);
	        arrayList.add(10);
	        arrayList.add(5);
	        arrayList.add(7);

	        // Remove duplicates and print unique elements using Java Streams
	        List<Integer> uniqueList = arrayList.stream()
	                .distinct() // Remove duplicates
	                .collect(Collectors.toList());

	        // Print the unique elements
	        uniqueList.forEach(System.out::println);
	    }
	}


