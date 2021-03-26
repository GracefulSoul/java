package generic.wildcard.upper.bounded;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Using a list of Integer objects, prints sum = 6.0.
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
		// A list of Double values can use the same sumOfList method. The following code prints sum = 7.0.
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
	}
	
	public static void process(List<? extends Foo> list) {
		for (Foo elem : list) {
			// ...
		}
	}
	
	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list) {
			s += n.doubleValue();
		}
		return s;
	}
	
}
