package Trees;
//set azn_100
import Trees.Node;
import Queue.QueueImplNode;
import Trees.TreeCreate;





/*1.) Given a binary tree as below 

  A
/    \
B	  C
/    \
D      E
/     / 
  \
F    G    H 

Convert the structure of the tree like a left aligned tree whose each 
node contains a down pointer and a right pointer and looks like the below tree.. 

A
|
B � C
|
D�E
|
F�G � H*/

public class ConvertBinTreeStructure {

	static void convertTree(Node root)
	{
		QueueImplNode<Node> q=new QueueImplNode<Node>(20);
		try
		{
		q.enque(root);
		
		while(!q.isEmpty())
		{
			Node temp=q.deque();
			
			if(temp.getLeft()!=null)
			{
				q.enque(temp.getLeft());
				temp.getLeft().setRight(temp.getRight());
			}
			
			if(temp.getRight()!=null)
			{
				q.enque(temp.getRight());
				temp.setRight(null);
			}
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		tc.postOrderWithoutRecursion(tc.root);
		//convertTree(tc.root);
		//tc.inOrderWithoutRecursion(tc.root);
	}
}
