package amrib.cleancode.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamMain {

	public static void main(String[] args) {
		stream1();
	}
	
	/**
	 * Ways to create stream
	 */
	private static void stream2() {
		List list = new ArrayList<>();
		list.stream();
	}

	private static void stream1() {
		List<Movie> movieList = Arrays.asList(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));
		// Imperative Programming
		int count = 0;
		for (Movie movie : movieList) {
			if (movie.getLikes() > 10) {
				count++;
			}
		}
		System.out.println(count);

		// Declarative(functional) Programming
		long counter = movieList.stream().filter(isMoreThan10Likes()).count();
		System.out.println(counter);
	}

	private static Predicate<? super Movie> isMoreThan10Likes() {
		return m -> m.getLikes() > 10;
	}

}
