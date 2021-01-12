package amrib.cleancode.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReducersMain {

	private static List<Movie> movieList = List.of(new Movie("a", 10, Genre.THRILLER), new Movie("b", 20, Genre.ACTION),
			new Movie("c", 30, Genre.ACTION));

	public static void main(String[] args) {
		reducer1();
	}

	// ################_REDUCERS_######################
	public static void grouping() {
		// TYPE = Map<Genre, List<Movie>>
		var movies = movieList.stream().collect(Collectors.groupingBy(Movie::getGenre));
		var moviesSetUniq = movieList.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));
		var moviesCounting = movieList.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting())); // {THRILLER=1,
																														// ACTION=2}
		var moviesGrouping = movieList.stream().collect(
				Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));

		var moviesPartitionning1 = movieList.stream().collect(Collectors.partitioningBy(m -> m.getLikes() > 20));
		var moviesPartitionning2 = movieList.stream().collect(Collectors.partitioningBy(m -> m.getLikes() > 20,
				Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));

	}

	public static void collection() {

		var list1 = movieList.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toList());
		var set1 = movieList.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toSet());
		var map1 = movieList.stream().filter(m -> m.getLikes() > 10)
				.collect(Collectors.toMap(m -> m.getTitle(), Movie::getLikes));
		var sum = movieList.stream().filter(m -> m.getLikes() > 10).collect(Collectors.summingInt(Movie::getLikes));
		var report = movieList.stream().filter(m -> m.getLikes() > 10)
				.collect(Collectors.summarizingInt(Movie::getLikes));
		var join = movieList.stream().filter(m -> m.getLikes() > 10).map(m -> m.getTitle())
				.collect(Collectors.joining(" ,")); // b, c

	}

	public static void reducer2() {
		int identity = 0;

		Optional<Integer> optionalSum1 = movieList.stream().map(m -> m.getLikes()).reduce((a, b) -> a + b);
		Optional<Integer> optionalSum2 = movieList.stream().map(m -> m.getLikes()).reduce(Integer::sum);
		Integer sum3 = movieList.stream().map(m -> m.getLikes()).reduce(identity, Integer::sum);

		System.out.println(optionalSum1.get());
		System.out.println(optionalSum2.orElse(0));
		System.out.println(sum3);
	}

	public static void reducer1() {

		var length = movieList.stream().count();
		System.out.println("LENGTH:" + length);

		var isAnyMatch = movieList.stream().anyMatch(m -> m.getLikes() > 15);
		System.out.println("IS_ANY_MATCH: " + isAnyMatch); // TRUE

		var isAllMatch = movieList.stream().allMatch(m -> m.getLikes() > 15);
		System.out.println("IS_ALL_MATCH: " + isAllMatch); // FALSE

		var isNoneMatch = movieList.stream().noneMatch(m -> m.getLikes() > 30);
		System.out.println("IS_NONE_MATCH: " + isNoneMatch); // TRUE

		var findFirst = movieList.stream().findFirst().get();
		System.out.println("FIND_FIRST: " + findFirst.getTitle());

		var findAny = movieList.stream().findAny().get();
		System.out.println("FIND_ANY: " + findAny.getTitle());

		var max = movieList.stream().max(Comparator.comparing(Movie::getLikes)).get();
		System.out.println("MAX: " + max.getLikes() + " OF " + max.getTitle());

		var min = movieList.stream().min(Comparator.comparing(Movie::getLikes)).get();
		System.out.println("MIN: " + min.getLikes() + " OF " + min.getTitle());
	}

}
