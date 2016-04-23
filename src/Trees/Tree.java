package Trees;

public class Tree {
	
	Node TreeCr()
	{
		Node r=new Node(10);
		Node rl=new Node(11);
		Node rr=new Node(15);
		Node rll=new Node(2);
		
		Node rlr=new Node(23);
		Node rrl=new Node(25);
		Node rrr=new Node(17);
		
		r.setLeft(rl);
		r.setRight(rr);
		rl.setLeft(rll);
		rl.setRight(rlr);
		rr.setLeft(rrl);
		rr.setRight(rrr);
		return r;
	}
	
	static Node TreeCreate()
	{
		Tree  t=new Tree();
		Node n=t.TreeCr();
		return n;
	}
	
	
	static  void inorder(Node root)
	{
		
		if(root==null)
			return;
			else
			{
				if(root.getLeft()!=null &&  root.getRight()!=null)
				System.out.print("(");
				inorder(root.getLeft());
				System.out.print(root.getKey()+" ");
				inorder(root.getRight());
				if(root.getLeft()!=null &&  root.getRight()!=null)
				System.out.print(")");
			}
		
	}
	
	static int i=0;
	public static int[] inOrder(Node root,int arr[])
	{
		if(root!=null)
		{
			
			inOrder(root.getLeft(),arr);
			System.out.print(root.getKey()+" ");
			arr[i++]=root.getKey();
			inOrder(root.getRight(),arr);
		}
		
		return arr;
	}
	
	public static int count=0;
	public static int getSize(Node root)
	{
		if(root!=null)
		{
			
			getSize(root.getLeft());
			count++;
			getSize(root.getRight());
		}
		return count;
	}
	public static void main(String args[])
	{
		Node n= TreeCreate();
		inorder(n);
	}

}
