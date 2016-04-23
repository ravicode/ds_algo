package Trees;

/*Construct Full Binary Tree from given preorder and postorder traversalsGiven two arrays 
 that represent preorder and postorder traversals of a full binary tree, construct the binary 
 tree.

 A Full Binary Tree is a binary tree where every node has either 0 or 2 children

 */

/*It is not possible to construct a general Binary Tree from preorder and postorder 
 * traversals (See this). But if know that the Binary Tree is Full, we can construct 
 * the tree without ambiguity. Let us understand this with the help of following example.

 Let us consider the two given arrays as pre[] = {1, 2, 4, 8, 9, 5, 3, 6, 7} and 
 post[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};
 In pre[], the leftmost element is root of tree. Since the tree is full and array
 size is more than 1. The value next to 1 in pre[], must be left child of root. 
 So we know 1 is root and 2 is left child. How to find the all nodes in left subtree? 
 We know 2 is root of all nodes in left subtree. All nodes before 2 in post[] must be
 in left subtree. Now we know 1 is root, elements {8, 9, 4, 5, 2} are in left subtree,
 and the elements {6, 7, 3} are in right subtree. 

 */


//do it on copy  //do it
public class ConstructFullCompleteTreeWithPreOrdernPostOrderTra {

}
