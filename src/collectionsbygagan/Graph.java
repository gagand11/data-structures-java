package collectionsbygagan;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {

	public static void main(String[] args) {
		Vertex root = createGraph();
		bfs(root);
		dfs(root);
	}

	public static void bfs(Vertex vertex) {
		Queue<Vertex> queue = new LinkedList<>();
		queue.add(vertex);
		vertex.visited = true;

		while (!queue.isEmpty()) {
			Vertex v = queue.remove();
			System.out.println("vertex visited : " + v.data);
			for (Vertex each : v.edges) {
				if (!each.visited) {
					queue.add(each);
					each.visited = true;
				}
			}
		}
	}

	public static void dfs(Vertex vertex) {

		if (vertex.visited)
			return;

		System.out.println("vertex visited = " + vertex.data);

		vertex.visited = true;

		for (Vertex each : vertex.edges)
			dfs(each);

	}

	public static Vertex createGraph() {
		Vertex root = new Vertex(100);
		Vertex levelA1 = new Vertex(1);
		Vertex levelA2 = new Vertex(2);
		Vertex levelA3 = new Vertex(3);

		root.addEdge(levelA1);
		root.addEdge(levelA2);
		root.addEdge(levelA3);

		Vertex levelB4 = new Vertex(4);
		Vertex levelB5 = new Vertex(5);
		Vertex levelB6 = new Vertex(6);

		levelA1.addEdge(levelB4);
		levelA2.addEdge(levelB5);
		levelA3.addEdge(levelB6);

		levelB4.addEdge(levelB5);
		levelB5.addEdge(levelA2);
		levelA2.addEdge(root);

		return root;
	}

}

class Vertex {
	int data;
	ArrayList<Vertex> edges;
	boolean visited = false;

	Vertex(int data) {
		this.data = data;
		edges = new ArrayList<Vertex>();
	}

	public void addEdge(Vertex v) {
		this.edges.add(v);
	}
}