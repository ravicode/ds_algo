package GraphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Heap.HeapifyMin;

class Node {
	int priority;
	char value;

	public Node(char value, int priority) {
		this.value = value;
		this.priority = priority;
	}

}

public class DijkstrasAlgo {

	private int graph[][] = { { 0, 4, 1, 0, 0 }, 
							  { 0, 0, 0, 0, 4 },
			                  { 0, 2, 0, 4, 0 }, 
			                  { 0, 0, 0, 0, 4 }, 
			                  { 0, 0, 0, 0, 0 }

	};

	public static void main(String[] args) {
		DijkstrasAlgo sa = new DijkstrasAlgo();
		sa.UnweightedShortedPath(sa.graph, 0); //
	}

	void UnweightedShortedPath(int graph[][], int s) {

		HeapifyMin pq = new HeapifyMin(5);
		int dis[] = new int[5];
		int v;
		pq.insertHeap(s, ""); // "" inserting a node first time

		for (int i = 0; i < graph.length; i++)
			dis[i] = -1;
		dis[s] = 0;
		int d = 0;
		while (!pq.isEmpty()) {

			v = pq.deleteMin();
			int p = 0;
			for (int i = 0; i < 5; i++) {
				if (v == dis[i]) {
					p = i;
					break;
				}
			}

			for (int i : adj(p)) {
				d = dis[p] + graph[p][i];
				if (dis[i] == -1) {
					dis[i] = d;

					pq.insertHeap(dis[i], "");
				}
				if (dis[i] > d) {

					pq.insertHeap(d, "u"); // it inserts the node removed
											// earlier // inserting a node again

					// pq.updateHeap(dis[i], d);
					dis[i] = d;

				}
			}
		}

		System.out.println(Arrays.toString(dis));

	}

	List<Integer> list;

	List<Integer> adj(int node) {
		list = new ArrayList<Integer>();

		for (int i = 0; i < graph.length; i++) {
			if (graph[node][i] != 0)
				list.add(i);
		}

		return list;
	}

}
