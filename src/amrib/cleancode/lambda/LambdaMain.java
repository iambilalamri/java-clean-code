package amrib.cleancode.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaMain {

	public static void main(String[] args) {
		consumer1();
		System.out.println();
		consumer2();
		System.out.println();
		supplier();
		System.out.println();
		function();
	}
	
	public static void function() {
		Function<String, Integer> map = str -> str.length();
		Integer length = map.apply("ElementB");
		System.out.println(length);
	}

	public static void supplier() {
		// Supplier<Double> getRandom = () -> {return Math.random();};
		Supplier<Double> getRandom = () -> Math.random();
		Double randomValue = getRandom.get();
		System.out.println(randomValue);

		DoubleSupplier getElement = () -> Math.random();
		Double randomElement = getElement.getAsDouble();
		System.out.println(randomElement);
	}

	public static void consumer1() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		// Imperative Programming (for, if/else, switch/case)
		for (Integer item : intList)
			System.out.print(item);
		System.out.println();
		// Declarative Programming
		intList.forEach(System.out::print);
	}

	public static void consumer2() {
		List<String> intList = new ArrayList<String>();
		intList.add("a");
		intList.add("b");
		intList.add("c");
		Consumer<String> print = item -> System.out.println(item);
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

		intList.forEach(print.andThen(printUpperCase).andThen(print));
	}
}
