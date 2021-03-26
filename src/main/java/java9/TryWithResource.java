package java9;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {
		// Java7
		BufferedReader outerReader = new BufferedReader(new FileReader("test.txt"));
		try (BufferedReader innerReader = outerReader) {
			/* ... */
		}
		// Java9
		// Final or effectively final applied so that the reader can be used.
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		try (reader) {
			/* ... */
		}
	}

}
