package Trees;

//youtube tushar roy video  





class MinMax{
    int min;
    int max;
    boolean isBST;
    int size ;
    
    MinMax(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isBST = true;
        size = 0;
    }
}


public class FindLargestBST {

	 public  static int largestBST(Node root){
	        MinMax m = largest(root);
	        return m.size;
	    }
	    
	    private static MinMax largest(Node root){
	        //if root is null return min as Integer.MAX and max as Integer.MIN 
	        if(root == null){
	            return new MinMax();
	        }
	        
	        //postorder traversal of tree. First visit left and right then
	        //use information of left and right to calculate largest BST.
	        MinMax leftMinMax = largest(root.getLeft());
	        MinMax rightMinMax =largest(root.getRight());
	        
	        MinMax m = new MinMax();
	        
	        //if either of left or right subtree says its not BST or the data
	        //of this node is not greater/equal than max of left and less than min of right
	        //then subtree with this node as root will not be BST. 
	        //Return false and max size of left and right subtree to parent
	        if(leftMinMax.isBST == false || rightMinMax.isBST == false || (leftMinMax.max > root.getKey() || rightMinMax.min <= root.getKey())){
	            m.isBST = false;
	            m.size = Math.max(leftMinMax.size, rightMinMax.size);
	            return m;
	        }
	        
	        //if we reach this point means subtree with this node as root is BST.
	        //Set isBST as true. Then set size as size of left + size of right + 1.
	        //Set min and max to be returned to parent.
	        m.isBST = true;
	        m.size = leftMinMax.size + rightMinMax.size + 1;
	     
	        //if root.left is null then set root.data as min else
	        //take min of left side as min
	        m.min = root.getLeft() != null ? leftMinMax.min : root.getKey();
	  
	        //if root.right is null then set root.data as max else
	        //take max of right side as max.
	        m.max = root.getRight() != null ? rightMinMax.max : root.getKey();
	   
	        return m;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node d = new Node(50);
		Node l = new Node(30);
		Node ll = new Node(5);
		Node lr = new Node(20);

		Node r = new Node(60);
		Node rl = new Node(45);
		Node rr = new Node(70);
		Node rrl = new Node(65);
		Node rrr = new Node(80);

		d.setLeft(l);
		l.setLeft(ll);
		l.setRight(lr);

		d.setRight(r);
		r.setLeft(rl);
		r.setRight(rr);
		rr.setLeft(rrl);
		rr.setRight(rrr);
		
		//FindLargestBST lb=new FindLargestBST();
		int largestBSTSize =largestBST(d);
		 System.out.println("Size of largest BST  is " + largestBSTSize);
		//largest(d);
		
	}

	
}
