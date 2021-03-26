package generic;

public class Box<T> {
	
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u) { // The parameter u is only allowed in classes that inherit Number.
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
	
}