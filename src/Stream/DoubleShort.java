package Stream;
import java.util.ArrayList;
import java.util.List;
public class DoubleShort {
	public static void main(String[] args) {
	        // Create an unsorted list
	        List<Integer> list = new ArrayList<>();
	        list.add(5);
	        list.add(2);
	        list.add(9);
	        list.add(1);
	        list.add(5);

	        // Sort the list using Bubble Sort
	        int n = list.size();
	        boolean swapped;
	        do {
	            swapped = false;
	            for (int i = 1; i < n; i++) {
	                if (list.get(i - 1) > list.get(i)) {
	                    // Swap the elements
	                    int temp = list.get(i - 1);
	                    list.set(i - 1, list.get(i));
	                    list.set(i, temp);
	                    swapped = true;
	                }
	            }
	            n--;
	        } while (swapped);

	        // Print the sorted list
	        for (int num : list) {
	            System.out.print(num + " ");
	        }
	    }
	}



