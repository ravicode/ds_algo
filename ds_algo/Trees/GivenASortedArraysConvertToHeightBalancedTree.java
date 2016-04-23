package Trees;

import Trees.Node;

/*
Given a sorted array, 
convert it into a height balanced binary search tree.
 A height balanced tree is one in which for every node, 
 the height difference of left and right subtree is at most 1. 
 
 Node of binary tree was: 
	struct node
	{
		int data;
		node* left;
		node* right;
	};

Function to be implemented was: 
	node* binary_tree(int* ar, int len)
	{

	}
*/
public class GivenASortedArraysConvertToHeightBalancedTree {
	
	
	static Node BT(int arr[],int left,int right)
	{
		if(left>right)
			return null;
		Node newNode;//new Node();
		int mid;
		
		if(left==right)
		{
			newNode=new Node(arr[left]);
			newNode.setLeft(null);
			newNode.setRight(null);
		}
		else
		{
			mid=(left+right)/2;
			newNode=new Node(arr[mid]);
			newNode.setLeft(BT(arr,left,mid-1));
			newNode.setRight(BT(arr,mid+1,right));
			
		}
	
		return newNode;
	}
	
	
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.getLeft());
			System.out.println(root.getKey());
			inOrder(root.getRight());
		}
	}
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,7};
		
		Node newNode= BT(arr,0,arr.length-1);
		
		inOrder(newNode);
	}

}
