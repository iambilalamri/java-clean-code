package amrib.cleancode.exception;

import java.io.FileReader;
import java.io.IOException;

public class TryCatchDemo {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("file.txt");
			int value = reader.read();
		} catch (IOException e) {
			System.out.println("Could not read data.");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
