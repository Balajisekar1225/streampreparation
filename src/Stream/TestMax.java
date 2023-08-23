package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestMax {
	public static void main (String[]args) {
		List<Integer> li = Arrays.asList(10,20,30,40,10,50);
		Optional<Integer> maxNumber = li.stream().max(Integer::compareTo);
		if(maxNumber.isPresent()) {
			System.out.println("Max Number"+ maxNumber);
		}
		Optional<Integer> minNumber = li.stream().min(Integer::compareTo);
		if(minNumber.isPresent()) {
			System.out.println("Min Number"+minNumber);
		}
		int secondLaragest = li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Largest"+secondLaragest);
	}

}
