package collectionsbygagan;

import collectionsbygagan.LinkedList;
import collectionsbygagan.Stack;
import collectionsbygagan.Queue;

public class Runner {

	public static void main(String[] args) {
		runStack();
	}

	public static void runList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("hello");
		list.add("kite");
		list.add("hii");
		list.add("heya");
//		for (int i = 0; i < list.getSize(); i++) {
//			System.out.println(list.get(i));
//		}

		LinkedList<Fruit> fruits = new LinkedList<Fruit>();
		fruits.add(new Fruit(4, "mango"));
		fruits.add(new Fruit(5, "orange"));
		fruits.add(new Fruit(8, "banana"));
		fruits.add(new Fruit(2, "litchi"));

		for (int i = 0; i < fruits.getSize(); i++)
			System.out.println(fruits.get(i).name);

		Fruit removal = fruits.removeFirst();
		Fruit removal2 = fruits.removeFirst();
		Fruit removal3 = fruits.removeFirst();
		System.out.println("removed fruit : " + removal.name);
		System.out.println("removed fruit : " + removal2.name);
		System.out.println("removed fruit : " + removal3.name);
		System.out.println("new start fruit : " + fruits.get(0).name);

		fruits.add(new Fruit(9, "pear"));
		fruits.add(new Fruit(10, "cherry"));

		for (int i = 0; i < fruits.getSize(); i++)
			System.out.println(fruits.get(i).name);

		Fruit remvlast = fruits.removeLast();
		System.out.println("last fruit removed : " + remvlast.name);

		for (int i = 0; i < fruits.getSize(); i++)
			System.out.println(fruits.get(i).name);

		Fruit remvlast1 = fruits.removeLast();
		System.out.println("last fruit removed : " + remvlast1.name);

		for (int i = 0; i < fruits.getSize(); i++)
			System.out.println(fruits.get(i).name);

		Fruit remvlast2 = fruits.removeLast();
		System.out.println("last fruit removed : " + remvlast2.name);

		for (int i = 0; i < fruits.getSize(); i++)
			System.out.println(fruits.get(i).name);
	}

	public static void runStack() {
		Stack<Fruit> stack = new Stack<Fruit>();
		stack.push(new Fruit(4, "mango"));
		stack.push(new Fruit(5, "plum"));
		stack.push(new Fruit(6, "apple"));
		stack.push(new Fruit(7, "banana"));
		System.out.println(stack.peek().name);
		stack.pop();
		System.out.println(stack.peek().name);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(new Fruit(4, "mango"));
		System.out.println(stack.peek().name);
	}

	public static void runQueue() {
		Queue<Fruit> queue = new Queue<Fruit>();
		queue.enqueue(new Fruit(4, "mango"));
		queue.enqueue(new Fruit(5, "banana"));
		queue.enqueue(new Fruit(6, "apple"));
		System.out.println(queue.peek());
		queue.dequeue();
		System.out.println(queue.peek());
		queue.dequeue();
		System.out.println(queue.peek());
		queue.dequeue();
		System.out.println(queue.peek());
	}

}

class Fruit {
	int size;
	String name;

	Fruit(int size, String name) {
		this.size = size;
		this.name = name;
	}
}
