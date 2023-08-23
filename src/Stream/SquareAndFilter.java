package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndFilter {

	
	    public static void main(String[] args) {
	        // Create an ArrayList with some numbers
	        List<Integer> arrayList = new ArrayList<>();
	        arrayList.add(4);
	        arrayList.add(7);
	        arrayList.add(10);
	        arrayList.add(5);
	        arrayList.add(3);
	        arrayList.add(8);

	        // Square the elements and filter for values greater than 20 using Java Streams
	        List<Integer> result = arrayList.stream()
	                .map(num -> num * num) // Square each element
	                .filter(num -> num > 20) // Filter for values greater than 20
	                .collect(Collectors.toList());

	        // Print the result
	        result.forEach(System.out::println);
	    }
	}



