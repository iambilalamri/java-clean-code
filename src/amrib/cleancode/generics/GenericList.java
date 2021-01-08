package amrib.cleancode.generics;

public class GenericList<T> {
	// T extends Number
	// & Cloneable
	private T[] items = (T[]) new Object[10];
	private int count;

	public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}

}
