package Trees;

//check whether given sum is a sum of any path of tree or not ?
public class CheckASumOfAParticularPath {

	
	boolean hasSumPath(Node root,int sum)
	{
		if (root==null || sum==0)
		{
			return (sum==0);
		}
		
		int subSum=sum-root.getKey();
		
return (hasSumPath(root.getLeft(),subSum)||hasSumPath(root.getRight(),subSum));
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		CheckASumOfAParticularPath check=new CheckASumOfAParticularPath();	
		System.out.println(check.hasSumPath(tc.root,14));
	}
}
