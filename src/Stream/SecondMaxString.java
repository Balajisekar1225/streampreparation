package Stream;
import java.util.Arrays;
import java.util.Comparator;
public class SecondMaxString {
	public static void main(String[] args) {
	        String[] arr = {"apple", "orange", "strawberry", "pineapple"};

	        int secondMaxLength = Arrays.stream(arr)
	                .map(String::length)
	                .distinct() // Remove duplicates
	                .sorted(Comparator.reverseOrder()) // Sort in descending order
	                .skip(1) // Skip the first element (maximum length)
	                .findFirst() // Get the second maximum length
	                .orElse(-1); // Default value if not found

	        System.out.println("Second maximum string length: " + secondMaxLength);
	        
	}
}
	

