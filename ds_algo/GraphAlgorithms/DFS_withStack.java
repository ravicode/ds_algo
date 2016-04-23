package GraphAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFS_withStack {

	private int graph[][] = { { 0, 1, 0, 1 }, { 1, 0, 1, 1 }, { 0, 1, 0, 1 },
			{ 1, 1, 1, 0 }

	};

	private static boolean visited[];
	private Stack<Integer> st;

	public static void main(String[] args) {

		DFS_withStack d = new DFS_withStack();
		d.visited[0] = true;
		d.st.push(0);
		d.dfs(d.st);

		//System.out.println(Arrays.toString(visited));
	}

	public DFS_withStack() {
		visited = new boolean[4];
		st = new Stack<Integer>();

	}

	public void dfs(Stack<Integer> st) {
		// visited[node]=true;
		// for(int i:adj(node))
		while (!st.isEmpty()) {
			for (int v : adj(st.pop()))
				/*
				 * if(v==-1) { st.pop(); } else
				 */
				if (visited[v] == false) {
					visited[v] = true;
					// System.out.println(Arrays.toString(visited));
					st.push(v);
					// dfs(i);
				}
			System.out.println(Arrays.toString(visited));
		}
	}

	List<Integer> li = new ArrayList<Integer>();

	List<Integer> adj(int node) {

		for (int i = 0; i <= 3; i++) {
			if (graph[node][i] == 1)
				li.add(i);

		}

		return li;
	}

}
