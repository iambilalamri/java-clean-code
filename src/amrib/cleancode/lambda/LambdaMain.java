package amrib.cleancode.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {

	public static void main(String[] args) {
		consumer1();
		System.out.println();
		consumer2();
		System.out.println();
		supplier();
		System.out.println();
		function1();
		System.out.println();
		function2();
	}

	public static void predicate2() {
		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		Predicate<String> hasRightBrace = str -> str.endsWith("{");

		Predicate<String> andBraces = hasLeftBrace.and(hasRightBrace);
		boolean isAndBraces = andBraces.test("{key:value}");
		System.out.println(isAndBraces);

		Predicate<String> orBraces = hasLeftBrace.or(hasRightBrace);
		boolean isOrBraces = orBraces.test("{key:value");
		System.out.println(isOrBraces);

	}

	public static void predicate1() {
		Predicate<String> isLongerThan5 = str -> str.length() > 5;
		boolean result = isLongerThan5.test("sky");
		System.out.println(result);
	}

	public static void function2() {
		// Declarative Programming
		Function<String, String> replaceColon = str -> str.replace(":", "=");
		Function<String, String> addBraces = str -> "{" + str + "}";
		// Two ways to compose functions
		String result1 = replaceColon.andThen(addBraces).apply("key:value");
		System.out.println(result1);
		// ***********************************
		String result2 = addBraces.compose(replaceColon).apply("set:value");
		System.out.println(result2);
	}

	public static void function1() {
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
		List<Integer> intList = Arrays.asList(1, 2, 3);
		// Imperative Programming (for, if/else, switch/case)
		for (Integer item : intList)
			System.out.print(item);
		System.out.println();
		// Declarative Programming
		intList.forEach(System.out::print);
	}

	public static void consumer2() {
		List<String> intList = Arrays.asList("a", "b", "c");
		Consumer<String> print = item -> System.out.println(item);
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

		intList.forEach(print.andThen(printUpperCase).andThen(print));
	}
}
