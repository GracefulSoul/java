package generic.bounded.type.parameter;

import gracefulsoul.java.generic.Box;

public class Main {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(10));
		integerBox.inspect("some text"); // error: this is still String!
	}
	
	// The greater than operator (>) applies only to primitive types such as short, int, double, long, float, byte, and char.
	public static <T> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray) {
			if (e > elem) { // compiler error. 
				++count;
			}
		}
		return count;
	}
	
	// To fix the problem, use a type parameter bounded by the Comparable<T> interface. This is recursive type bound.
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray) {
			if (e.compareTo(elem) > 0) {
				++count;
			}
		}
		return count;
	}

}
