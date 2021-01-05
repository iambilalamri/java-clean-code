package amrib.cleancode.exception;

import java.io.IOException;

public class ThrowExceptionDemo {

	private static float balance = 1000;

	public static void deposit(float value) {
		if (value <= 0) {
			throw new IllegalArgumentException();
		}
	}

	public static void withDraw(float value) {
		if (value >= 10000) {
			throw new IllegalArgumentException("The amount is too BIG");
		}
	}

	public static void withDrawn(float value) throws IOException {
		if (value >= 10000) {
			throw new IOException();
		}
	}

	public static void refund(float value) throws InsufficientFundsException {
		if (value > balance)
			throw new InsufficientFundsException();
	}

	public static void main(String[] args) {
		// deposit(-1);
		// withDraw(10000000);
		try {
			refund(1000000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
