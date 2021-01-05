package amrib.cleancode.exception;

import java.io.IOException;

public class ThrowExceptionDemo {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// deposit(-1);
		withDraw(10000000);
	}

}
