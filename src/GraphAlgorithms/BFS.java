package GraphAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class BFS {

	private int graph[][] = { { 0, 1, 0, 1 }, 
							  { 1, 0, 1, 1 },
							  { 0, 1, 0, 1 },
							  { 1, 1, 1, 0 }

	};

	private boolean visited[];

	public static void main(String[] args) {

		BFS d = new BFS();
		d.visited[0] = true;
		d.bfs(0);

		for (boolean b : d.visited)
			System.out.println(b);
	}

	public BFS() {
		visited = new boolean[4];

	}

Queue<Integer> arr = new java.util.LinkedList<Integer>();

	public void bfs(int node) {
		arr.add(node);
		while (!arr.isEmpty()) {
			int v1 =arr.remove();
			for (int i : adj(v1)) {
				if (visited[i] == false) {
					visited[i] = true;

					arr.add(i);
				}
			}
			System.out.println(Arrays.toString(visited));

		}
	}

	List<Integer> list;

	List<Integer> adj(int node) {

		list = new ArrayList<Integer>();

		for (int i = 0; i <= 3; i++) {
			if (graph[node][i] == 1)
				list.add(i);
		}

		return list;
	}

}
