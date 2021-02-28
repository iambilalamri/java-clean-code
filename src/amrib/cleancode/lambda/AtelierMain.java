package amrib.cleancode.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class AtelierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamdba1();
	}

	public static void Lamdba1() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}

}
