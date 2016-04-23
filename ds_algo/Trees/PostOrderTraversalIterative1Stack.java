package Trees;

import java.util.Stack;



/*Iterative Postorder Traversal | Set 2 (Using One Stack) We have discussed a simple iterative postorder traversal using two stacks in the previous post. In this post, an approach with only one stack is discussed.

The idea is to move down to leftmost node using left pointer. While moving down, push root and root�s right child to stack. Once we reach leftmost node, print it if it doesn�t have a right child. If it has a right child, then change root so that the right child is processed before. 

Following is detailed algorithm.

1.1 Create an empty stack
2.1 Do following while root is not NULL
    a) Push root's right child and then root to stack.
    b) Set root as root's left child.
2.2 Pop an item from stack and set it as root.
    a) If the popped item has a right child and the right child 
       is at top of stack, then remove the right child from stack,
       push the root back and set root as root's right child.
    b) Else print root's data and set root as NULL.
2.3 Repeat steps 2.1 and 2.2 while stack is not empty.*/


public class PostOrderTraversalIterative1Stack {
	
	
	static void PostOrderIteration(Node root)
	{
		Stack<Node> st=new Stack<Node>();
		Node temp=null;
		while(root!=null)
		{
			if(root.getRight()!=null)
			st.push(root.getRight());
			st.push(root);
			root=root.getLeft();
			
		}
		
		root=st.pop();
		if(root.getRight()!=null)
		{
			st.pop();
			st.push(root);
			root.setRight(root);
			
		}
		else
		{
			System.out.println(root.getKey());
			root=null;
		}
		
	}
	
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		PostOrderIteration(tc.root);
	}

}
