package Trees;

import java.util.Stack;



public class SpiralZigZagTraversalOfBST_1stWay {
	
	public static  void spiralZigZagTraversal(Node node)
	{
		Stack<Node> stack1 = new Stack<Node>();    
		Stack<Node> stack2 = new Stack<Node>();
		
		stack1.push(node);
	while(!stack1.isEmpty() )	
	{
		System.out.println();
		while(!stack1.isEmpty())
		{
			 node=stack1.pop();
			System.out.print(node.getKey()+" ");
			if(node.getLeft()!=null)
				stack2.push(node.getLeft());
			if(node.getRight()!=null)
				stack2.push(node.getRight());
			
		}
		
		System.out.println();
		while(!stack2.isEmpty())
		{
			node=stack2.pop();
			System.out.print(node.getKey()+" ");
			if(node.getRight()!=null)
				stack1.push(node.getRight());
			if(node.getLeft()!=null)
				stack1.push(node.getLeft());
			
		}
		
	}
		
		
		
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate1();
		spiralZigZagTraversal(tc.root);
	}

}


