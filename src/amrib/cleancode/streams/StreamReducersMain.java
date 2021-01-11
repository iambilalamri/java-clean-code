package amrib.cleancode.streams;

import java.util.Comparator;
import java.util.List;

public class StreamReducersMain {

	public static void main(String[] args) {
		reducer1();
	}

	// ################_REDUCERS_######################

	public static void reducer1() {
		var movieList = List.of(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));
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
