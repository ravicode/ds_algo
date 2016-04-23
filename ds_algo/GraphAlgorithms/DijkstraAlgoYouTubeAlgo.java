package GraphAlgorithms;

//tushar roy youtube video graph
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair
{
	Integer key;
	Character val;
	Pair(Character val,Integer key)
	{
		this.key=key;
		this.val=val;
	}
	
	public String toString()
	{
	
		return key+" " + val;
	}
}
public class DijkstraAlgoYouTubeAlgo {

	private static int graph[][] = { { 0, 5, 0, 9, 2,0 }, 
			                  { 5, 0, 2, 0, 0,0 },
                              { 0, 2, 0, 3, 0,0 }, 
                              { 9, 0, 3, 0, 0,2 }, 
                              { 2, 0, 0, 0, 0,3 },
                              { 0, 0, 0, 2, 3,0 }

};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HeapifyMinGeneric hp=new HeapifyMinGeneric();
  DijkstraAlgoYouTubeAlgo dj=new DijkstraAlgoYouTubeAlgo();	
  int dist[]=new int[6];

        Map<Character,Character> mapShortPath=new HashMap<Character,Character>();
		Map<Character,Integer> extractedMap = new HashMap<Character,Integer>();
		extractedMap.put('A',0);
		
		extractedMap.put('B',Integer.MAX_VALUE);
		extractedMap.put('C',Integer.MAX_VALUE);
		
		extractedMap.put('D',Integer.MAX_VALUE);
		extractedMap.put('E',Integer.MAX_VALUE);
		
		extractedMap.put('F',Integer.MAX_VALUE);
		
		
	
		Pair[] arr=null;
		for(int j=0;j<graph.length;j++)
		{
		arr = new Pair[extractedMap.size()];
		int i=0;
		for (Map.Entry<Character,Integer> entr:extractedMap.entrySet())
		{
			arr[i]=new Pair(entr.getKey(),entr.getValue());   //new array is created to take min frm heap , it can be optimized to just one array
			i++;
		}
		


Map<Character,Integer> positionCharMAp = new HashMap<Character,Integer>();
positionCharMAp.put('A',0);

positionCharMAp.put('B',1);
positionCharMAp.put('C',2);

positionCharMAp.put('D',3);
positionCharMAp.put('E',4);

positionCharMAp.put('F',5);



Pair extractedMinNode=  hp.printHeap(arr);
System.out.println("extracted="+extractedMinNode.val);
dist[positionCharMAp.get(extractedMinNode.val)]=extractedMap.get(extractedMinNode.val);
extractedMap.remove(extractedMinNode.val);

if(extractedMinNode.val=='A')
mapShortPath.put(extractedMinNode.val,null);


List<Integer> list=dj.adj(positionCharMAp.get(extractedMinNode.val));

char ch[]={'A','B','C','D','E','F'};
for(int k:list)
{
	
	if(extractedMap.containsKey(ch[k]) && extractedMap.get(ch[k])>dist[positionCharMAp.get(extractedMinNode.val)]+graph[positionCharMAp.get(extractedMinNode.val)][k])
	{
	
		extractedMap.put(ch[k],dist[positionCharMAp.get(extractedMinNode.val)]+graph[positionCharMAp.get(extractedMinNode.val)][k]);
		mapShortPath.put( ch[k],extractedMinNode.val);
	}
}

/*System.out.println("Main Min Map="+mp.entrySet());
System.out.println("Main Min Array="+Arrays.toString(arr));
*/
System.out.println("path Map="+mapShortPath.entrySet());
System.out.println("dis Array="+Arrays.toString(dist));

System.out.println("\n\n");
		}

		
		
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
