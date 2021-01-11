package amrib.cleancode.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		stream1();
		System.out.println("***********");
		createStream();
		System.out.println("***********");
		flatMapStream();
		System.out.println("***********");
		filterStream();
		System.out.println("***********");
		sortingStream();
	}

	// ############_MANAGE_STREAMS_####################

	private static void peekingElement() {
		var movieList = List.of(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));
		movieList.stream().filter(m -> m.getLikes() > 10).peek(m -> System.out.println("filtered:" + m.getTitle()))
				.map(m -> m.getTitle()).peek(t -> System.out.println("Mapped:" + t)).forEach(System.out::println);
	}

	private static void uniqueElement() {
		var movieList = List.of(new Movie("a", 10), new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));
		movieList.stream().map(Movie::getLikes).distinct().forEach(like -> System.out.println(like));

	}

	private static void sortingStream() {
		var movieList = List.of(new Movie("b", 10), new Movie("a", 30), new Movie("c", 20));
		movieList.stream().sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
				.forEach(m -> System.out.println(m.getTitle()));
		// .sorted(Comparator.comparing(Movie::getTitle))
		// .sorted()

	}

	private static void sliceStream() {
		var movieList = List.of(new Movie("a", 10), new Movie("b", 30), new Movie("c", 20));

		// limit(n)
		movieList.stream().limit(2).forEach(m -> System.out.println(m.getTitle())); // a, b

		// skip(n)
		movieList.stream().skip(2).forEach(m -> System.out.println(m.getTitle())); // c

		// takeWhile(predicate): une fois la condition est faux, on arrete
		movieList.stream().takeWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle())); // a

		// dropWhile(predicate)
		movieList.stream().takeWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle())); // b, c

	}

	private static void filterStream() {
		var movieList = List.of(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));
		Predicate<Movie> isPopular = m -> m.getLikes() > 10;
		movieList.stream().filter(isPopular).forEach(m -> System.out.println(m.getTitle()));
	}

	private static void flatMapStream() {
		var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
		// Conversion from Stream<List<x>> -> Stream<x>
		stream.flatMap(list -> list.stream()).forEach(System.out::println);
		// stream.forEach(list -> System.out.println(list));
	}

	private static void mapStream() {
		var movieList1 = Arrays.asList(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));
		movieList1.stream().map(m -> m.getTitle()).forEach(System.out::println);
		movieList1.stream().mapToInt(m -> m.getLikes()).forEach(System.out::println);

	}

	/**
	 * Ways to create stream
	 */
	private static void createStream() {
		// Number 1
		System.out.println("***********");
		var list = new ArrayList<>();
		list.stream();

		// Number 2
		System.out.println("***********");
		int[] numbers = { 1, 2, 3 };
		Arrays.stream(numbers).forEach(System.out::println);

		// Number 3
		System.out.println("***********");
		Stream.of(1, 2, 3, 4);

		// Number 4
		System.out.println("***********");
		var stream1 = Stream.generate(() -> Math.random());
		stream1.limit(3).forEach(System.out::println);

		// Number 5
		System.out.println("***********");
		var stream2 = Stream.iterate(1, n -> n + 1);
		stream2.limit(8).forEach(System.out::println);
	}

	private static void stream1() {
		var movieList = List.of(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));

		// Imperative Programming
		System.out.println("***********");
		int count = 0;
		for (Movie movie : movieList) {
			if (movie.getLikes() > 10) {
				count++;
			}
		}
		System.out.println(count);

		// Declarative(functional) Programming
		System.out.println("***********");
		long counter = movieList.stream().filter(isMoreThan10Likes()).count();
		System.out.println(counter);
	}

	private static Predicate<? super Movie> isMoreThan10Likes() {
		return m -> m.getLikes() > 10;
	}

}
