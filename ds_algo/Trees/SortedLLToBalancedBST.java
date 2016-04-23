package Trees;
//1. convert given sorted linked list to sorted array and do as follows.
// (o(n) ) + o(n)=  o(n)
public class SortedLLToBalancedBST {

	static Node createBST(int arr[],int left,int right)
	{
		Node nod=new Node();
		if(left>right)
			return null;
		
		if(left==right)
		{
			nod.setKey(arr[left]);
		nod.setLeft(null);
		nod.setRight(null);
			
		}
		else
		{
			int mid=(left+right)/2;
			nod.setKey(arr[mid]);
			nod.setLeft(createBST(arr,left,mid-1)	);
			nod.setRight(createBST(arr,mid+1,right)	);
			
		}
		
		
		return nod;
		
	}
	
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
	Node d=createBST(arr,0,arr.length-1);
	//System.out.println(d.getKey());
	//TreeCreate tc=TreeCreate.treeCreate();
	//tc.inOrderWithoutRecursion(d);
	
	}

}
