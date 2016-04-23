package Trees;

/*Print ancestors of a given binary tree node without recursion
 * Given a Binary Tree and a key, write a function that prints all the ancestors of the key 
 * in the given binary tree.

For example, consider the following Binary Tree

            1
        /       \
       2         3
     /   \     /   \
    4     5    6    7 
   /       \       /
  8         9     10  Following are different input keys and their ancestors in the above
   tree 

Input Key    List of Ancestors 
-------------------------
 1            
 2            1
 3            1
 4            2 1
 5            2 1
 6            3 1
 7            3 1
 8            4 2 1
 9            5 2 1
10            7 3 1
Recursive solution for this problem is discussed here.
It is clear that we need to use a stack based iterative traversal of the Binary Tree.
 The idea is to have all ancestors in stack when we reach the node with given key.
  Once we reach the key, all we have to do is, print contents of stack.
How to get all ancestors in stack when we reach the given node?
 We can traverse all nodes in Postorder way. If we take a closer look at the 
 recursive postorder traversal, we can easily observe that, when recursive
  function is called for a node, the recursion call stack contains ancestors 
  of the node. So idea is do iterative Postorder traversal and stop the traversal
   when we reach the desired node. 

*/

public class PrintAncestorsOfaNodeWithoutRecursion {

}
