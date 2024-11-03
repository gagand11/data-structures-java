package collectionsbygagan;

import collectionsbygagan.Node;

public class Stack<T> {
	private Node<T> top;

	public T pop() {
		if (top == null)
			return null;
		T obj = top.getT();
		top = top.next;
		return obj;
	}

	public boolean push(T obj) {
		Node<T> node = new Node<T>(obj);
		node.next = top;
		top = node;
		return true;
	}

	public T peek() {
		if (top == null)
			return null;
		return top.getT();
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}
}
