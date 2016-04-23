package Trees;

/*Build a clone of a binary tree sent from a different machine*/

/*
 * 
 * node  *clone( root ) : 
   if (root == NULL ) : return root;

   //create new node and make it a copy of node pointed by root
   node *temp = (node *)malloc(sizeof(node)) ;
   temp->data = root-> data;    //copying data
   temp->left = clone(root -> left);    //cloning left child
   temp->right = clone(root -> right);  //cloning right child
   return temp;


This function will be called in main function by a call like:

Root_of_Clone = clone(Root_of_Old_Tree)
 */

public class CloneABinTreeSentToDiffMachine {

}
