package generic.type.erasure.types;

/*
public class ComparableNode<T extends Comparable<T>> {

	private T data;
	private ComparableNode<T> next;

	public ComparableNode(T data, ComparableNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() { return data; }
	// ...

}
*/
// The Java compiler replaces the bounded type parameter T with the first bound class, Comparable.
public class ComparableNode {

	private Comparable data;
	private ComparableNode next;

	public ComparableNode(Comparable data, ComparableNode next) {
		this.data = data;
		this.next = next;
	}

	public Comparable getData() { return data; }
	// ...

}
