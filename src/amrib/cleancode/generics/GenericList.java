package amrib.cleancode.generics;

public class GenericList<T> {

	/**
	 * T could not be a primitive type but wrapper or object.
	 */
	private T[] items = (T[]) new Object[10];
	private int count;

	public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}

}
