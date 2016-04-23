package GraphAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {

	private int graph[][] = {   { 0, 1, 0, 1 }, 
								{ 1, 0, 1, 1 }, 
								{ 0, 1, 0, 1 },
								{ 1, 1, 1, 0 }

	};

	private boolean visited[];

	public static void main(String[] args) {

		DFS d = new DFS();
		d.visited[0] = true;
		d.dfs(0);

		/*for (boolean b : d.visited)
			System.out.println(b);*/
	}

	public DFS() {
		visited = new boolean[4];

	}

	public void dfs(int node) {
		// visited[node]=true;
		for (int i : adj(node)) {
			if (visited[i] == false) {
				visited[i] = true;
				
				dfs(i);
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
