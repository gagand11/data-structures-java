package collectionsbygagan;

import java.util.Iterator;

import collectionsbygagan.Node;

public class LinkedList<T> {
	private int size = 0;
	private Node<T> start;
	private Node<T> last;

	public boolean add(T obj) {

		if (start == null) {
			start = new Node<T>(obj);
			last = start;
			size++;
			return true;
		}

		Node<T> node = new Node<T>(obj);
		last.next = node;
		last = node;
		size++;
		return true;
	}

	public String toString() {
		Node<T> temp = start;
		StringBuilder string = new StringBuilder();
		while (temp != null) {
			string.append(temp.toString());
			string.append(" -> ");
			temp = temp.next;
		}
		return string.toString();
	}

	public int getSize() {
		return size;
	}

	public T get(int k) {
		if (k >= size)
			return null;

		Node<T> temp = start;
		while (k > 0) {
			k--;
			temp = temp.next;
		}
		return temp.getT();
	}

	public T removeFirst() {
		if (start == null)
			return null;

		Node<T> first = start;
		start = start.next;
		size--;
		first.next = null;
		return first.getT();
	}

	public T removeLast() {

		if (start == null)
			return null;

		if (start.next == null) {
			Node<T> temp = start;
			start = null;
			size--;
			return temp.getT();
		}
		Node<T> travel = start;
		while (travel.next.next != null) {
			travel = travel.next;
		}
		last = travel;
		Node<T> removed = travel.next;
		travel.next = null;
		size--;

		return removed.getT();
	}
}