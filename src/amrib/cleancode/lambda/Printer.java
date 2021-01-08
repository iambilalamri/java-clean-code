package amrib.cleancode.lambda;

public interface Printer {

	void print(String message);

	default void printTwice(String message, int index) {
		System.out.println(message);
		System.out.println(message);
	}

}
