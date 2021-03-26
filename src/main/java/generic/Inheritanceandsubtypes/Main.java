package generic.Inheritanceandsubtypes;

import gracefulsoul.java.generic.Box;

public class Main {

	public static void main(String[] args) {
		// Can assign an Integer to an Object, since Object is one of Integer's supertypes.
		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger; // OK
		// Integer is also a kind of Number.
		someMethod(new Integer(10)); // OK
		someMethod(new Double(10.1)); // OK
		// any subsequent invocation of add will be allowed if the argument is compatible with Number.
		Box<Number> box = new Box<Number>();
		box.set(new Integer(10)); // OK
		box.set(new Double(10.1)); // OK
	}
	
	public static void someMethod(Number n) { /* ... */ }

}
