package generic.type.erasure.methods;

public class Shape {
	// public static <T extends Shape> void draw(T shape) { /* ... */ }
	// The Java compiler replaces T with Shape.
	public static void draw(Shape shape) { /* ... */ }
}
