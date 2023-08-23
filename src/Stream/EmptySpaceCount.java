package Stream;
import java.util.Arrays;
public class EmptySpaceCount {
public static void main(String[] args) {
	        String[] a = {"6", " ", "8", "9", "10"};

	        long count = Arrays.stream(a)
	                .filter(s -> s.equals(" ")) // Filter for empty strings
	                .count();

	        System.out.println("Number of empty spaces: " + count);
	    }
	}


