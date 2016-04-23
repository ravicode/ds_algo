package Trees;
import java.util.ArrayList;
import java.util.List;

//tushar roy ..youtube video

public class FindPathFromRootToLeafWithAGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node r = Tree();
		List<Node> li = new ArrayList<Node>();
		boolean IsSUmPresent = findSum(r, 26, li);
		System.out.println(IsSUmPresent);
		
		for(Node nd:li)
		{
			System.out.println(nd.getKey());
		}

	}

	static boolean findSum(Node r, int sum, List<Node> path) {
		if (r == null)
			return false;

		if (r.getLeft() == null & r.getRight() == null) {
			if (r.getKey() == sum) {
				path.add(r);
				return true;
			} else
				return false;
		}

		if (findSum(r.getLeft(), sum - r.getKey(), path)
				|| findSum(r.getRight(), sum - r.getKey(), path)) {
			path.add(r);
			return true;
		}
		return false;
	}

	static Node Tree() {
		Node r = new Node(10);
		Node rl = new Node(16);
		Node rr = new Node(5);
		// Node rll=new Node(2);

		Node rlr = new Node(-3);
		Node rrl = new Node(6);
		Node rrr = new Node(11);

		r.setLeft(rl);
		r.setRight(rr);

		rl.setRight(rlr);
		rr.setLeft(rrl);
		rr.setRight(rrr);
		return r;
	}
}
