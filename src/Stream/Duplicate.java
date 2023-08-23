package Stream;
import java.util.Arrays;
public class Duplicate {
	


	    public static void main(String[] args) {
	        String[] arrayWithDuplicates = {"apple", "banana", "apple", "cherry", "banana"};
	        String[] arrayWithoutDuplicates = {"apple", "banana", "cherry"};

	        boolean hasDuplicates1 = hasDuplicates(arrayWithDuplicates);
	        boolean hasDuplicates2 = hasDuplicates(arrayWithoutDuplicates);

	        System.out.println("Given string has duplicates: " + hasDuplicates1); // Output: true
	        System.out.println("Given string has duplicates: " + hasDuplicates2); // Output: false
	    }

	    public static boolean hasDuplicates(String[] array) {
	        return Arrays.stream(array)
	                .distinct()
	                .count() != array.length;
	    }
	}


