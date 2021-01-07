package amrib.cleancode.generics;

public class Utils {

//	public static int max(int first, int second) {
//		return (first > second) ? first : second;
//	}
	/**
	 * Generic Function
	 * 
	 * @param <T>
	 * @param first
	 * @param second
	 * @return
	 */
	public static <T extends Comparable<T>> T max(T first, T second) {
		return (first.compareTo(second) < 0) ? second : first;
	}

	public static <K, V> void print(K key, V value) {
		System.out.println(key + "=" + value);
	}

	// Avec le mot cle extends, on peut juste lire de la liste GenericList
	// Avec le mot cle super, on peut juste ecrire dans la liste GenericList
	public static void printUsers(GenericList<? super User> users) {
		GenericList<Object> temp = new GenericList<>();
		Object x = users.get(0);
	}
}
