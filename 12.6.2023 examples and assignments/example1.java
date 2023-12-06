package example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class example1 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
		Collection<Integer> initialListOfNumbers = numbers;
		initialListOfNumbers.stream().map(x -> x * x).forEach(y -> System.out.println(y));
}
}
