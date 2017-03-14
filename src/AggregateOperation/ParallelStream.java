package AggregateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5,6,7 };
		List<Integer> numbers = new ArrayList<Integer>();
		numbers = Arrays.asList(arr);
		numbers.stream().forEach(e -> System.out.print(e));
		System.out.println();
		numbers.parallelStream().forEach( e -> System.out.print(e));
		System.out.println();
		numbers.parallelStream().forEachOrdered( e -> System.out.print(e));
	}

}
