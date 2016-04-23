package Trees;
import java.util.HashMap;
import java.util.Map;


public class FindVerticalSum {

	static void findVertical(Node root,int column,Map<Integer, Integer> mp)
	{
		if(root==null)
			return;
		
		findVertical(root.getLeft(),column-1,mp);
		
		if(mp.containsKey(column))
		{
			mp.put(column,mp.get(column)+root.getKey());
		}else
			mp.put(column, root.getKey());
		findVertical(root.getRight(),column+1,mp);
		
		
	}
	
	public static void main(String[] args) {
		Node r = Tree.TreeCreate();
		Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
		findVertical(r,0,mp);
		System.out.println(mp.entrySet());
	}
}
