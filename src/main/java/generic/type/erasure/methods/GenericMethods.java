package generic.type.erasure.methods;

public class GenericMethods {

	// Counts the number of occurrences of elem in anArray.
	/*
	public static <T> int count(T[] anArray, T elem) {
		int cnt = 0;
		for (T e : anArray) {
			if (e.equals(elem)) {
				++cnt;
			}
		}
		return cnt;
	}
	*/
	// Because T is unbounded, the Java compiler replaces it with Object.
	public static int count(Object[] anArray, Object elem) {
		int cnt = 0;
		for (Object e : anArray) {
			if (e.equals(elem)) {
				++cnt;
			}
		}
		return cnt;
	}

}
