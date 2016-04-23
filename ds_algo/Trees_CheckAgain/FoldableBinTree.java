package Trees_CheckAgain;


/*Question: Given a binary tree, find out if the tree can be folded or not.

A tree can be folded if left and right subtrees of the tree are structure wise mirror image of each other. An empty tree is considered as foldable. 
*/
/*geeksforgeeks*/

/* Algorithm :: 
 * 
 * 1) If tree is empty, then return true.
2) Convert the left subtree to its mirror image
    mirror(root->left);  See this post 
3) Check if the structure of left subtree and right subtree is same
   and store the result.
    res = isStructSame(root->left, root->right); isStructSame()
        recursively compares structures of two subtrees and returns
        true if structures are same 
4) Revert the changes made in step (2) to get the original tree.
    mirror(root->left);
5) Return result res stored in step 2.*/


public class FoldableBinTree {

}
