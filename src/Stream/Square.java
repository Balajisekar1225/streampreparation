package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Square {
	public static void main (String[]args) {
		List<String>a =Arrays.asList("a","b","c","d","e","f","g","h");
		//System.out.println(a.get(0).charAt(0));
		//String[] c = {"0","1","1","0","1","2","2","0"};
		List<String>b =Arrays.asList("01101220");
		//String bstring = b.get(0);
		//System.out.println(bstring.charAt(0)-'0');
		//String[]result = IntStream.range(0,a.length).boxed().sorted(Comparator.comparing(i->b[i])).map(i->a[i]).toArray(String[]::new);
		//System.out.println(Arrays.toString(result));
		

		         //Create a map to associate each character in 'a' with its position in 'b'
		       Map<Character,Integer> charToPosition = new HashMap<>();
		       String bString = b.get(0);
		       for (int i = 0; i < a.size(); i++) {
		            charToPosition.put(a.get(i).charAt(0), bString.charAt(i) - '0');
		        }
		        

		        // Sort list 'a' based on the positions in 'b'
		      Collections.sort(a, (s1, s2) -> charToPosition.get(s1.charAt(0)) - charToPosition.get(s2.charAt(0)));
		      

		        // Convert the sorted list to a List<String>
		       List<String> sortedList = new ArrayList<>(a);

		       System.out.println(sortedList);
		    }
		

	}


