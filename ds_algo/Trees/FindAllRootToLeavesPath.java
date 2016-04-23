package Trees;

public class FindAllRootToLeavesPath {
	
	static void findRootToLeafPaths(Node r,int []path,int pathLen)
	{
		//System.out.println(r);
		if(r==null)
			return;
		
		path[pathLen++]=r.getKey();
		
		if(r.getLeft()==null && r.getRight()==null)
			print(path);
		else
		{
		findRootToLeafPaths( r.getLeft(),path,pathLen);
		//System.out.println(r.getKey());
		findRootToLeafPaths( r.getRight(),path,pathLen);
		
		}
		
	}
	
	private static  void print(int []path)
	{
		System.out.println();
		for(int i:path)
			System.out.print(i + "  ");
	}
	
	public static void main(String[] args) {
		
		Node r=Tree.TreeCreate();
		int path[]=new int[5];
		int pathLen=0;
		findRootToLeafPaths(r,path,pathLen);
	}

}
