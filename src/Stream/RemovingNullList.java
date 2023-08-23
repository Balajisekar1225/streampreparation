package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RemovingNullList {

	    public static void main(String[] args) {
	        // Create an ArrayList with some null elements
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Item 1");
	        arrayList.add(null);
	        arrayList.add("Item 2");
	        arrayList.add(null);
	        arrayList.add("Item 3");

	        // Remove null elements using Java Streams
	        List<String> filteredList = arrayList.stream()
	                .filter(element -> element != null)
	                .collect(Collectors.toList());

	        // Print the filtered list
	        System.out.println("Original ArrayList: " + arrayList);
	        System.out.println("Filtered ArrayList: " + filteredList);
	    }
	}



