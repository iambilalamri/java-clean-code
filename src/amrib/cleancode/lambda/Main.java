package amrib.cleancode.lambda;

public class Main {

	public static void show() {
		// Call implementation of interface
		greet(new ConsolePrinter());

		// use the anonyme function
		greet(new Printer() {
			@Override
			public void print(String message) {
				// TODO Auto-generated method stub
				System.out.println(message);
			}
		});

		// use lambda function
		greet(message -> System.out.println(message));
		Printer p = message -> System.out.println(message);
	}

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	public static void main(String[] args) {
		show();
	}

}
