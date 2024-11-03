package collectionsbygagan;

public class Node<T> {
	private T obj;

	Node(T obj) {
		this.obj = obj;
	}

	Node<T> next;

	public T getT() {
		return obj;
	}
}
