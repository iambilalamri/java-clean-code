package amrib.cleancode.lambda;

import java.util.Collection;
import java.util.Collections;

public class Main {

	public Main(String message) {
		// TODO Auto-generated constructor stub
	}

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
		Printer p = message -> System.out.println(message);
		System.out.println("***********************");

		// ***********************************
		// greet(message -> System.out.println(message));
		greet(System.out::println);
		greet(Main::print);

		// ***********************************
		Main demo = new Main("");
		// greet(message -> demo.traitment(message));
		greet(demo::traitment);

		// ***********************************
		// greet(message -> new Main(message));
		greet(Main::new);
	}

	public static void print(String message) {
	}

	public void traitment(String type) {
	}

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	public static void main(String[] args) {
		show();
	}

}
