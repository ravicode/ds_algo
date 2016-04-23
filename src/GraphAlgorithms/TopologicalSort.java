package GraphAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

//TC= O(E+V)

public class TopologicalSort {

	private int graph[][] =
		{   { 0, 0,1,0, 0, 0,0,0 }, 
			{ 0, 0,1,1, 0, 0,0,0 }, 
			{ 0, 0,0,0, 1, 0,0,0 },
			{ 0, 0,0,0, 0, 1,0,0 },
			{ 0, 0,0,0, 0, 1,0,1},
			{ 0, 0,0,0, 0, 0,1,0},
			{ 0, 0,0,0, 0, 0,0,0},
			{ 0, 0,0,0, 0, 0,0,0}
			

};

private int indegree[]=new int[8];
private int topOrder[]=new int[8];


public void calculateIdegree()
{
	for(int i=0;i<8;i++)
	{
		for(int j=0;j<8;j++)
		{
			if(graph[i][j]==1)
				indegree[j]++;
		}

	}
	
	// System.out.println("indegree="+Arrays.toString(indegree));
}
	
	
public static void main(String[] args) {
	
	TopologicalSort ts=new TopologicalSort();
	ts.calculateIdegree();
	
	ts.topologicalSort();
	
}
	
void topologicalSort()
{
	Queue<Integer> arr = new java.util.LinkedList<Integer>();
	
	
	int counter;
	int v,w;
	counter=0;
	for(v=0;v<8;v++){
		if(indegree[v]==0)
			arr.add(v);
	}
		while(!arr.isEmpty())
		{
			v=arr.remove();
			topOrder[v]=counter++;
			
			for(int w1:adj(v))
			{
				if(--indegree[w1]==0)
					arr.add(w1);
			}
		
		
		
	}
	
	printPositonInSerial(topOrder);
	//System.out.println("order="+ Arrays.toString(topOrder));
}
	
	List<Integer> list;
	List<Integer> adj(int node)
	{
		 list=new ArrayList<Integer>();
		
		for(int i=0;i<=7;i++)
		{
			if(graph[node][i]==1)
				list.add(i);
		}
		
		return list;
	}

void printPositonInSerial(int topOrder[])
{
	
	char posArray[]=new char[]{'A','B','C','D','E','F','G','H'};
	
	for(int i=0;i<=7;i++)
	{
	System.out.print(posArray[topOrder[i]]);	
	}
	
	}
}

