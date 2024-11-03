package collectionsbygagan;

import collectionsbygagan.Node;

public class Queue<T> {

	private Node<T> front, rear;

	public boolean enqueue(T obj) {
		Node<T> node = new Node<T>(obj);
		if (front == null && rear == null) {
			front = node;
			rear = node;
			return true;
		} else {
			rear.next = node;
			rear = node;
			return true;
		}

	}

	public T dequeue() {
		if (front == null)
			return null;
		Node<T> node = front;
		front = front.next;
		return node.getT();
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		else
			return false;
	}

	public T peek() {
		if (front == null)
			return null;
		else
			return front.getT();
	}
}
