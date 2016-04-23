package Trees;


import java.util.Stack;

import Queue.QueueImplNode;




public class TreeCreate {

	 public Node root;
	 public Node current;

	public void insert(int key) {

		Node nd = new Node(key);

		if (root == null) {
			root = nd;

		} else {
			current = root;
			while (true) {
				if (key < current.getKey()) {
					if (current.getLeft() != null) {
						current = current.getLeft();

					}

					else {
						current.setLeft(nd);
						return;
					}
				}

				if (key > current.getKey()) {
					if (current.getRight() != null) {
						current = current.getRight();

					}

					else {
						current.setRight(nd);
						return;
					}
				}
			}

		}
	}
	

	public void preOrder(Node mainRoot) {
		// Node localRoot=root;

		if (mainRoot != null) {
			System.out.print(mainRoot.getKey() + ",");
			preOrder(mainRoot.getLeft());

			preOrder(mainRoot.getRight());
		}
	}

	public void postOrder(Node mainRoot) {
		// Node localRoot=root;

		if (mainRoot != null) {
			//System.out.print(mainRoot.getKey() + ",");
			postOrder(mainRoot.getLeft());
			//System.out.print(mainRoot.getKey() + ",");
			postOrder(mainRoot.getRight());
			System.out.print(mainRoot.getKey() + ",");
		}
	}
	public void preOrderWithoutRecursion(Node root) {

		Stack<Node> s = new Stack<Node>();
		while (true) {
			while (root != null) {
				System.out.print(root.getKey() + ",");
				s.push(root);
				root = root.getLeft();
			}

			if (s.isEmpty())
				return;

			root = s.pop();
			root = root.getRight();
		}

	}

	public void levelOrderTraversal(Node root) {

		QueueImplNode<Node> s = new QueueImplNode<Node>(15); // use of generics
		try {
			s.enque(root);
			while (!s.isEmpty()) {
				Node temp = s.deque();

				System.out.print(temp.getKey() + ",");

				if (temp.getLeft() != null) {
					s.enque(temp.getLeft());
				}
				if (temp.getRight() != null) {
					s.enque(temp.getRight());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

	public static void inOrderWithoutRecursion(Node root) {

		Stack<Node> s = new Stack<Node>();
		while (true) {
			while (root != null) {

				s.push(root);
				root = root.getLeft();
			}

			if (s.isEmpty())
				return;

			root = s.pop();
			System.out.print(root.getKey() + ",");
			root = root.getRight();
		}

	}
	//just added a public flag variable in Node Class to 
	//check which node is visited already
	
	public  void postOrderWithoutRecursion(Node root){
	    //if(null == root) return;

	    Stack<Node> st = new Stack<Node>();
	    st.add(root);

	    while(true){
	    	if(st.isEmpty())
	    		return;
	        if(st.peek().flag==true){
	            System.out.print(st.pop().getKey() + "  ");
	        }else{

	        	Node temp = st.peek();
	            if(temp.getRight()!=null){
	                st.add(temp.getRight());
	            }

	            if(temp.getLeft() != null){
	                st.add(temp.getLeft());
	            }



	            temp.flag=true;


	        }
	    }
	}


	
	
	public void spiralZigZagTraversal(Node node) {
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();

		stack1.push(node);
		while (!stack1.isEmpty()) {
			while (!stack1.isEmpty()) {
				node = stack1.pop();
				System.out.println(node.getKey());
				if (node.getLeft() != null)
					stack2.push(node.getLeft());
				if (node.getRight() != null)
					stack2.push(node.getRight());

			}

			while (!stack2.isEmpty()) {
				node = stack2.pop();
				System.out.println(node.getKey());
				if (node.getRight() != null)
					stack1.push(node.getRight());
				if (node.getLeft() != null)
					stack1.push(node.getLeft());

			}

		}

	}
	
	public static Node search(int key, Node root) {
		if (root == null)
			return null;
		else {
			if (key == root.getKey())
				return root;
			else {
				if (key < root.getKey())
					return search(key, root.getLeft());
				else
					return search(key, root.getRight());
			}
		}

	}
	
	public static Node findMin(Node root)
	{
		if(root==null)
			return null;
		else
		{
			if(root.getLeft()==null)
				return root;
		
		else
		{
			return findMin(root.getLeft());
		}
		}
	}
	
	public static Node findmax(Node root)
	{
		if(root==null)
			return null;
		while(root.getRight()!=null)
			root=root.getRight();
		return root;
		
	}
	public static TreeCreate treeCreate() {
		TreeCreate tc = new TreeCreate();

		tc.insert(9);
		tc.insert(5);
		tc.insert(2);
		tc.insert(1);
		tc.insert(3);
		tc.insert(7);
		tc.insert(6);
		tc.insert(8);

		tc.insert(12);
		/*tc.insert(13);
		tc.insert(11);
		tc.insert(14);

		tc.insert(19);
		tc.insert(16);
		tc.insert(20);*/
		//tc.insert(0);
		return tc;
	}
	
	public static TreeCreate treeCreate1() {
		TreeCreate tc = new TreeCreate();

		tc.insert(9);
		tc.insert(5);
		tc.insert(2);
		tc.insert(1);
		tc.insert(3);
		tc.insert(7);
		tc.insert(6);
		tc.insert(8);

		tc.insert(15);
		tc.insert(13);
		tc.insert(11);
		tc.insert(14);

		tc.insert(19);
		tc.insert(16);
		tc.insert(20);
		tc.insert(21);
		return tc;
	}
	
	public static void main(String[] args) {
		TreeCreate tc=treeCreate1();
		
		tc.inOrderWithoutRecursion(tc.root);
	//System.out.println(tc.findmax(tc.root).getKey());
		
	}
}