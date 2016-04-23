package Trees;

import java.util.Stack;

public class SumToAParticularPath {
	
	
	
	boolean sumExits(Node root,int sum)
	{
		if(root==null)
			return (sum==0);
		else
		{
			//System.out.println(root.getKey());
			int subSum=sum-root.getKey();
			return (sumExits(root.getLeft(),subSum) || sumExits(root.getRight(),subSum));
			
		}
		
		
		
	}
	
	
	
	void traverserTreeWithREcursion(Node root)
	{
		Stack<Node> st=new Stack<Node>();
		
	
		
		while(true)
		{
			while(root!=null)
			{
				System.out.println(root.getKey());
		st.push(root);
				root=root.getLeft();
			}
			
			if(st.isEmpty())
				return;
			root=st.pop();
			
			root=root.getRight();
		
		}
		
	}
	
	
	
public static void main(String[] args) {
		
		TreeCreate tc=TreeCreate.treeCreate();
		
		SumToAParticularPath sp=new SumToAParticularPath();
		System.out.println(sp.sumExits(tc.root, 48));
		
		sp.traverserTreeWithREcursion(tc.root);
}

}
