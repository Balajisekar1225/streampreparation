package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
	        String[] a = {"Balaji", "Prakash", "Devi", "Priya","anu","Rajasree"};
	        int[] b = {0, 1, 0, 0,2,0};
            String[] result = IntStream.range(0, a.length)
	                .boxed()
	                .sorted(Comparator.comparingInt(i -> b[i]))
	                .map(i -> a[i])
	                .toArray(String[]::new);

	        System.out.println(Arrays.toString(result));
	    }
	}


