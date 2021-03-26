package generic.wildcard.unbounded;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Because for any concrete type A, List<A> is a subtype of List<?>, you can use printList to print a list of any type.
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);
	}
	
	public static void printList(List<?> list) {
		for (Object elem: list) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

}
