package Stream;

import java.util.Arrays;
import java.util.List;

public class TestTarget5 {
	public static void main (String[]args) {
	  List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
	  List<String>pairs = numbers.stream().flatMap(i->numbers.stream().map(j->i+"&"+j).filter(part->{String[] part=pairs.split("\\&");
	  int first = Integer.parseInt(part[0]);
	  int second = Integer.parseInt(part[1]);
	  return first+second ==target;
	}).collect(colletion.toList());
	}

}
