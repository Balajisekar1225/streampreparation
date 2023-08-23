package Stream;
import java.util.Arrays;
import java.util.Optional;

public class FindMax {
     public static void main(String[] args) {
	        String[] arr = {"apple", "orange", "strawberry", "pineapple"};

	        Optional<String> maxString = Arrays.stream(arr)
	                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

	        if (maxString.isPresent()) {
	            System.out.println("The maximum string is: " + maxString.get());
	        } else {
	            System.out.println("The array is empty.");
	        }
	    }
	}



