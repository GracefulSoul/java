package generic.method;

public class Main {

	public static void main(String[] args) {
		// The complete syntax for invoking this method would be.
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		// The type has been explicitly provided, as shown in bold. Generally, this can be left out and the compiler will infer the type that is needed.
		same = Util.compare(p1, p2);
	}

}
