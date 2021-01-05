package amrib.cleancode.exception;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		String path = "C:\\Users\\bilal\\eclipse-workspace\\clean-code\\src\\amrib\\cleancode\\exception\\file.txt";
		try (FileReader reader = new FileReader(path)) {
			int i;
			while ((i = reader.read()) != -1)
				System.out.print((char) i);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Could not read data.");
		}
	}

}
