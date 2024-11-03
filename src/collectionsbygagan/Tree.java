package collectionsbygagan;

import java.util.HashSet;

public class Tree<T> {

}

class Child<T> {
	T data;
	HashSet<Child<T>> childSet = new HashSet<Child<T>>();

	private void addChild(T data) {
		Child<T> child = new Child<T>();
		child.data = data;
		childSet.add(child);
	}
	private boolean removeChild(T data) {
		return childSet.remove(data);
	}
}