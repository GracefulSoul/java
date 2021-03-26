package generic.type.erasure.nonreifiable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapPollutionExample {

	public static void main(String[] args) {
		List<String> stringListA = new ArrayList<String>();
		List<String> stringListB = new ArrayList<String>();

		ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
		ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
		List<List<String>> listOfStringLists = new ArrayList<List<String>>();
		// Type safety: A generic array of List<String> is created for a varargs parameter.
		ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
		ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
	}

}
