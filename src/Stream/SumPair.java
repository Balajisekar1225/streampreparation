package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SumPair {
	public static void main(String[] args) {
	       List<Integer> a = new ArrayList<>();
	        a.add(1);
	        a.add(2);
	        a.add(3);
	        a.add(4);
	        a.add(5);
	        a.add(6);
	        a.add(7);
	        a.add(8);
	        a.add(9);

	        int targetSum = 5;

	        List<String> pairs = IntStream.range(0, a.size() - 1)
	                .mapToObj(i -> a.get(i) + "+" + a.get(i + 1) + "=" + (a.get(i) + a.get(i + 1)))
	                .filter(pair -> a.get(a.indexOf(Integer.parseInt(pair.substring(0, 1))) + 1) + 
	                                a.get(a.indexOf(Integer.parseInt(pair.substring(2, 3)))) == targetSum)
	                .collect(Collectors.toList());

	        pairs.forEach(System.out::println);
	    }
	}


