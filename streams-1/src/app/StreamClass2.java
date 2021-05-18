package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);

		System.out.println(Arrays.toString(st1.toArray()));
		
		// somando todos os valores do array com reduce
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
			.filter( x -> x % 2 == 0)
			.map( x -> x * 10)
			.collect(Collectors.toList());
		
		System.out.println("new list = " + Arrays.toString(newList.toArray()));

	}

}
