package GraphAlgorithms;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShortestPathAlgorithm {
	
	private int graph[][] =
		{   { 0, 1, 0, 1, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 1, 0, 0 }, 
			{ 1, 0, 0, 0, 0, 1, 0 },
			{ 0, 0, 0, 0, 0, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 1, 0 }

};

	public static void main(String[] args) {
		ShortestPathAlgorithm sa=new ShortestPathAlgorithm();
		sa.UnweightedShortedPath(sa.graph, 2);
	}
	void UnweightedShortedPath(int graph[][],int s)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int dis[]=new int[7];
		int v,w;
		arr.add(s);
		
		for(int i=0;i<graph.length;i++)
			dis[i]=-1;
		dis[s]=0;
		
		while(!arr.isEmpty())
		{
			v=arr.remove(0);
			
			for(int i:adj(v))
			{
				if(dis[i]==-1)
				{
					dis[i]=dis[v]+1;
					arr.add(i);
				}}	}
			System.out.println(Arrays.toString(dis));
			}
	List<Integer> list;
	List<Integer> adj(int node)
	{
		 list=new ArrayList<Integer>();
		
		for(int i=0;i<graph.length;i++)
		{
			if(graph[node][i]==1)
				list.add(i);
		}
		
		return list;
	}
	
}
