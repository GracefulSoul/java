package generic.wildcard.lower.bounded;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		addNumbers(new ArrayList<Number>());
	}
	
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

}
