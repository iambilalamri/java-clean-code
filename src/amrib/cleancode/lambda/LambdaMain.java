package amrib.cleancode.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaMain {

	public static void main(String[] args) {
		consumer1();
		System.out.println();
		consumer2();
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
