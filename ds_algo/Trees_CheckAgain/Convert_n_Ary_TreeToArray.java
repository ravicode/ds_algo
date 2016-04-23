package Trees_CheckAgain;
/*
Given a n-ary tree, Convert it into an array and return it. 
		Construct the same n-ary tree from that array again. 
		(DFS is better here as reconstruction is necessary) �
		
Push the root to a stack. �pop the stack.store the value of the root node and 
the number of children it has in the array.push all the children to a stack from 
right to left�.. do this until the stack becomes empty.. the array will have dfs along 
with the number of children of each node.

For reconstruction,pass �i� by reference( i is for iterating through the array) 
take the value at index 0 .. make it has root. increment i. for all the children of the
 root, 
recursively call the same function. return root. (I hope this works :P)

		 */


public class Convert_n_Ary_TreeToArray {

}
