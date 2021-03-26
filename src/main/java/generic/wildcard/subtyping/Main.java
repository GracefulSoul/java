package generic.wildcard.subtyping;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// It would be reasonable to write the following code.
		B b = new B();
		A a = b;
		// Class B is a subtype of class A if B extends A. This rule does not apply to generic types.
		List<B> lb = new ArrayList<>();
		List<A> la = lb; // compile-time error
		// In order to create a relationship between these classes so that the code can access Number's methods through List<Integer>'s elements, use an upper bounded wildcard:.
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList; // OK. List<? extends Integer> is a subtype of List<? extends Number>
	}

}
